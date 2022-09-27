  import java.util.*;
  
  
  public class multiplicationtable {
    public static void main(String args[]){
        
        try (Scanner s = new Scanner(System.in)) {
          int n,i;
          System.out.println("enter the value of n");
          n=s.nextInt();
          for(i=1;i<=10;i++)
          System.out.printf("%d * %d=%d\n",n,i,n*i);
          //System.out.println("");
          s.close();
        } 
    }
      
    
}
