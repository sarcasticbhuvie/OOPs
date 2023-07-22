//abstarct class
abstract class Vehicle{
    //abstract method
    abstract void start();//it should must be define in class in which Vehicle is extends
}
class Car extends Vehicle{
    void start(){
        System.out.println("Start with Key");
    }
}
class Scooty extends Vehicle{
    void start(){
        System.out.println("start with kick");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        //we can't make object of abstract class
        Car c1=new Car();
        c1.start();
        Scooty s1=new Scooty();
        s1.start();
    }
}
