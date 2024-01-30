package ArrayExercise;

public class VowelsReverser {
    public static void main(String[] args) {
        reverseVowels("hello");
        reverseVowels("leotcede");
    }


        public static boolean containVowel (String vowel){
            return "aeiou".contains(vowel);

        }
        public static void reverseVowels (String vowel){
            char[] split = vowel.toCharArray();
            int a = 0;
            int b = split.length - 1;
            char temp = 0;

            while (a < b) {
                while (a < b && !containVowel(String.valueOf(split[a]))) {
                    a++;
                }
                while (a < b && !containVowel(String.valueOf(split[b]))) {
                    b--;
                }
                temp = split[a];
                split[a] = split[b];
                split[b] = temp;
                a++;
                b--;
            }
            System.out.println(split);


        }

    }

