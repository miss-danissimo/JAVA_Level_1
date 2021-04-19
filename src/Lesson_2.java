public class Lesson_2 {
    public static void main(String[] args) {

        ex1(4, 7);
        ex2(8);
        ex3(5);
        exr3(-5);
        ex4(8, "Hello, Oleg!");
        ex5();
    }

    public static boolean ex1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println(sum);
            return true;
        } else {
            return false;
        }
    }

    public static void ex2(int c) {
        if (c >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }

    public static boolean ex3(int d) {
        if (d < 0) {
            return true;
        } else {
            return false;
        }
    }

    // Или можно представить решение в таком красивом и лаконичном варианте.

    public static boolean exr3(int e) {
        return e < 0;
    }
    public static void ex4(int d, String g) {
        for (int i = 0; i < d; i++) {
            System.out.println(g);
        }
    }

    private static void ex5() {
        leapYear(2000);
        leapYear(1544);
        leapYear(877);
        leapYear(3061);
        leapYear(2021);
        leapYear(1996);

    }

    public static void leapYear(int year) {
        if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            System.out.println(year + " is not a leap year.");
        } else {
            System.out.println(year + " is a leap year.");
        }
    }


}
