import java.util.Scanner;
import java.lang.String;

class Student1{
    private String Name;
    private int sub1,Sub2,Sub3;

    public int getSub1() {
        return sub1;
    }
    public void setSub1(int sub1) {
        this.sub1 = sub1;
    }
    public int getSub2() {
        return Sub2;
    }
    public void setSub2(int sub2) {
        this.Sub2 = sub2;
    }
    public int getSub3() {
        return Sub3;
    }
    public void setSub3(int sub3) {
        this.Sub3 = sub3;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    int Avg(){
        int Average=(getSub1()+getSub2()+getSub3())/3;
        return Average;
    }
    void Display(){
        System.out.println("The Student's Name is "+getName()+" and The Total Marks :"+(getSub1()+getSub2()+getSub3()));
        System.out.println("The Average Marks of the Student is:"+Avg());
    }
}
public class std_class {
    public static void main(String[] args) {
    Student1 s1=new Student1();
    Scanner sc=new Scanner(System.in);
        String Nm;
        System.out.print("Enter the Name of the Student:");
        Nm=sc.next();
        s1.setName(Nm);
        System.out.println();
        System.out.print("Enter the Marks of thee Subjects out of 100:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        s1.setSub1(n1);
        s1.setSub2(n2);
        s1.setSub3(n3);
        s1.Display();
    }
}
