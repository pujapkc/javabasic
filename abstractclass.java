abstract class parent{
    public parent(){
        System.out.println("i am base constructor");
    }
    abstract public void greet();
}
class child extends parent{
    public void greet(){
        System.out.println("good morning");
    }

}
//this method cannot give any output
abstract class child1 extends parent{
    public void method(){
        System.out.println("i am good");
    }
}
public class abstractclass {
    public static void main(String args[]) {
        child n=new child();
        n.greet();
        
    }
}
