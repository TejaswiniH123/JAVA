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


class Book{
    String title;
    Book(String title) {
        this.title = title;
    }
    @Override
    public boolean equals(Object obj){   
        Book b = (Book) obj;
        return this.title.equals(b.title);
    }
    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book("Java");
        System.out.println(b1.equals(b2)); // true
    }
}