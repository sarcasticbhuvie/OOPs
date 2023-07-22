class A{
    int a=10;
    void display(){
        System.out.println("printing in A class");
    }
}
class B extends A{
    int a=20;
    void display (){
        System.out.println("printing in class B");
    }
    void show(int a){
        System.out.println("a : "+a); //print 30 which is passed
        System.out.println("a using 'this' : "+this.a);// print 20 reference to current class
        System.out.println("a using 'super' : "+super.a); //print 10 reference to parent class
        display(); //print current class method
        super.display(); //print parent class method
    }
}

public class Super {
    public static void main(String[] args) {
        B b1=new B();
        b1.show(30);
        
    }
}
