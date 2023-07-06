class Person{
    private int Age;
    private String Weight,Height,Dob,Address;

    public void setAge(int age) {
        Age = age;
    }
    public void setWeight(String weight) {
        Weight = weight;
    }
    public void setHeight(String height) {
        Height = height;
    }
    public void setDob(String dob) {
        Dob = dob;
    }
    public void setAddress(String address) {
        Address = address;
    }

    public int getAge() {
        return Age;
    }
    public String getWeight() {
        return Weight;
    }
    public String getHeight() {
        return Height;
    }
    public String getDob() {
        return Dob;
    }
    public String getAddress() {
        return Address;
    }
}
class Employee extends Person{
    private int Salary;
    private String DateOfJoining;

    public int getSalary() {
        return Salary;
    }
    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getDateOfJoining() {
        return DateOfJoining;
    }
    public void setDateOfJoining(String dateOfJoining) {
        DateOfJoining = dateOfJoining;
    }
}
class Student extends Person{
    private int roll;
    private String[] ListOfSubjects;
    private int[] marks;
    private static int size=0;
    private static int size2=0;

    public void setRoll(int roll) {

        this.roll = roll;
    }
    public void setSubjectsMarks(String sub,int num){
            for ( int i =this.size; i >=this.size;) {
                size++;
                ListOfSubjects=new String[size];
                marks=new int[size];
                ListOfSubjects[i]=sub;
                marks[i]=num;
            }
    }
    public void showSubjectsMarks(){
        for ( int i =this.size2; i >=this.size2;) {
            size2++;
            System.out.println(ListOfSubjects[i]+":"+marks[i]);
        }
    }
    public void CalculateGrade(){

    }
}
class Technician extends Employee{

}
class Professor extends Employee{

}
public class Person_Details {
    public static void main(String[] args) {
        Student[] std=new Student[3];
        for (int i = 0; i < 3; i++) {
            std[i]=new Student();
        }
        std[0].setSubjectsMarks("Math",89);
        std[1].setSubjectsMarks("Physics",85);
        std[2].setSubjectsMarks("Computer",95);
        for (int i = 0; i < 3; i++) {
            std[i].showSubjectsMarks();
        }
        for (int i = 2; i >= 0; i--) {
            std[i].CalculateGrade();
        }
    }
}
