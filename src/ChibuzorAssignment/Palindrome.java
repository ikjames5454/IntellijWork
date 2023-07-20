package ChibuzorAssignment;

public class Palindrome {
    public static void main(String[] args) {
        String character = "peep";
        int r = 0, e = character.length()-1;

        while ( r < e) {
            if (character.charAt(r) != character.charAt(e)) {
                System.out.printf("the character is not a palindrome: %s\n",character);
                break;
            }

            r++;
            e--;

            System.out.printf("the character is a palindrome: %s",character);
            System.exit(0);

        }


        }

    }

