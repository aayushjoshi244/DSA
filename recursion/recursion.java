package recursion;

import java.util.Scanner;

public class recursion{
    // public static void printName(String name, int i, int n) {
    //     if (i ==n) return;
    //     System.out.println(name);
    //     printName(name, i+1, n);
    // }
    // public static void printNumber(int n,int i){
    //     if (i==n) return;
    //     i++;
    //     System.out.println(i);
    //     printNumber(n, i);
    // }
    // public static void reverseNumber(int n){
    //     int i = n;
    //     if (i<1) return;
    //     System.out.println(i);
    //     i--;
    //     reverseNumber(i);
    // }

    // public static void backtrackForward(int n) {
    //     if (n<1) return;
    //     backtrackForward(n-1);
    //     System.out.println(n);
    // }

    // public static void backtrackReverse(int n, int i){
    //     if (i>n) return;
    //     backtrackReverse(n, i+1);
    //     System.out.println(i);
    // }

    // public static void paraSum(int n, int sum) {
    //     if (n==0) {
    //         System.out.println(sum);
    //         return;
    //     }
    //     paraSum(n-1, sum+n);
    // }

    // public static int funSum(int n) {
    //     if (n==0) {
    //         return 0;
    //     }
    //     return n + funSum(n-1);
    // }

    // public static int factorial(int i) {
    //     if (i==0) {
    //         return 1;
    //     }
    //     return i * factorial(i-1);
    // }

    public static int factorial(int n, int fact) {
        if (n==0) {
            return fact;
        }
        return factorial(n-1, fact*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n = sc.nextInt();
        System.out.println(factorial(n, 1));
    }
}