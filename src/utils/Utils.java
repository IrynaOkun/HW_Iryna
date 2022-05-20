package utils;

public class Utils {

    public static void line() {
        System.out.println("__________________________________________________");
    }

    public static void ln() {
        System.out.println();
    }

    public static void task(int number) {
        ln();
        line();
        System.out.println("Задача " + number);
    }

    public static String verify(int a, int b) {
        if (a == b) {
            System.out.println("Pass");

            return "Pass";
        } else {
            System.out.println("Fail");

            return "Fail";
        }
    }

    public static String verify(double a, double b) {
        if (a == b) {
            System.out.println("Pass");

            return "Pass";
        } else {
            System.out.println("Fail");

            return "Fail";
        }
    }

    public static String verify(String string1, String string2) {
        if (string1.equals(string2)) {
            System.out.println("Pass");

            return "Pass";
        } else {
            System.out.println("Fail");

            return "Fail";
        }
    }
}



