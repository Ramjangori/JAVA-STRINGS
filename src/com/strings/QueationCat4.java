package com.strings;

/*
 * Category 4: Concatenation Effect in Java Strings
 */
public class QueationCat4 {

    public static void main(String[] args) {

        // ===============================
        // Q1: Compile-Time Concatenation
        // ===============================
        String s1 = "java11";
        String s2 = "java" + 11;   // Resolved at compile time

        System.out.println("Q1 (==) : " + (s1 == s2));   // true


        // ===============================
        // Q2: Runtime Concatenation
        // ===============================
        String s3 = "Java11";
        String s4 = "Java";
        String s5 = s4 + 11;   // Happens at runtime → new object in Heap

        System.out.println("Q2 (==) : " + (s3 == s5));   // false


        // ===============================
        // Q3: Empty String Concatenation
        // ===============================
        String s6 = "java";
        String s7 = s6.concat("");  // No actual change

        System.out.println("Q3 (==) : " + (s6 == s7));   // true
    }
}
