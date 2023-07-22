class A{
    void showA()
    {
        System.out.println("in class A");
    }
}
//type 1 :single inheritance
class B extends A{
    void showB()
    {
        System.out.println("in class B");
    }
}
//type 2: multilevel inheritance
class C extends B{
    void showC()
    {
        System.out.println("In class C");
    }
}
//type 3: multiple inheritance
class D extends A{
        void showD(){
            System.out.println("In class D");
        }
}
public class Inheritance {
    public static void main(String[] args) {
    A a1=new A();
    a1.showA();
    //a1.showB();//it give error because a1 can't inherite property of class B
    System.out.println("-------------------------------");
    B a2=new B();
    a2.showA();//because class B inheriting the class A
    a2.showB();
    System.out.println("--------------------------");
    C a3=new C();
a3.showB();//because class c inheriting class B
a3.showA();//because class c inheriting class B and class B inheriting class A 
a3.showC();
System.out.println("-----------------------");
        D a4= new D();
        a4.showA();//class D inhariting class A
        a4.showD();
}
}
