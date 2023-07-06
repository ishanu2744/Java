class Stack2{
    private int array[];
    private int size,sp=-1;
    Stack2(){
        array=new int[2];
        size=2;
    }
    Stack2(int size){
        array=new int[size];
        this.size=size;
    }
    void push(int val){
        if (sp==size-1){
            System.out.println("Push is not done deu to Stack overflow!!!");
        }
        else{
            sp++;
            array[sp]=val;
            System.out.println("Push is Successful!!!");
        }
    }
    void pop(){
        int val;
        if (sp==-1){
            System.out.println("Pop is not done deu to Stack underflow!!!");
        }
        else{
            val=array[sp];
            sp--;
            System.out.println("Pop is Successful!!!");
        }
    }
    void display(){
        if (sp<0){
            System.out.println("Display Can not done because The Array is empty!!!!");
        }
        else {
            for (int i = 0; i <= sp; i++) {
                System.out.print(" "+array[i]);
            }
        }
    }
}
public class Stack_cls {
    public static void main(String[] args) {
    Stack2 s1=new Stack2();
    Stack2 s2=new Stack2(5);
    s1.push(15);
    s1.push(20);
    s1.push(30);
    s1.pop();
    s1.pop();
    s1.pop();
    System.out.println();
    s1.display();
    }
}
