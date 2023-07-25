import java.io.FileInputStream;
public class ExceptionInJava {
    public static void main(String[] arg00s) {
        FileInputStream f=new FileInputStream("d:/abcd.txt");// it give checked Exception
        //it will give error until this exception not handled by try and catch block
        // it will give error whwen comiple the program
        System.out.println(f); //to see content of file.

        System.out.println("------------------------------------");
        int a = 100, b = 0;
        System.out.println(a/b);//it is unchecked Exception it is not checked during compiling
        //it will give error during exxecution not during compiling until this exception not handled by try and catch block
        // thus it will not give error during compiling
        // it give Exception during Executing
    }
}
