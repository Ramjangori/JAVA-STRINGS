package com.strings;

/*
 * Category 2: Case Sensitivity in Java Strings
 */
public class QuestionCat2 {

    public static void main(String[] args) {

        // ===============================
        // Q1: Case-Sensitive Comparison
        // ===============================
        String s1 = "Hello";
        String s2 = "hello";

        System.out.println("Q1 (==)            : " + (s1 == s2));          // false
        System.out.println("Q1 (.equals)       : " + s1.equals(s2));       // false


        // ===============================
        // Q2: Case-Insensitive Comparison
        // ===============================
        System.out.println("Q2 (.equalsIgnoreCase): " 
                + s1.equalsIgnoreCase(s2));                                // true


        // ===============================
        // Q3: Reference Comparison Only
        // ===============================
        System.out.println("Q3 (Reference ==)  : " + (s1 == s2));          // false
    }
}
