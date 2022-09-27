import java.util.*;


public class sumofarray {
    public static void main(String args[]) {
        int arr[]=new int[5],sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements of array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        for( int i=0;i<5;i++){
            System.out.println("the elements of array\n"+arr[i]);
        }
            System.out.println("the sum of array"+sum);
            sc.close();

        
        
    }
    
}
