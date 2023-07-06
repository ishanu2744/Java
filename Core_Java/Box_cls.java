import java.util.Scanner;
class Box{
    private int Height,Breadth,Width;

    public void setHeight(int height) {
        Height = height;
    }
    public void setBreadth(int breadth) {
        Breadth = breadth;
    }
    public void setWidth(int width) {
        Width = width;
    }
    public int getHeight() {
        return Height;
    }
    public int getBreadth() {
        return Breadth;
    }
    public int getWidth() {
        return Width;
    }
    int getVolume(){
        int Vol=(getBreadth()*getHeight()*getWidth());
        return Vol;
    }
    int getArea(){
        int Area=2*((getWidth()*getBreadth())+(getBreadth()*getHeight())+(getHeight()*getWidth()));
        return Area;
    }
}
public class Box_cls {
    public static void main(String[] args) {
    Box B []=new Box[2];
        for (int i = 0; i < 2; i++) {
            B [i]=new Box();
        }
        int h1,b1,w1,h2,b2,w2;
        System.out.print("Enter Height,Width,Breadth of the Box 1:");
        Scanner sc=new Scanner(System.in);
        h1=sc.nextInt();
        b1=sc.nextInt();
        w1=sc.nextInt();
        B[0].setHeight(h1);
        B[0].setBreadth(b1);
        B[0].setWidth(w1);
        System.out.println();
        System.out.print("Enter Height,Width,Breadth of the Box 2:");
        h2=sc.nextInt();
        b2=sc.nextInt();
        w2=sc.nextInt();
        B[1].setHeight(h2);
        B[1].setBreadth(b2);
        B[1].setWidth(w2);
        for (int i = 0; i < 2; i++) {
            System.out.println("The Volume of Box "+i+" is:"+B[i].getVolume());
            System.out.println("The Area of Box "+i+" is:"+B[i].getArea());
        }
    }
}
