package Sort;

import java.util.Scanner;

public class Bubble_Sort {
    public static void BubbleSort(int arr[],int n){
       for (int i = 0; i < n-1; i++) {
           int count=0;
           for (int j = 0; j < n-1-i; j++) {
               if(arr[j]>arr[j+1]){
                   int temp=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;
                   count++;
               }
           }
           if(count==0){
               break;
           }
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
        BubbleSort(arr,n);
    }
}
