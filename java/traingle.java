import java.util.*;

public class traingle {
 public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    int a,b,c;
    System.out.println("enter three side of a traingle");
    a=in.nextInt();
    b=in.nextInt();
    c=in.nextInt();
    if((a+b>c)&&(b+c>a)&&(c+a>b))
{
    System.out.println("traingle is possible");
    if((a==b)&&(b==c)&&(c==a))
    System.out.println("equilateral triangle");
    else if((a==b)||(b==c)||(c==a))
    System.out.println("tsosceles triangle");
    else if((a!=b)&&(b!=c)&&(c!=a))
    System.out.println("scalene triangle");
}
else
System.out.println("traingle not possible");
}
}
