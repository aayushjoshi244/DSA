package recursion;

import java.util.Collections;
import java.util.Scanner;

public class rarray {
    public static void reverseArray(int arr[], int i, int r) {
        if (i>=r) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        reverseArray( arr, i+1, r-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array:-");
        int arr[] = new int[10];
        for (int j=0; j<10; j++){
            arr[j] = sc.nextInt();
        }
        for (int j=0; j<10; j++){
            System.out.print(arr[j]+",");
        }
        System.out.println();
        reverseArray(arr, 0, arr.length - 1);
        for (int j=0; j<10; j++){
            System.out.print(arr[j]+",");
        }
    }
}