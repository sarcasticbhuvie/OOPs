class Main {
    public static void main(String[] args) {
        Bird parrot=new Bird();
        parrot.fly();
        //object initialiation by reference variables
        Animal cat=new Animal();
        cat.name="Meo";
        cat.age=2;
        cat.display();
        //object initialization bt method
       Animal dog=new Animal();
       dog.init("Zaikie",3); 
       dog.display();
       Animal cow=new Animal();
       cow.init("Rani",5);
       cow.display();       
       cow.display();

    }
}
class Bird{
    void fly()
    {
        System.out.println("i m flying");
    }
}
class Animal{
    String name;
    int age;
    void init(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println(name+" "+age);
    }
}