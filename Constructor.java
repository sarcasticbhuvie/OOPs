class Employee {
    String name;
    int id;
    //type 1: default constructor :create by compiler not by user and no argument passed 
    // Employee(){
    // }
    //upper constructor is not physically available in code does not see in code
    //type 2: No-argument constructor : same as type 1 but create by user and also no argument passed 
    Employee()
        {
    
        }
    //type 3: Parameterized constructor : created by user and paramiter are passed 
    Employee(String name,int id){
        this.name=name;
        this.id=id;
        //value is assigned 
    }
    void display(){
        System.out.println("Name : "+name);       
        System.out.println("id : "+id);
    }
}
class constructor{
    public static void main(String[] args) {
        //object craeted by constructor type 2
        Employee e1=new Employee();
        e1.display();
        //object craeted by constructor type 3
        Employee e2=new Employee("Bhuvie",111);
        e2.display();
    }
}
