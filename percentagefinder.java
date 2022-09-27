import java.util.*;

public class percentagefinder {
    public static void main(String args[]) {
        int m1,m2,m3,sum,percentage;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the marks of student\n");
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        sum=m1+m2+m3;
        percentage=sum/3;
        System.out.println("sum of marks =="+sum);
        System.out.println("percentage of student=="+percentage);
        s.close();


    }
    
}
