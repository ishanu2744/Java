class Base
{

    Base() {
        System.out.println("Base class Default COnstructor");
    }
    Base(int x)
    {
        System.out.println("Base Class Parameterized Constructor");
    }
}
class Child extends Base{
    Child(int x)
    {
        super(5);
        System.out.println("Child class Parameterized Constructor");
    }
   Child()
    {
        super();
        System.out.println("Child Class Default Constructor");
    }
}
class Simple
{
    public static void main(String[] args)
    {
        Child C1=new Child();
        Child C2=new Child(5);
    }
}