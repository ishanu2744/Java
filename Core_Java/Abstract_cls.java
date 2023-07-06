abstract class Pen{
    abstract protected void Write();
    abstract protected void Refill();
}
class FountainPen extends Pen{
    protected void Write(){
        System.out.println("Writing with Fountain Pen....");
    }
    protected void Refill(){
        System.out.println("Refilling.....");
    }
}
public class Abstract_cls {
    public static void main(String[] args) {
    FountainPen F1=new FountainPen();
    F1.Write();
    F1.Refill();
    }
}
