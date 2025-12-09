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
// public class Main{
//     int myNumber = 42;

//     public static void main(String[] args){
//         Main myObject = new Main();
//         System.out.println("Class value: " + myObject.myNumber);
//     }
// }
//interface Data type
// interface MyInterface{
//     void myMethod(); 
// }
// class MyClass implements MyInterface{
//     public void myMethod(){
//         System.out.println("Method implemented from interface.");
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         MyClass myObject = new MyClass();
//         myObject.myMethod();
//     }
// }
//object Data type
// public class Main{
//     public static void main(String[] args){
//         Main myObject = new Main();
//         System.out.println("Object created of Main class: " + myObject);
//     }
// }

//Variables in Java
// public class Main{
//     public static void main(String[] args){
//         // Variable declaration and initialization
//         int myNumber = 10;
//         String myString = "Hello, Java!";
//         boolean isJavaFun = true;

//         // Printing variable values
//         System.out.println("Integer value: " + myNumber);
//         System.out.println("String value: " + myString);
//         System.out.println("Is Java fun? " + isJavaFun);
//     }
// }

// operators in Java
// public class Main{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 5;
//         // Arithmetic Operators
//         System.out.println("Addition: " + (a + b));
//         System.out.println("Subtraction: " + (a - b));
//         System.out.println("Multiplication: " + (a * b));
//         System.out.println("Division: " + (a / b));
//         System.out.println("Modulus: " + (a % b));
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 5;
//         // Comparison Operators
//         System.out.println("Equal to: " + (a == b));
//         System.out.println("Not equal to: " + (a != b));

//         System.out.println("Greater than: " + (a > b));
//         System.out.println("Less than: " + (a < b));
//         System.out.println("Greater than or equal to: " + (a >= b));
//         System.out.println("Less than or equal to: " + (a <= b));
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         boolean x = true;
//         boolean y = false;
//         // Logical Operators
//         System.out.println("Logical AND: " + (x && y));
//         System.out.println("Logical OR: " + (x || y));
//         System.out.println("Logical NOT: " + (!x));
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 5;
//         // Assignment Operators
//         a += b; // a = a + b
//         System.out.println("a after += : " + a);
//         a -= b; // a = a - b
//         System.out.println("a after -= : " + a);
//         a *= b; // a = a * b
//         System.out.println("a after *= : " + a);
//         a /= b; // a = a / b
//         System.out.println("a after /= : " + a);
//         a %= b; // a = a % b
//         System.out.println("a after %= : " + a);
//     }
// }

public class Main{
    public static void main(String[] args){
        int a = 10;
        // Increment and Decrement Operators
        System.out.println("Original a: " + a);
        System.out.println("Post-increment: " + (a++)); // prints 10, then a becomes 11
        System.out.println("After Post-increment a: " + a); // prints 11
        System.out.println("Pre-increment: " + (++a)); // a becomes 12, then prints 12
        System.out.println("After Pre-increment a: " + a); // prints 12
        System.out.println("Post-decrement: " + (a--)); // prints 12, then a becomes 11
        System.out.println("After Post-decrement a: " + a); // prints 11
        System.out.println("Pre-decrement: " + (--a)); // a becomes 10, then prints 10
        System.out.println("After Pre-decrement a: " + a); // prints 10
    }
}
// public class Main{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 5;
//         // Ternary Operator
//         int max = (a > b) ? a : b;
//         System.out.println("Maximum value: " + max);
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         boolean a = true;
//         // Bitwise Operators
//         System.out.println("Bitwise AND: " + (a & false));
//         System.out.println("Bitwise OR: " + (a | false));
//         System.out.println("Bitwise XOR: " + (a ^ false));
//         System.out.println("Bitwise NOT: " + (~1)); // Note: ~ operator works on integers
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         int a = 10;
//         // Shift Operators
//         System.out.println("Left Shift: " + (a << 2)); // 10 * 2^2 = 40
//         System.out.println("Right Shift: " + (a >> 2)); // 10 / 2^2 = 2
//         System.out.println("Unsigned Right Shift: " + (a >>> 2)); //
//     }
// }
    // public class Main{
    //     public static void main(String[] args){
    //         int a = 10;
    //         int b = 3;
    //         // Miscellaneous Operators
    //         System.out.println("Instanceof Operator: " + (a instanceof Integer)); // Note: 'instanceof' works with reference types
    //     }
    // }

//conditional statements in Java



//looping statements in Java
