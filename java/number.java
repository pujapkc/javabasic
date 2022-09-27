import java.util.*;

public class number{

    public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,b,sq,cb;
System.out.println("enterr two number");
a=in.nextInt();
b=in.nextInt();
if(a!=b)
{
    if(a<b)
{
    sq=a*a;
    cb=b*b*b;
}
else
{
    sq=b*b;
    cb=a*a*a;
}
System.out.println("the square of smaller number:"+sq);
System.out.println("the cube of greater number:"+cb);
}
else
System.out.println("both the number are equal");
in.close();
}
}


    