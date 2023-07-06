package Search;

import java.util.Scanner;

public class Linear_Search {
    public static void Search(int arr[],int n){
        System.out.print("Enter Data: ");
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==val){
                 count++;
            }
        }
        if(count!=0){
            System.out.println("Data is Found!!!");
        }
        else{
            System.out.println("Not Found!!");
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
        Search(arr,n);
    }
}
