package java_basics;

import java.util.Scanner;

public class mini {
    public static void main(String[] args) {
        int j = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.print("Enter Your Guess:");
            i = sc.nextInt();
            if (i>j) {
                System.out.println("Your Guess is greater");
            }
            else if (i<j) {
                System.out.println("Your guess is smaller");
            }
            else if (i==-1){
                System.out.println("I know you are tired with this");
                System.out.println("The number was "+j);
                break;
            }
            else {
                System.out.println("Congratulations! You Guessed the correct which is " + i);
                break;
            }
        }
    }
}
