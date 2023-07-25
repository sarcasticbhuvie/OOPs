import java.util.Scanner;
class ThrowEx extends RuntimeException {// it will create a unchecked Exception
    ThrowEx(String msg) {
        System.out.println(msg);
    }
}
public class ExceptionThrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter our Age : ");
       int age =sc.nextInt();
       try{
        
        if(age<18)
        {
            throw new ThrowEx("You are not worthy to vote");
        }
        else
        {
            System.out.println("you can vote");
        }
       }
       catch(ThrowEx e){
        System.out.println(e);
       }
        System.out.println("------end of program=-------");
        //condition 1. when exception not handled then it will execute when exception does not occurs 
        //condition 2. when exception handles then it will always execute
        }
}