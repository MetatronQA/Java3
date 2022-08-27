package homework.lesson3.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToListConverter<ArrayType> {
    public ArrayList<ArrayType> convert(ArrayType[] arr) {
        return new ArrayList<>(Arrays.asList(arr));

    }
}