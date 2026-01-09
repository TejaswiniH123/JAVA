//String example in java 
// public class Main {
//     public static void main(String args[])
//     {
//         String str = new String("Geeks");
//         System.out.println(str);
//     }
// }

// Example Demonstrating Immutability of Strings in Java
public class Main {
    public static void main(String args[])
    {
        String str = new String("Geeks");
        System.out.println("String before modification: " + str);
        str.concat("forGeeks");
        System.out.println("String after modification attempt: " + str);
    }
}