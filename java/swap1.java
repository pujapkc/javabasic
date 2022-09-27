import java.util.*;
public class swap1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter two numbers for swapping");
        a=sc.nextInt();
        b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the first  swapped numbers is "+a);
        System.out.println("the second swapped  number is"+b);
        sc.close();

    }
    
}
