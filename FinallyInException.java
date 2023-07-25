import java.io.FileInputStream;
import java.io.IOException;
public class FinallyInException {
    public static void main(String[] args) throws IOException {
        FileInputStream F=null;        
        FileInputStream G=null;

        try{
            F=new FileInputStream("d:/abc.txt");
            G=new FileInputStream("d:/abc.txt");

        }
        catch(Exception e)
        {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally{
         System.out.println("i m inside finally block");  //finally block always execute either exception happen or not 
        if(F!=null)
        {
            F.close(); //it also occur an exception thus it also should thown for normal execution   
            //we can remove it by two ways first by thows keyword that is done in main method
            //and second is try catch block
            System.out.println("File closing Exception thown by throws");
        }
        if(G!=null)
        {
            System.out.println(" G is not null");
            //this try catch execute when main method not thows the IOException
            //Else it will thown by thows
            try{
                G.close();
            }
            catch(Exception p){
                System.out.println("File closing Exception p thown by try catch");
            }
        }
        System.out.println("last statement of finally");
        }
    }
}
