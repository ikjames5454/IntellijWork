package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        System.out.println("Enter a scrabbled word in relation to the first word");
        String word2 = input.nextLine();
        System.out.println(anagram(word,word2));
    }
    public static boolean anagram(String word, String word2) {
        char[] word1 = word.toCharArray();
        char[] words = word2.toCharArray();
       char[] store = sort(word1);
       char[] store2 = sort(words);
       boolean anagram = false ;
       if (Arrays.equals(store, store2)){
           anagram = true;
       }
       return anagram;
    }
    public static char[] sort(char[] word){
        char temp ;
        for (int a = 0; a < word.length; a++){
            for (int b = a; b < word.length; b++){
                if ( word[a] < word[b]){
                    temp = word[a];
                    word[a] = word[b];
                    word[b] = temp;
                }
            }
        }
        return word;
    }

    }

