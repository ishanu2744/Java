import java.util.Random;
class Room {
    private int height, width, breadth;

    void Set_Data() {
        Random r = new Random();
        height = 1 + r.nextInt(10);
        breadth = 1 + r.nextInt(20);
        width = 1 + r.nextInt(15);
    }

    void Volume() {
        int vol = (height * width * breadth);
        System.out.println("Volume of the Room is :" + vol);
    }
}
class RoomDemo{
        RoomDemo(){
            Room r1=new Room();
            r1.Set_Data();
            r1.Volume();
        }
}
public class Hotel {
    public static void main(String[] args) {
        RoomDemo R1=new RoomDemo();
    }
}
