package java_basics;

import java.util.Scanner;

public class main {
    public static void printName(int o) {
        if (o == 100) {
            return;
        }
        System.out.println(o);
        o++;
        printName(o);
    }
    public static void main(String[] args) {
        // System.out.println("Price of pen is 10Rs and Notebook is 50Rs");
        // Scanner sc = new Scanner(System.in);
        // int cash = sc.nextInt();
        // if (cash<10) {
        //     System.out.println("Can't buy anything");
        //     System.out.println("get more cash");
        // }
        // else if (cash>10 && cash<50) {
        //     System.out.println("Can get 1 thing");
        // }
        // else {
        //     System.out.println("can get both the things");
        // }

        // Scanner sc = new Scanner(System.in);
        // int number = 0; 
        // do {
        //     System.out.print("Input Your Number");
        //     number = sc.nextInt();
        //     System.out.println(number);
        // } while (number >= 0);

        // System.out.println("The Game is Over");
        printName(0);
    }
}
