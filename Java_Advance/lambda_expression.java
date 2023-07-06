package Java_Advance;

interface LambdaFun {
    void func(int a,int b);
}
public class lambda_expression {
    public static void main(String[] args) {
        LambdaFun obj=(a,b)->{
            System.out.println("This is Example of Lambda Expression: "+(a+b));
        };
        obj.func(5,6);
    }
}
