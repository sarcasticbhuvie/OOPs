class T{
    int a;
    void seta(int a){
        this.a=a;
        System.out.println(this.a);
    }
    void newset(int a){
        seta(a);//it work as this.seta(a);
    }
    T(){
        // this(10);
        System.out.println("constructure with no args");
    }
    T(int b){
        this();
        System.out.println("constructor with args");
    }

}
public class This {
    public static void main(String[] args) {
        T t1=new T(10);
        t1.seta(10);
        t1.newset(20);
    }
}
