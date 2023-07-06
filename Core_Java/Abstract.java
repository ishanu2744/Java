abstract class Base{
    public abstract void Func1();
    public abstract void Func2();
}
class Derived extends Base{
    public void Func1(){
        System.out.println("This is 1st abstract method....");
    }
    public void Func2(){
        System.out.println("This is 2nd abstract method....");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Derived obj=new Derived();
        obj.Func1();
        obj.Func2();

    }
}
