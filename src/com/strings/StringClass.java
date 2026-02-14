package com.strings;

/*
==================================================
                STRING IN JAVA
          (Interview Level Notes - English)
==================================================

1) What is String?
------------------
- String is a class in Java.
- It is present in the java.lang package.
- It is used to store a sequence of characters.
- Example:
      String name = "Ramjan";

--------------------------------------------------

2) String is Immutable
----------------------
- Immutable means the object cannot be modified after it is created.
- Any modification operation creates a new object.
- The original object remains unchanged.

Example:
      String s = "Hello";
      s.concat(" World");

Here, the original string "Hello" is not changed.
A new object "Hello World" is created.

Why String is Immutable?
- Security (used in file paths, URLs, database credentials)
- Thread safety
- Performance optimization (String Constant Pool)
- HashCode caching

--------------------------------------------------

3) Ways to Create String in Java
---------------------------------

A) Using String Literal
-----------------------
      String s = "Ramjan";

- The object is created inside the String Constant Pool (SCP).
- If another string with the same content is created,
  no new object is created in the pool.
- The reference of the existing object is reused.

Example:
      String s1 = "Ramjan";
      String s2 = "Ramjan";

Here, both s1 and s2 point to the same object in SCP.

--------------------------------------------------

B) Using Constructor (new Keyword)
-----------------------------------
      String s = new String("Ramjan");

- A new object is always created in heap memory.
- If the string does not already exist in the pool,
  one copy is also created in the String Constant Pool.

Example:
      String s1 = new String("Java");
      String s2 = new String("Java");

Here:
- Two separate objects are created in heap memory.
- Only one object may exist in the String Constant Pool.

--------------------------------------------------

4) Important Concept Demonstrated in main()
-------------------------------------------

String s = "Ramjan";
String s2 = "Ramjan";

- Only one object is created in the String Constant Pool.
- Both references (s and s2) point to the same object.

--------------------------------------------------

s.concat("Gori");

- This does NOT change the original string.
- Because String is immutable.
- A new object "RamjanGori" is created,
  but it is not assigned to any reference.
- Therefore, it becomes eligible for garbage collection.

--------------------------------------------------

s = s.concat("Gori");

- A new string object is created.
- The reference variable 's' now points to the new object.
- The original "Ramjan" object still exists in the pool.

--------------------------------------------------

Memory Explanation
------------------
String Literal → Stored in String Constant Pool (inside heap).
new String() → Object created in heap memory.
SCP avoids duplicate string objects to save memory.

--------------------------------------------------

5) Key Interview Points
-----------------------

- String is immutable.
- String objects created using literals are stored in SCP.
- "new" keyword always creates a new object in heap.
- concat() does not modify the existing string.
- Reassignment is required to store modified value.

==================================================
*/

public class StringClass {

   public static void main(String[] args) {

       // Using String Literal
       String s = "Ramjan";  
       String s2 = "Ramjan"; 

       System.out.println(s);

       s.concat("Gori");  
       System.out.println(s);

       s = s.concat("Gori"); 
       System.out.println(s);

       // Using Constructor Object
       String s1 = new String("Java"); 
       String s3 = new String("Java");  

   }
}
