import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] arg00s) {
    //FileInputStream f=new FileInputStream("d:/abc.txt");// it give checked Exception
    //it will give error whwen comiple the program 
    //So we handle this exception such type---------
try{
            FileInputStream f=new FileInputStream("d:/abcd.txt");
            // System.out.println(f);

}
catch(Exception p){
    System.out.println("checked Exception : --------------");
    System.out.println(p);
    System.out.println("--- Exception found during compiling ----");
}
System.out.println("------------------------------------");
int a=100,b=0;
   // System.out.println(a/b);//it is unchecked Exception it is not checked during compiling
    //thus it will not give error during compiling 
    //it give Exception during Executing 
try{
    System.out.println(a/b);
}
catch(Exception e){
    System.out.println("Unchecked Exception : ----------------");
    System.out.println(e);
    System.out.println("Exception found during execution");
}
}
}

