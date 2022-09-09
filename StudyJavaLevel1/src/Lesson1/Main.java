package Lesson1;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("========================");

        if (checkSumSing(10, 20)) {
            System.out.println("Positive ");
        } else {
            System.out.println("Negative");
        }
        System.out.println("========================");


        printColor(120);
        printColor(50);

        System.out.println("========================");

        compareNumbers(17, 19);




    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Apple");
        System.out.println("Banana");
    }

    public static boolean checkSumSing(int a, int b) {
        return (a + b) >= 0;
    }

    public static String printColor(int value) {
        if (value <= 0) {
            return "Red";
        } else if (value > 0 && value <= 100) {
            return "Yellow";
        } else {
            return "Green";
        }
    }

    public static String compareNumbers(int a, int b){
        if (a >= b) {
            return "a >= b";
        }else {
            return "a < b";
        }
    }


}
