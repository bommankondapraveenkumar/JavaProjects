package org.example;

public class IsPalindrome {

    public static void main(String[] args) {
        System.out.print(isPalindrome("saas"));
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
