package Search;

import java.util.Scanner;

public class Binary_Search {
    public static int Search(int arr[],int l,int u){
        System.out.print("Enter Data: ");
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        while (l<u){
            int mid=(l+u)/2;
            if (arr[mid]==val){
                return 0;
            }
            else if (val>arr[mid]){
                l=mid+1;
            }
            else{
                u=mid-1;
            }
        }
        return -1;
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
        int val=Search(arr,0,n-1);
        if (val!=0){
            System.out.println("Value Not Found!!!");
        }
        else {
            System.out.println("Value is Found!!!");
        }
    }
}
