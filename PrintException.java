import java.io.FileInputStream;

public class PrintException {
    public static void main(String[] args) {
        int a=100,b=0,c;
        try {
            c=a/0;
        } 
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("--------------------");
            System.out.println(e);
            System.out.println("----------------------------");
            System.out.println(e.toString());
            System.out.println("---------------------------");
            System.out.println(e.getMessage());
        }
    }
}
