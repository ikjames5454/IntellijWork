package tdd;

import java.util.Arrays;

public class NamesInput {

    public static void main(String[] args) {
        NamesInput names = new NamesInput();
        String name = "ikenna james ";
        names.collectName(name);
        System.out.println(names.anagram("james","majes"));
        System.out.println(names.reverse("ikenna james alagbu"));

    }
    public String  collectName(String fullName) {
        String[] array = fullName.split(" ");
        String newName = "";
        for (int a = 0; a < array.length-1; a++){
            newName += array[a].toUpperCase().charAt(0)+ ". ";
        }
        String names = newName+ array[array.length-1];
        System.out.println(names);

        return names;


    }

    public int canAdd(String characters) {
        int sum = 0;
        for (int a = 0; a < characters.length(); a++){
            char num = characters.charAt(a);
            if (Character.isDigit(num)){
                sum += Character.getNumericValue(num);
            }
        }
        return sum;
    }

    public boolean anagram(String word, String scrabbledWord) {
        char[] word1 = word.toCharArray();
        char[] word2 = scrabbledWord.toCharArray();
        char[] store = sort(word1);
        char[] store2 = sort(word2);
        boolean anagram = false;
        if (Arrays.equals(store,store2)){
            anagram = true;
        }
        return anagram;
    }
    public static char[] sort(char[] word){
        char temp ;
        for (int a = 0; a < word.length; a++){
            for (int b = a; b < word.length; b++){
                if ( word[a] > word[b]){
                    temp = word[a];
                    word[a] = word[b];
                    word[b] = temp;
                }
            }
        }
        return word;
    }

    public boolean remove(String word, String word1) {
        String input = check(word);
        String input1 = check(word1);
        boolean checker = false;
        if (input.equals(input1)){
            checker = true;
        }return checker;
    }
    public static String check(String word){
        return word.replaceAll(".#","").replaceAll(".#","");
    }

    public String replace(String input) {
        return checker(input);
    }
    public static String checker(String sentence){
            return sentence.replaceAll("&", " ").replaceAll("%", ".    ");}

    public  String reverse(String names) {
        String string = "";
        String[] word = names.split(" ");
        for (String words : word){
            String rev = "";
            for (int w = words.length()-1; w >=0;w--){
                rev = rev + words.charAt(w);

            }
            string = string + rev + " ";

        }
        return string;

    }
}

