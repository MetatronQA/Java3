package Lesson3;

public class Main {
    public static void main(String[] args) {

//        *Дз номер 1.
        int[] task1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printTask("do \t ", task1);
        System.out.println(task1);
        change(task1);
        printTask("posle\t ", task1);


        System.out.println("==============================");

//       *Дз номер 2.

        int[] task2 = new int[200];
        fillIn(task2);
        printTask(" do\t", task2);

//      *Дз номер 3.

        int[] task3 = {1, 3, 5, 9, 10, 6, 3, 11};
        printTask(" do\t", task3);
        doubling(task3);
        printTask(" after\t", task3);

        System.out.println("==============================");

//        Дз номер 4

        int side = 5;
        int[][] task4 = new int[side][side];
        fillAngel(task4);
        printTask2("Result ", task4);

//        5.




    }

    public static void printTask(String msg, int[] inputArray) {
        System.out.println(msg + " : ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i] + " ");
        }
        System.out.println();
    }

    public static void printTask2(String msg, int[][] inputArray) {
        System.out.println(msg);
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
    }

    public static void fillIn(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;

    }

    public static void doubling(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 4)
                array[i] *= 2;
    }

    public static void fillAngel(int[][] array){
        int dfg = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][dfg - i] = 1;
        }
    }




}











