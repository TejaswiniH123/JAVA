//String example in java 
// public class Main {
//     public static void main(String args[])
//     {
//         String str = new String("Geeks");
//         System.out.println(str);
//     }
// }

// Example Demonstrating Immutability of Strings in Java
// public class Main {
//     public static void main(String args[])
//     {
//         String str = new String("Geeks");
//         System.out.println("String before modification: " + str);
//         str.concat("forGeeks");
//         System.out.println("String after modification attempt: " + str);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Both s1 and s2 refer to the same
//         // string literal in the String Pool
//         String s1 = "Hello";
//         String s2 = "Hello";

//         // true, both point to the same object in String Pool
//         System.out.println("s1 == s2: " + (s1 == s2)); 

//         // Concatenation creates a new String
//         // object in heap, s1 now points to it
//         s1 = s1.concat(" World");

//         System.out.println("s1: " + s1);      
//         System.out.println("s2: " + s2);     
//         System.out.println("s1 == s2: " + (s1 == s2)); 
        
//         // Creating a string using new keyword stores it in the heap
//         String s3 = new String("Hello");

//         // false, because s2 is from String Pool and s3 is from heap
//         System.out.println("s2 == s3: " + (s2 == s3)); 

//         // true, because equals() compares content
//         System.out.println("s2.equals(s3): " + s2.equals(s3));
//     }
// }

// Combining Two Strings with concat() Method
public class Main {
    public static void main(String args[])
    {
        String str1 = "Hello, ";
        String str2 = "World!";
        String str3 = str1.concat(str2);
        System.out.println("Combined String: " + str3);
    }
}