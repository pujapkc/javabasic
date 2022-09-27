import java.util.*;
public class checkingelementinarray {
    public static void main(String args[]) {
        int arr[]=new int[5],i,element;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter elements of array");
            for( i=0;i<5;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("enter the element to be search");
            element=sc.nextInt();
               // System.out.println("the elements of array");
   //for(i=0;i<5;i++){
            //System.out.println(arr[i]);
            sc.close();
        }
            for(i=0;i<5;i++){
     if(arr[i]==element){
            System.out.println("the desired element is present in array");
     }}
    
}
        }
    



