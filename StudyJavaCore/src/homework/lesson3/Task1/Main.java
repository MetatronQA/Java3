package homework.lesson3.Task1;

public class Main {
    public static void main(String[] args) {

        invertArray();
    }

    private static void invertArray() {
        int[] array = {0, 1};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
        printArray(array);
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
