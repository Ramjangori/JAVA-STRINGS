package com.strings;

/*
 * Category 3: intern() Method Based Questions
 */
public class QuestionsCat3 {

    public static void main(String[] args) {

        // ===============================
        // Q1: new String + intern() vs Literal
        // ===============================
        String s1 = new String("Ramjan").intern();  // Moves reference to String Pool
        String s2 = "Ramjan";                       // Stored in String Pool

        System.out.println("Q1 (==) : " + (s1 == s2));   // true


        // ===============================
        // Q2: Two new Strings with intern()
        // ===============================
        String s3 = new String("java").intern();
        String s4 = new String("java").intern();

        System.out.println("Q2 (==) : " + (s3 == s4));   // true
    }
}
