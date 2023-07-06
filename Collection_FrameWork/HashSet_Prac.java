package Collection_FrameWork;
import java.util.*;

public class HashSet_Prac {
    public static void Union(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println("Union:- "+set);
    }
    public static void Insertion(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    set.add(arr1[i]);
                }
            }
        }
        System.out.println("Insertion:- "+set);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of two Arrays:- ");
        n= sc.nextInt();
        int array1[]=new int[n];
        int array2[]=new int[n];
        System.out.print("Enter 1st Array elements:- ");
        for (int i = 0; i < n; i++) {
            array1[i]= sc.nextInt();
        }
        System.out.print("Enter 1st Array elements:- ");
        for (int i = 0; i < n; i++) {
            array2[i]= sc.nextInt();
        }
        Union(array1,array2);
        Insertion(array1,array2);
    }
}
