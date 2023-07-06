class Monkey{
    public void jump(){
        System.out.println("Jumping.....");
    }
    public void bite(){
        System.out.println("Monkeys can bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{     //Extends a class and implement interface
    @Override
    public void eat() {
        System.out.println("Eating rice...");
    }
    @Override
    public void sleep() {
        System.out.println("Good Night!!!!!");
    }
}
public class interface_As1 {
    public static void main(String[] args) {
        Human boy=new Human();
        boy.eat();
        boy.sleep();
    }
}
