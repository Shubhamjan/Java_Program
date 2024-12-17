package com.demo.test;

import java.util.Arrays;

public class ReverseVowels {

    public static void main(String[] args) {
        String st = "leetcode";
        char[] c = st.toCharArray();
        int front = 0;
        int rear = c.length - 1;

        while (front < rear) {
            // Move front pointer to the next vowel
            while (front < rear && !isVowel(c[front])) {
                front++;
            }

            // Move rear pointer to the previous vowel
            while (front < rear && !isVowel(c[rear])) {
                rear--;
            }

            // Swap the vowels
            char temp = c[front];
            c[front] = c[rear];
            c[rear] = temp;

            front++;
            rear--;
        }

        System.out.println("Original String: " + st);
        System.out.println("String after reversing vowels: " + new String(c));
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
