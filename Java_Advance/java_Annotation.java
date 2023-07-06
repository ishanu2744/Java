package Java_Advance;

class Sample{
    @Deprecated
    public void Add(int a,int b){
        int sum=a+b;
        System.out.println("Sum: "+sum);
    }
}
public class java_Annotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Sample s=new Sample();
        s.Add(4,5);
    }
}
