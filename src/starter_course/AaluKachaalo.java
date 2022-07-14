package starter_course;

public class AaluKachaalo {

    public double PI = 3.141234565431343562345324244;
    public String learn =  "We are learning programming with Java!";
    public int rupee = 13;




    //Java ka starting point is main method
    public static void main(String[] args) {
        float x = 1088882;
        float y = 2099999;

        System.out.println("Addition result is ==> " + (x + y));
        System.out.println("Subtraction result is ==> " + (x - y));
        System.out.println("Multiplication result is ==> " + (x * y));
        System.out.println("Division result is ==> " + (x / y));
        printHello("Gyan"); //calling the method printHalua
        printHello("Shantanu"); //calling the method printHalua
        printHello("Manish"); //calling the method printHalua
    }


    //custom method
    public static void printHello(String name) {
        System.out.println("Hello " + name);
    }

    //double -> decimal number
    public double returnSquareOfNumber(double x){
        return x*x;
    }

    public double returnQuadOfNumber(double x){
        return x*x*x*x;
    }

    public double returnCubeRootOfNumber(double a){
        return Math.cbrt(a);
    }





}
//public -> it is open
//static -> no change
//void -> no returns
//main -> name of the method