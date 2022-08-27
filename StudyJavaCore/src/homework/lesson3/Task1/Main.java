package homework.lesson3.Task1;

import homework.lesson3.Task2.Apple;
import homework.lesson3.Task2.Box;
import homework.lesson3.Task2.Orange;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        doTask1();
        Integer[] integrs = {5,4,3,2,1};
        doTask2(integrs, 1,2);

        Object[] array = {"Pervij ", "Vtoroy", "Tretiy", "Chetvertiy", "Pyatiy"};
        doTask3(array, 1 ,2);







    }


    private static void doTask1(){

        Box<Apple> appleBox = new Box<Apple>(1);
        Box<Orange> orangeBox = new Box<Orange>(1.7);
        Box<Apple> appleBox2 = new Box<Apple>(1);

        for (int i = 0; i < 2 ; i++) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        appleBox2.addFruit(new Apple());

        System.out.println("Ves Apple " + appleBox.getBoxWeight());
        System.out.println("Ves orange " + orangeBox.getBoxWeight());
        System.out.println("Odinakoviy ves ? " + appleBox.compare(orangeBox));
        System.out.println("===========================================");

        appleBox.addFruits(appleBox2);

    }

    private static void doTask2 (Integer[] integers, int i, int j) {

        Integer a = integers[i];
        Integer b = integers[j];

        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        printArray(integers);
    }

    public static void  printArray(Object[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void doTask3(Object[] array, int first, int second){
        Object temp = array[first];
        array[first] = array[second];
        array[second] = temp;
        printArray(array);
    }

}
