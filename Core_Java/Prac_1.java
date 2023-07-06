abstract class Shape{
    abstract public void draw();
    abstract public void erase();
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("Draw a Triangle....");
    }
    public void erase(){
        System.out.println("Erase The Triangle....");
    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("Draw a Square.....");
    }
    public void erase(){
        System.out.println("Erase The Square....");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Draw a Circle....");
    }
    public void erase(){
        System.out.println("Erase The Circle....");
    }
}
public class Prac_1 {
    public static void main(String[] args) {
        Shape T1=new Triangle();
        Shape S1=new Square();
        Shape C1=new Circle();
        T1.draw();
        T1.erase();
        S1.draw();
        S1.erase();
        C1.draw();
        C1.erase();
    }
}
