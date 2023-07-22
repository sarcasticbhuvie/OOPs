class Test{
    void show(){
        System.out.println("in parent class Test");
    }
}
class abc extends Test{
    void show()
    {
        super.show(); //it call parent's class method show()
        System.out.println("in child class abc");
    }
}

public class MethodOverridden {
    public static void main(String[] args) {
    abc a1=new abc();
    a1.show();//it call child class method            
    }
}
//method overridden means same method name with same argument in different classes 
// method overriding means same method name and different argument in same class