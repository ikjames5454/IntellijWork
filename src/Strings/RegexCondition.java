package Strings;

public class RegexCondition {
    public static void main(String[] args) {
        System.out.println(followsPattern("aba"));
        System.out.println(followsPattern("abab"));
        System.out.println(followsPattern("abcabc"));
        System.out.println(followsPattern("abcdabce"));

    }

            public static boolean followsPattern(String input) {
                boolean check = false;
                int length = input.length();
                if (length % 2 != 0 ) {
                  return false;
                }else {
                    int halfLength = length / 2;
                    String firstHalf = input.substring(0, halfLength);
                    String secondHalf = input.substring(halfLength);
                    if (firstHalf.equals(secondHalf)){
                        check = true;
                    }
                }
                return check;
            }
    }

