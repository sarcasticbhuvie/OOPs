public class ExceptionTryCatch {
    public static void main(String[] args) {
        Test t = new Test();
        try{
        Test1 t1=new Test1();

        }
        catch(Exception e){
            System.out.println("for Test1 class");
        }

    }
}

class Test {
    int a = 100, b = 0, c;

    Test() {
        try {
            c = a / b;// this exception can be handle in both methods
                      // Either in constructor or main method
        } 
        catch (Exception e) {

        }

        System.out.println(c);
    }
}
class Test1{
        int a = 100, b = 0, c;
    Test1(){
        c=a/b;
        System.out.println(c);
        System.out.println("hello in Test1 class");//It will noe execute
            //because c=a/b will transfer control to main method
    }

}