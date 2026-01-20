//Nested Interface Inside a Class
class Outer {
    interface Inner {
        void display();
    }
}
class GFG implements Outer.Inner{   
    public void display(){
        System.out.println(
            "Hello from Nested Interface Inside a Class!");
    }
    public static void main(String[] args){   
        Outer.Inner obj = new GFG();
        obj.display();
    }
}


//Nested Interface Inside an Interface
interface OuterInterface {
    void show();
    interface InnerInterface {
        void msg();
    }
}
class Test implements OuterInterface.InnerInterface {
    public void msg()
    {
        System.out.println(
            "Message from Nested Interface Inside an Interface!");
    }
    public static void main(String[] args){   
        OuterInterface.InnerInterface obj = new Test();
        obj.msg();
    }
}