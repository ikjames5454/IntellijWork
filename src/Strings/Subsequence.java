package Strings;

public class Subsequence {
    public static void main(String[] args) {
        System.out.println(subsequence("ace","abcde") );
    }
    public static boolean subsequence(String sequence, String subsequence){
        boolean confirm;
        int sequenceIndex = 0;
        int subsequenceIndex = 0;
        sequence = sequence.toUpperCase();
        subsequence = subsequence.toUpperCase();
        while (sequenceIndex < sequence.length() && subsequenceIndex < subsequence.length()){
            if (sequence.charAt(sequenceIndex) == subsequence.charAt(subsequenceIndex)){
                sequenceIndex++;
            }
            subsequenceIndex++;
        }
        confirm = sequenceIndex == sequence.length();
        return confirm;
    }

//    public static boolean subsequences(String sequence, String subsequence) {

//        boolean compare = false;
//        char[] sequence = sequence.toCharArray();
//        char[] subsequence = subsequence.toCharArray();
//        sequence = sort(sequence);
//        subsequence = sort(sequence);
//        for (int a = 0; a < sequence.length; a++) {
//            for ( int b = 0; b < subsequence.length; b++){
//                if (sequence[a] == subsequence[b]){
//                    compare = true;
//                }
//            }
//        }
//        return compare;
//    }
//    public static char[] sort(char[] word){
//        char temp ;
//        for (int a = 0; a < word.length; a++){
//            for (int b = a; b < word.length; b++){
//                if ( word[a] > word[b]){
//                    temp = word[a];
//                    word[a] = word[b];
//                    word[b] = temp;
//                }
//            }
//        }
//        return word;
//    }
//    }
    }

