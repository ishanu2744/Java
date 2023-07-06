class phone{
    public void call(){
        System.out.println("Ringing.....");
    }
    public void SwitchON(){
        System.out.println("Turning On....");
    }
}
class Smartphone extends phone1 {
    public void camera(){
        System.out.println("Clicking Pictures.....");
    }
    public void music(){
        System.out.println("Playing music....");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        phone1 p=new Smartphone1();
        p.SwitchON();
        p.call();
    }
}
