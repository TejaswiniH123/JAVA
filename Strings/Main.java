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
// public class Main {
//     public static void main(String args[])
//     {
//         String str1 = "Hello, ";
//         String str2 = "World!";
//         String str3 = str1.concat(str2);
//         System.out.println("Combined String: " + str3);
//     }
// }

//reverse a string using concat() method
// public class Main {
//     public static void main(String args[])
//     {
//         String str = "Hello";
//         String reversedStr = "";
        
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversedStr = reversedStr.concat(String.valueOf(str.charAt(i)));
//         }
        
//         System.out.println("Reversed String: " + reversedStr);
//     }
// }

// import java.io.*;
// class Main {
//     public static void main(String[] args)
//     {
//         String str = "GeeksforGeeks";
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == 'e')
//                 count++;
//         }
//         System.out.println("Count the occurrence of e : "+ count);
//     }
// }


// public class Main {
//     public static void main(String args[]) {
//         String s = new String("Welcome to geeksforgeeks");
//         String s1 = new String("geeks");
//         System.out.print(
//             "Found geeks(after 14th index) starting at position: ");
//         System.out.print(s.indexOf(s1, 14));
//     }
// }

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("GeeksforGeeks");
        System.out.println("Initial: " + sb);

        sb.append(" is awesome!");
        System.out.println("After append: " + sb);

        sb.insert(13, " Java");
        System.out.println("After insert: " + sb);

        sb.replace(0, 5, "Welcome to");
        System.out.println("After replace: " + sb);

        sb.delete(8, 14);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        char c = sb.charAt(5);
        System.out.println("Character at index 5: " + c);

        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);

        String sub = sb.substring(5, 10);
        System.out.println("Substring (5–10): " + sub);

        sb.reverse(); // Revert for search
        System.out.println("Index of 'Geeks': " + sb.indexOf("Geeks"));

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        String result = sb.toString();
        System.out.println("Final String: " + result);
    }
}