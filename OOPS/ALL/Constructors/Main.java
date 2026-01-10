// import java.io.*;

// //default constructor example
// class Geeks{
//     // Default Constructor
//     Geeks(){
//         System.out.println("Default constructor"); 
//     }
//     public static void main(String[] args){
//         Geeks hello = new Geeks();
//     }
// }


// //parameterized constructor example
// class Geeks{
//     // data members of the class
//     String name;
//     int id;
//     // Parameterized Constructor
//     Geeks(String name, int id)
//     {
//         this.name = name;
//         this.id = id;
//     }
//     // Method to display object data
//     void display(){   
//         System.out.println("GeekName: " + name
//                            + " and GeekId: " + id);
//     }
//     // main() method — placed inside the same class for
//     // universal compatibility
//     public static void main(String[] args){   
//         // This will invoke the parameterized constructor
//         Geeks geek1 = new Geeks("Sweta", 68);
//         geek1.display();
//     }
// }


// //COPY CONSTRUCTOR example
// import java.io.*;
// class Geeks{
//     // data members of the class
//     String name;
//     int id;
//     // Parameterized Constructor
//     Geeks(String name, int id)
//     {
//         this.name = name;
//         this.id = id;
//     }
//     // Copy Constructor
//     Geeks(Geeks obj2)
//     {
//         this.name = obj2.name;
//         this.id = obj2.id;
//     }
// }
// class GFG {
//     public static void main(String[] args)
//     {
//         // This would invoke the parameterized constructor
//         System.out.println("First Object");
//         Geeks geek1 = new Geeks("Sweta", 68);
//         System.out.println("GeekName: " + geek1.name
//                            + " and GeekId: " + geek1.id);

//         System.out.println();
//         // This would invoke the copy constructor
//         Geeks geek2 = new Geeks(geek1);
//         System.out.println(
//             "Copy Constructor used Second Object");
//         System.out.println("GeekName: " + geek2.name
//                            + " and GeekId: " + geek2.id);
//     }
// }


// //PRIVATE CONSTRUCTOR example
// class GFG {
//     // Private constructor
//     private GFG(){
//         System.out.println("Private constructor called");
//     }
//     // Static method
//     public static void displayMessage(){        
//         System.out.println("Hello from GFG class!");
//     }
// }
// class Main{   
//     public static void main(String[] args){
//         // GFG u = new GFG(); // Error: constructor is
//         // private
//        GFG.displayMessage();
//     }
// }


//constructor overloading example
import java.io.*;
class Geeks{
    // constructor with one argument
    Geeks(String name){    
        System.out.println("Constructor with one "  + "argument - String: " + name);
    }
    // constructor with two arguments
    Geeks(String name, int age){
        System.out.println( "Constructor with two arguments: " + " String and Integer: " + name + " " + age);
    }
    // Constructor with one argument but with different
    // type than previous
    Geeks(long id)
    {
        System.out.println(
            "Constructor with one argument: "
            + "Long: " + id);
    }
}
class GFG {
    public static void main(String[] args){
        Geeks geek2 = new Geeks("Sweta");

        Geeks geek3 = new Geeks("Amiya", 28);

        Geeks geek4 = new Geeks(325614567);
    }
}