package Collection_FrameWork;

import java.util.*;

class Collection2_Exception extends Exception{
    @Override
    public String toString() {
        return "Invalid Input!!!";
    }
}
class Linked_List{
    private java.util.LinkedList<Integer> l1=new java.util.LinkedList<>();
    private java.util.LinkedList<Integer> l2=new java.util.LinkedList<>();

    public void AddElementsList1(int data){
        l1.add(data);
    }
    public void AddElementsList2(int data){
        l2.add(data);
    }
    public void addAllin_L1(){
        l1.addAll(l2);
        ShowList1();
    }
    public void addAllin_L2(){
        l2.addAll(l1);
        ShowList2();
    }
    public void ShowList1(){
        System.out.println("List1:- "+l1);
    }
    public void ShowList2(){
        System.out.println("List2:- "+l2);
    }
    public int getSizeL1(){
        return l1.size();
    }
    public int getSizeL2(){
        return l2.size();
    }
    public void SortList1(){
        Collections.sort(l1);
        System.out.println("Sorted List1:-"+l1);
    }
    public void SortList2(){
        Collections.sort(l2);
        System.out.println("Sorted List2:-"+l2);
    }
    public void SearchInList(int data){
        int flag=0;
        for (int i = 0; i < 5; i++) {
            if (data==l1.get(i) || data==l2.get(i)){
                flag=data;
                System.out.println("Data Founded!!!");
            }
        }
        if (flag!=data){
            System.out.println("Data is Not Found!!!!");
        }
    }
}
public class LinkedList {
    public static void main(String[] args) {
        Linked_List list= new Linked_List();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the elements of LinkedList1:");
        for (int i = 0; i < 5; i++) {
            int data=sc.nextInt();
            if (data<0 || data>500){
                try {
                    throw new Collection2_Exception();
                } catch (Collection2_Exception e) {
                    System.out.println(e.toString());
                }
            }
            else {
                list.AddElementsList1(data);
            }
        }
        System.out.print("Enter the elements of LinkedList2:");
        for (int i = 0; i < 5; i++) {
            int data=sc.nextInt();
            if (data<0 || data>500){
                try {
                    throw new Collection1_Exception();
                } catch (Collection1_Exception e) {
                    System.out.println(e.toString());
                }
            }
            else {
                list.AddElementsList2(data);
            }
        }
        list.ShowList1();
        list.ShowList2();
        System.out.println("Size of LinkedList1: "+list.getSizeL1());
        System.out.println("Size of LinkedList2: "+list.getSizeL2());
        list.addAllin_L1();
        list.addAllin_L2();
        list.SortList1();
        list.SortList2();
        System.out.print("Enter the data you want to Search:-");
        int search=sc.nextInt();
        list.SearchInList(search);
    }
}
