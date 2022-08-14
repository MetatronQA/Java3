package HomeWorkLesson2;

public class Main {
    public static void main(String[] args) {
        String[][] strings = createArray();
        ArrayChecker arrayChecker = new ArrayChecker();
        arrayChecker.setStrings(strings);

        arrayChecker.summ();
    }
    private static String[][] createArray() {
        String[][] array = new String[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf((int)(Math.random() + 5));
                System.out.print(array[i][j] + " ");

            }

        }
        return array;
    }
}
