public class useofclass {
    public static void main(String args[])
    {
       disp(100);
    }
    static void disp(int i)
    {
        if(i>=70)
    {
    System.out.println(i);
    disp(i-2);
    }}
}
