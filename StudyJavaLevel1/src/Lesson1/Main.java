package Lesson1;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("========================");
        checkSumSing();

    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Apple");
        System.out.println("Banana");
    }

    public static void checkSumSing(){
        int a = 0;
        int b = 0;
        if ((a + b) <= 0) {
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");

        }

    }

}
