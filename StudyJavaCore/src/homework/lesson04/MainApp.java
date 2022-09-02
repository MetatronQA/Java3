package homework.lesson04;

import org.omg.CORBA.StringHolder;

import java.util.*;

public class MainApp {
    private static String[] words;

    public static void main(String[] args) {

        PhoneBook member = new PhoneBook();

        member.add("Ivanov", "454446");

        System.out.println(member.get("Ivanov"));
        System.out.println("==================================");


        String[] strings = new String[10];
        strings[0] = "fok";
        strings[1] = "rock";
        strings[2] = "jam";
        strings[3] = "sam";
        strings[4] = "nice";
        strings[5] = "long";
        strings[6] = "strong";
        strings[7] = "age";
        strings[8] = "dog";
        strings[9] = "cat";



        Map<String, Integer> map = new HashMap<>();
        for(String word : strings){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(strings));
        System.out.println(uniq);
        System.out.println("");




    }
}
