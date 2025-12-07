// public class Main{
//     public static void main(String[] args){
//         {
//         System.out.println("This is inside the block.");
//         }
//     System.out.println("This is outside the block.");
//     }
// }


// //identifiers
// //In Java, an identifier is the name given to various program elements such as variables, methods, classes, and objects. Identifiers must follow certain rules:
// public class Main{
//     public static void main(String[] args){
//         int myVariable = 10; // Valid identifier
//         String _myString = "Hello"; // Valid identifier
//         double $myDouble = 20.5; // Valid identifier

//         // Invalid identifiers (uncommenting these will cause compilation errors)
//         // int 2ndVariable = 15; // Cannot start with a digit
//         // String my-String = "World"; // Cannot contain hyphens
//         // double my Double = 30.5; // Cannot contain spaces

//         System.out.println("Valid Identifiers:");
//         System.out.println("myVariable: " + myVariable);
//         System.out.println("_myString: " + _myString);
//         System.out.println("$myDouble: " + $myDouble);
//     }
// }

// Data types in Java
//boolean Data type
// public class Main{
//     public static void main(String[] args){
//         boolean isJavaFun = true;
//         boolean isFishTasty = false;

//         System.out.println("Is Java fun? " + isJavaFun);
//         System.out.println("Is fish tasty? " + isFishTasty);
//     }
// }
//byte Data type
// public class Main{
//     public static void main(String[] args){
//         byte myByte = 100;
//         System.out.println("Byte value: " + myByte);
//     }
// }
//short Data type
// public class Main{
//     public static void main(String[] args){
//         short myShort = 5000;
//         System.out.println("Short value: " + myShort);
//     }
// }
//int Data type
// public class Main{
//     public static void main(String[] args){
//         int myInt = 100000;
//         System.out.println("Integer value: " + myInt);
//     }
// }
//long Data type
// public class Main{
//     public static void main(String[] args){
//         long myLong = 15000000000L;
//         System.out.println("Long value: " + myLong);
//     }
// }
//float Data type
// public class Main{
//     public static void main(String[] args){
//         float myFloat = 5.75f;
//         System.out.println("Float value: " + myFloat);
//     }
// }
//double Data type
// public class Main{
//     public static void main(String[] args){
//         double myDouble = 19.99d;
//         System.out.println("Double value: " + myDouble);
//     }
// }
//char Data type
// public class Main{
//     public static void main(String[] args){
//         char myChar = 'A';
//         System.out.println("Character value: " + myChar);
//     }
// }

//Non primitive data types
//string Data type
// public class Main{
//     public static void main(String[] args){
//         String myString = "Hello, World!";
//         System.out.println("String value: " + myString);
//     }
// }
//array Data type
// public class Main{
//     public static void main(String[] args){
//         int[] myArray = {10, 20, 30, 40, 50};
//         System.out.println("Array values:");
//         for(int i = 0; i < myArray.length; i++){
//             System.out.println(myArray[i]);
//         }
//     }
// }
//class Data type
public class Main{
    int myNumber = 42;

    public static void main(String[] args){
        Main myObject = new Main();
        System.out.println("Class value: " + myObject.myNumber);
    }
}