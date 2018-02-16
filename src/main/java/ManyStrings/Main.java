package ManyStrings;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("blueberry");
        fruits.add("banana");
        fruits.add("melon");

        ManyStringOperations manyStringOperations = new ManyStringOperations(fruits);

        String allFruits = manyStringOperations.concatenate();
        System.out.println(allFruits);

        manyStringOperations.setTheLetter("e");

        boolean checkFruits = manyStringOperations.contains();
        System.out.println(checkFruits);

    }
}
