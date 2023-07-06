package Sort;

import java.util.Scanner;

public class Insertion_Sort {
    public static void Insertion(int arr[],int n){
        for (int i = 1; i < n; i++) {
           int temp=arr[i];
           int j=i-1;
           while(j>=0 && arr[j]>temp){
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=temp;
        }
        display(arr,n);
    }
    public static void display(int arr[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[10];
        System.out.print("Enter the size of array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter Array Data: ");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
       Insertion(arr,n);
    }
}
