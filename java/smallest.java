import java.util.Scanner;




public class smallest {
    
public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    int a,b,c;
    System.out.println("enter three numbers");
    a=in.nextInt();
    b=in.nextInt();
    c=in.nextInt();
    if(a<b)
    {
        if(b<c)
        System.out.println("the second smallest number:"+b);
        else
        System.out.println("The second smallest number:"+c);
    }
    if(b>c)
    {
        if(c<a)
        System.out.println("the second smallest:"+c);
        System.out.println("the second smallest number:"+a);
    }
    if(c<a)
    {
        if(a<b)
        System.out.println("the second smallest number:"+a);
        else
        System.out.println("the second smallest number:"+b);
    }
}
}

