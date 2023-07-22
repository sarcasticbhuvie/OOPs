final class Test{ //final class can't inharite
    final int a=10; //value of a can't change : a=a+10; give error because final treate as variable constant
    final void show(){// this method can't overridden
        System.out.println("in class test show method");
    }
}
public class Final {
    public static void main(String[] args) {
    Test t1=new Test();
    t1.show();
    System.out.println(t1.a);       
    }
}
