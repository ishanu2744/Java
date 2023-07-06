import java.util.Scanner;
import static java.lang.System.exit;

class stack{
    protected int array[];
    private int size;
    stack(){
        size=2;
        array=new int[size];
    }
    stack(int size){
        this.size=size;
        array=new int[size];
    }
    int getSize(){
        return size;
    }
}
class operation extends stack{
    private int sp=-1;
    operation(){
        super();
    }
    operation(int size){
        super(size);
    }
    void push(int value){
        if (sp==getSize()-1){
            System.out.println("Push is not done deu to Stack overflow!!!");
        }
        else{
            sp++;
            array[sp]=value;
            System.out.println("Push is Successful!!!");
        }
    }
    void pop(){
        int value;
        if (sp==-1){
            System.out.println("Pop is not done deu to Stack underflow!!!");
        }
        else{
            value=array[sp];
            sp--;
            System.out.println("Pop is Successful!!!");
        }
    }
    void Display(){
        for (int i = 0; i <= sp; i++) {
            System.out.print(" "+array[i]);
        }
    }
}
public class Stack_Inheritance {
    public static void main(String[] args) {
        operation op1=new operation(5);
        while (true){
            System.out.println("    1.Push    2.Pop    3.Display");
            System.out.print("Enter Option:");
            int op= new Scanner(System.in).nextInt();
            switch (op){
                case 1:
                    op1.push(15);
                    break;
                case 2:
                    op1.pop();
                    break;
                case 3:
                    op1.Display();
                    System.out.println();
                    break;
                default:
                    exit(0);
                    break;
            }
        }
    }
}
