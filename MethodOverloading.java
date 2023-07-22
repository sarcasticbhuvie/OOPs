class Test{
    void show(){
        System.out.println("no argument");
    }    
    void show(int a){
        System.out.println("int");
    }
    void show(String a){
        System.out.println("string ");
    }
    void show(int a,String b){
        System.out.println("int and String");
    }
    void show(String a,int b){
        System.out.println("String and int");
    }
    void show(String a,float b,int c){
        System.out.println("String and float and int");
    }
    void showA(Object a){
        System.out.println("object");
    }
    void showA(String a)
    {
        System.out.println("ShowA  String");
    }
    public static void main(String name) {
        System.out.println("In main function String");
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        Test t=new Test();
        t.show();   //call show()     
        t.show(10); //call show(int a)
        t.show('a');   //call show(int a)
        t.show("bhupendra");  // call show(String)
        t.show(10,"bhuvie");   //call show(int a,string b)
        t.show("bhuvie",10);   //call show(String a,int b)
        t.show("bhupendra",3.14f,25);   //call show(String a,float b,int c)
        t.show("bhupendra",10,25);  //call show(String a,float b,in c)
        t.main("hello");  //it call public static void main(String name) 
        //it means that main() method also can be overload.
        System.out.println("------------------------------------");
        t.showA(10);  //call showA(Object a)
        t.showA('b'); //call showA(Object a)
        t.showA("bhuvie"); //call showA(Object a) if showA(String a) not defined
        //after defining showA(String a) it call it.
    }
}

