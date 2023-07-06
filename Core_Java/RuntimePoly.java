class phone1 {
    public void call(){
        System.out.println("Ringing.....");
    }
    public void SwitchON(){
        System.out.println("Turning On....");
    }
}
interface camera{
     void click();
}
interface Data{
     void net();
}
interface music{
     void song();
}
class Smartphone1 extends phone1 implements camera,Data,music{
    public void click(){
        System.out.println("Taking Picture....");
    }
    public void net(){
        System.out.println("Data is On....");
    }
    public void song(){
        System.out.println("Song is Playing....");
    }
}
public class RuntimePoly{
    public static void main(String[] args) {
        camera cam=new Smartphone1();
        Data d1=new Smartphone1();
        music m1=new Smartphone1();
        phone1 p1=new Smartphone1();
        p1.SwitchON();
        p1.call();
        cam.click();
        d1.net();
        m1.song();
    }
}
