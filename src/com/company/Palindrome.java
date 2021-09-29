package com.company;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " " + isPalindrome(s));
        }
    }
    public static String reverseString(String str) { // Переворот строки
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    public static boolean isPalindrome(String s){ // Сравнение с предыдущим значением
        String s1 = reverseString(s);
        return s1.equals(s);
    }
}