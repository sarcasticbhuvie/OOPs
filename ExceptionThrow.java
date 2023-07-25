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
        if(age<18)
        {
            throw new ThrowEx("You are not worthy to vote");
        }
        else
        {
            System.out.println("you can vote");
        }
        System.out.println("------end of program=-------");//it will execute when exception does not occurs
    }
}