import java.util.*;

public class calculation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,sum=0,sub;
        float prod,div;
        System.out.println("enter the two no");
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        sub=a-b;
        prod=a*b;
        div=a/b;
        System.out.println("the sum="+sum);
        System.out.println("the sub="+sub);
        System.out.println("the prod="+prod);
        System.out.println("the div="+div);
         sc.close();              
    }
    
}
