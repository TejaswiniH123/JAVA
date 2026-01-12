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


class Student implements Cloneable{ 
    int id = 1;
    String name = "Vishnu";
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();  // shallow copy
    }
    public static void main(String[] args) throws Exception{   
        Student s1 = new Student();
        Student s2 = (Student) s1.clone();
        System.out.println(s1.name); // Vishnu
        System.out.println(s2.name); // Vishnu
    }
}