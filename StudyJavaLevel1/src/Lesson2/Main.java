package Lesson2;

public class Main {
    public static void main(String[] args) {
        doTask1(1, 9);
        doTask2(5);
        System.out.println(doTask3(-3));
        doTask4("Tekst", 1);
        System.out.println(doTask5(1700));


    }


    public static boolean doTask1(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void doTask2(int a) {
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    public static boolean doTask3(int a) {
        if (a <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void doTask4(String name, int a) {
        for (int i = 0; i < 4; i++) {
            System.out.println("  " + name + " , " + a);
        }
    }

    public static boolean doTask5(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }


}








