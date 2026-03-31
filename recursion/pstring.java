package recursion;

import java.util.Scanner;

public class pstring {
    public static boolean isPalindrome(String s, int l, int r){
        if (l>=r) {
            return true;
        }
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        return isPalindrome(s, l+1, r-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check:-"); 
        String s = sc.nextLine();
        boolean ans = isPalindrome(s, 0, s.length() - 1);
        if (ans) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }
    }
}
