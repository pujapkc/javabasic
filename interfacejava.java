interface bicycle{
    int a=45;
    void applybrake();
    void speedup();
}
interface car{
    void horn();
    void push();
}
class avoncycle implements bicycle,car{
    public void applybrake(){
        System.out.println("take a brake");
    }
    public void speedup(){
        System.out.println("speeding....");
    }
     public void horn(){
        System.out.println("poo poo poo");
     }
     public void push(){
        System.out.println("pushing....");
     }
}


public class interfacejava {
    public static void main(String args[]) {
       avoncycle obj=new avoncycle();
       obj.horn();
       obj.speedup();
       System.out.println("the value of a  ="+obj.a); 
    }
}
