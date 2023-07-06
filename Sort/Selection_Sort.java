package Sort;

import java.util.Scanner;

public class Selection_Sort {
    public static void Selection(int arr[],int n){
        for (int i = 0; i < n-1; i++) {
           int min=i;
            for (int j = i+1; j < n; j++) {
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            if (min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
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
        Selection(arr,n);
    }
}
