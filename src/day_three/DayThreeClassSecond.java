package day_three;

import starter_course.AaluKachaalo;

import static starter_course.AaluKachaalo.printHello;

public class DayThreeClassSecond {

    public static void main(String[] args) {
        printHello("Java");
        AaluKachaalo ak = new AaluKachaalo(); //instance creation
        double v1 = ak.returnSquareOfNumber(1735.44987654345);
        double v2 = ak.returnQuadOfNumber(987656.7654);
        double v3 = ak.returnCubeRootOfNumber(711654.654);

        System.out.println("Square of number is: "+v1);
        System.out.println("Quad of number is: "+v2);
        System.out.println("Cube root of number is: "+v3);


        double x = (98433232.32 + 32312122.3232 - 321232 * 2121)/13;
        System.out.println(x);


        System.out.println(ak.PI +" "+ak.learn+" "+ak.rupee);
    }

}
/**
 * ACCESS MODIFIER (METHOD, VARIABLE)
 * Public - Available for everyone
 * Protected - Available for only same package
 * Private - Available for only same class
 */

//static -> obj creation is not needed