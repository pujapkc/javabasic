import java.util.*;
public class swap {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,temp;
        System.out.println("enter two no to swap");
        
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("the values of a  before swapping= "+a);
        System.out.println("the values of b  before swapping= "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("the values of a  after swapping= "+a);
        System.out.println("the values of b  after swapping= "+b);

        sc.close();
    }
    
}
