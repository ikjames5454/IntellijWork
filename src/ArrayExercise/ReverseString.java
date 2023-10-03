package ArrayExercise;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        String name = "Weldone girl";
        String names = name.toLowerCase();
        System.out.println(names);
        String string = "";
        String[] word = names.split(" ");
        System.out.println(Arrays.toString(word));
        for (String words : word){
            String rev = "";
            for (int w = words.length()-1; w >= 0;w--){
                rev = rev + words.charAt(w);

            }
            string = string + rev + " ";

        }
        System.out.println(string);


    }
}
