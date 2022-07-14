package starter_course;

public class DayTwo {

    public static double doDivision(double x, double y) {
        if (x > y) {
            return x / y;
        } else if (x == y) {
            return 1;
        } else
            return y / x;
    }


    public static void main(String[] args) {
        System.out.println(doDivision(100, 10));
        System.out.println(doDivision(100, 10000));
        System.out.println(doDivision(10000, 10000));
    }
}
