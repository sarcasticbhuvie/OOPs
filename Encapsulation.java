class Employee{
    private int empid;//data hiding
    public void setid(int id){ // setter method :must be public
        empid=id;
    }
    public int getid(){// getter method :must be public
        return empid;
    }
}
//till now it is know as encapsulation.
public class Encapsulation {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setid(10);
        int k=e1.getid();
        System.out.println(k);//OR
        System.out.println(e1.getid());
    
    }
}
