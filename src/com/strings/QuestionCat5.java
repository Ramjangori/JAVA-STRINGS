package com.strings;

/*
 * Category 5: Special Object & null Based Questions
 */
public class QuestionCat5 {

    public static void main(String[] args) {

        // ===============================
        // Q1: null Reference Comparison
        // ===============================
        String s1 = null;
        String s2 = null;

        System.out.println("Q1 (null == null): " + (s1 == s2));  // true


        // ===============================
        // Q2: null vs Literal
        // ===============================
        String s3 = null;
        String s4 = "java";

        System.out.println("Q2 (null == literal): " + (s3 == s4));  // false


        // ===============================
        // Q3: String vs StringBuilder
        // ===============================
        String s5 = "java";
        StringBuilder s6 = new StringBuilder("java");

        // System.out.println(s5 == s6);   // ❌ Compilation Error (Different Types)
        System.out.println("Q3 (.equals): " + s5.equals(s6));  // false


        // ===============================
        // Q4: Object Reference with String
        // ===============================
        Object obj = "Java";
        String s7 = "Java";

        System.out.println("Q4 (Object == String): " + (obj == s7));  // true
    }
}
