package ChibuzorAssignment;

import java.util.ArrayList;
import java.util.List;

public class Concatenation {

    public static void main(String[] args) {
        concatenate();


    }

    public static void concatenate() {
        List<String> concatenate1 = new ArrayList<String>();
        concatenate1.add("E");
        concatenate1.add("B");
        concatenate1.add("T");
        concatenate1.add("O");

        List<String> concatenate2= new ArrayList<String>();
        concatenate2.add("3");
        concatenate2.add("5");
        concatenate2.add("8");
        concatenate2.add("11");


        List<String> concatenateBoth = new ArrayList<String>();
        concatenateBoth.addAll(concatenate1);
        concatenateBoth.addAll(concatenate2);

        System.out.println(concatenate1);
        System.out.println(concatenate2);
        System.out.println(concatenateBoth);


    }

    public static String[] addTwoList(char[] character, int[] numbers) {

        String[] newList = new String[character.length+ numbers.length];

        for (int counter = 0; counter < character.length; counter++) {
            String letter = character[counter]+ "";

            newList[counter] = letter;
        }

        int newCounter = 3;
        for (int counter = 0; counter < numbers.length; counter++) {
            String letter = numbers[counter] + "";

            newList[newCounter] = letter;
            newCounter++;
        }
        System.out.println(newList);
        return newList;
    }
}
