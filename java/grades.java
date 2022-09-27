import java.util.Scanner;
public class grades {
  public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    int p,c,b;
    float avg=0;
    String name,gr="";
    System.out.println("enter name");
    name=in.nextLine();
    System.out.println("enter marks in physics,chemistry and biology");
    p=in.nextInt();
    c=in.nextInt();
    b=in.nextInt();
    avg=(p+c+b)/3;
    if(avg>=80)
    gr="distinction";
    if(avg>=60&&avg<80)
    gr="first division";
    if(avg>=45&&avg<80)
    gr="second division";
    if(avg>=40&&avg<45)
    gr="pass";
    if(avg<40)
    gr="promotion not granted";
System.out.println("name:"+name);
System.out.println("average marks:"+avg);
System.out.println("grade:"+gr);
}
}



