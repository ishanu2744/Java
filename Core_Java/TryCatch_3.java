import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString() {
        return "Invalid Input...";
    }
    public String invalidOp(){
        return "Invalid Operator!!!";
    }
    @Override
    public String getMessage() {
        return "Cannot Divided by Zero!!!";
    }
}
public class TryCatch_3 {
    public static void main(String[] args) {
        System.out.println(".....Custom Calculator.....");
        Scanner sc=new Scanner(System.in);
        int a,b;
        char ch;
        System.out.print("Enter two number and operation: ");
        a= sc.nextInt();
        ch=sc.next().charAt(0);
        b= sc.nextInt();
        if((a>8000||a<0) || (b>8000||b<0)){
            try {
                throw new MyException();
            } catch (MyException e) {
                System.out.println(e.toString());
            }
        }
        else{
            if (ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                switch (ch){
                    case '+':
                        System.out.println("A + B: "+a+b);
                        break;
                    case '-':
                        int res=a-b;
                        System.out.println("A - B: "+res);
                        break;
                    case '*':
                        System.out.println("A * B: "+a*b);
                        break;
                    case '/':
                        if(b==0){
                            try {
                                throw new MyException();
                            } catch (MyException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            }
            else {
                try {
                    throw new MyException();
                }
                catch (MyException e){
                    System.out.println(e.invalidOp());
                }
            }
        }
    }
}