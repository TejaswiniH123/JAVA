// class Person{  
//     String n;  
//     // Constructor
//     public Person(String n) {
//         this.n = n;
//     }
//     // Override toString() for a 
//     // custom string representation
//     @Override
//     public String toString() {
//         return "Person{name:'" + n + "'}";
//     }
//     public static void main(String[] args) { 
//         Person p = new Person("Geek");
//         // Custom string representation
//         System.out.println(p.toString());
//         // Default hash code value
//         System.out.println(p.hashCode()); 
//     }
// }


// class Book{
//     String title;
//     Book(String title) {
//         this.title = title;
//     }
//     @Override
//     public boolean equals(Object obj){   
//         Book b = (Book) obj;
//         return this.title.equals(b.title);
//     }
//     public static void main(String[] args) {
//         Book b1 = new Book("Java");
//         Book b2 = new Book("Java");
//         System.out.println(b1.equals(b2)); // true
//     }
// }


// class Geeks{
//     public static void main(String[] args)
//     {
//         Object o = new String("GeeksForGeeks");
//         Class c = o.getClass();
//         System.out.println("Class of Object o is: "
//                            + c.getName());
//     }
// }


// class Geeks {
//     public static void main(String[] args) {
//         Geeks t = new Geeks();
//         System.out.println(t.hashCode());
//         t = null;
//         // calling garbage collector
//         System.gc();

//         System.out.println("end");
//     }
//     @Override protected void finalize()
//     {
//         System.out.println("finalize method called");
//     }
// }


// class Student implements Cloneable{ 
//     int id = 1;
//     String name = "Vishnu";
//     @Override
//     public Object clone() throws CloneNotSupportedException{
//         return super.clone();  // shallow copy
//     }
//     public static void main(String[] args) throws Exception{   
//         Student s1 = new Student();
//         Student s2 = (Student) s1.clone();
//         System.out.println(s1.name); // Vishnu
//         System.out.println(s2.name); // Vishnu
//     }
// }


import java.io.*;
class Book implements Cloneable {
    private String t;   // title
    private String a;   // author
    private int y;      // year
    public Book(String t, String a, int y)
    {
        this.t = t;
        this.a = a;
        this.y = y;
    }
    // Override the toString method
    @Override public String toString()
    {
        return t + " by " + a + " (" + y + ")";
    }
    // Override the equals method
    @Override public boolean equals(Object o)
    {
        if (o == null || !(o instanceof Book)) {
            return false;
        }
        Book other = (Book)o;
        return this.t.equals(other.getTitle())
            && this.a.equals(other.getAuthor())
            && this.y == other.getYear();
    }
    // Override the hashCode method
    @Override public int hashCode()
    {
        int res = 17;
        res = 31 * res + t.hashCode();
        res = 31 * res + a.hashCode();
        res = 31 * res + y;
        return res;
    }
    // Override the clone method
    @Override public Book clone()
    {
        try {
            return (Book)super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    // Override the finalize method
    @Override protected void finalize() throws Throwable
    {
        System.out.println("Finalizing " + this);
    }
    public String getTitle() { return t; }
    public String getAuthor() { return a; }
    public int getYear() { return y; }
    public static void main(String[] args)
    {
        // Create a Book object and print its details
        Book b1 = new Book( "The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979);
        System.out.println(b1);
        // Create a clone of the Book object and print its
        // details
        Book b2 = b1.clone();
        System.out.println(b2);
        // Check if the two objects are equal
        System.out.println("b1 equals b2: " + b1.equals(b2));
        // Get the hash code of the two objects
        System.out.println("b1 hash code: " + b1.hashCode());
        System.out.println("b2 hash code: " + b2.hashCode());
        // Set book1 to null to trigger garbage collection
        // and finalize method
        b1 = null;
        System.gc();
    }
}