public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("i am in main method");
    }
    static{
        System.out.println("i am in static block 2");
    }
    static{
        System.out.println("i am in static block 1");
    } 
    //Static blocks execute only in the class which has main() method
}
class St{
    // public static void main(String[] args) {
        
    // }
    static{ //this also execute when run this class only not by running upper class
        System.out.println("i am in static block 1");
    } 
}