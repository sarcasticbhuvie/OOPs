interface I{
    void display();//1.abstarct method: compiler make is public abstract void display();
    public static final int a=10;//2. variable : variable must be public static final and value should initialized in variabl
    default void hello(){ //3. concreate method must be default
        System.out.println("concreate method");
        h1();//static method can b used only in same interfaces only
        h2();//private method are also used in same interface in which exist
        //both static,private method used for code reusability.
    }
    static void h1(){ //4. static methods 
        System.out.println("static method");
    }
    private void h2(){
        System.out.println("private method");
    }
}
class C implements I{
    public void display(){ //here it should must be public because in the interface it is public
        System.out.println("display method");
    }
}
public class Interface {
    public static void main(String[] args) {
        C c1=new C();
        c1.display();
        c1.hello();
        // c1.h2()
        System.out.println("value of a in interface : "+c1.a);
    
    }

}
