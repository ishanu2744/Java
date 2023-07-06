package Sort;

import java.util.Scanner;

public class Quick_Sort {
    public static void QuickSort(int arr[],int l,int u){
        if(l<u){
            int index=Partition(arr, l, u);
            QuickSort(arr,l,index-1);
            QuickSort(arr,index+1,u);
        }
    }
    public static int Partition(int arr[],int l,int u){
        int pivet=arr[l];
        int i=l+1;
        int j=u;
        while(i<j){
            while(arr[i]<=pivet){
                i++;
            }
            while(arr[j]>pivet){
                j--;
            }
            if (i<j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[l];
        arr[l]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void display(int arr[],int n){
        for (int i = 0; i <n; i++) {
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
        QuickSort(arr,0,n-1);
        display(arr,n);
    }
}
