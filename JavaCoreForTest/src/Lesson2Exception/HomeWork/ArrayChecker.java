package Lesson2Exception.HomeWork;

public class ArrayChecker {
    private String[][] strings;

    public void setStrings(String[][] strings){
        try {
            checkSizeArray(strings);
            this.strings = strings;
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (NullPointerException ne) {
            System.out.println("null");
            ne.printStackTrace();
        }
    }

    private void checkSizeArray(String [][] strings) throws MyArraySizeException {
        if(strings.length != 4 || checkLengthStrings(strings)) {
            throw new MyArraySizeException("Size dont correct 4x4 ");
        }
    }

    private boolean checkLengthStrings(String[][] strings) {
        for (String [] str: strings) {
            if(str.length !=4) {return true;}
        }
        return false;
    }

    public void summ() {
        if (strings == null) {
            System.out.println("nothing to sum");
            return;
        }
        try {
            summArray();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public void summArray()throws MyArrayDataException{
        int result = 0;
        for (int x = 0; x < strings.length; x++) {
            String[] str = strings[x];
            for (int y = 0; y < str.length; y++) {
                try {
                    result += Integer.parseInt(str[y]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("fewufgiFGUIE");
                }
            }

        }
        System.out.println(" Sum of elements " + result);

    }
}
