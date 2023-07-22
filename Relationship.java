//There are two types of Inheritance between classes : IS-A, HAS-A
//Inheritance has Is-A relationship that is made by 'extends' keyword
//Assocation has HAS-A relationship that is made by reference variables or 'new' keyword.
class E{
    String name;
    void showE(){
        System.out.println("in class E");
    }
    void display()
{
    System.out.println(name);
}
}
public class Relationship {
    public static void main(String[] args) {
        //using 'new' keyword 
        E e1=new E();
        e1.showE();
        //using reference varibale
        e1.name="Bhupendra Verma";
        e1.display();
    }
}