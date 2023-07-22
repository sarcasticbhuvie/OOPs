class Employee{
String name;
int id;
static String company="PaisaBanao.com";
void setdetails(String name,int id){
    this.name=name;
    this.id=id;
}
void display(){
    System.out.println("name : "+name);
    System.out.println("id : "+id);
    System.out.println("company : "+company);
}
}
    public class Static {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        Employee e1=new Employee();
        e1.setdetails("bhupendra",10);
        e1.display();
        System.out.println("--------------------------");
        Employee e2=new Employee();
        e2.setdetails("Mohit",11);
        e2.display();
        System.out.println("-----------------------------");
        Employee e3=new Employee();
        e3.setdetails("Anurag",12);
        e3.display();
        System.out.println("---------------------------------");
        AA a1=new AA();
        AA a2=new AA();
        AA a3=new AA();
        AA a4=new AA();
        AA a5=new AA();
        System.out.println("---------------------------------");
        AA.display();//static method can access directly without object
        //static method does not need object creation.
    }
}
//-----------------------------------------------------
class AA{
    static int count=0;
    AA(){
        count++;
        System.out.println(count);
    }
    static void display(){// static method can acces only static variables
        System.out.println(count);
        show();
        // show1(); //it gives error because static methods only can call in static methods
    }
    static void show(){

        System.out.println("method show");
    }
    void show1(){
        System.out.println("method show1");
    }
}

