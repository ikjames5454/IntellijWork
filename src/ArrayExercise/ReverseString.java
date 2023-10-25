package ArrayExercise;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse(("A better place")));
    }
    public  static String reverse(String names){
        String string = "";
        String[] word = names.split(" ");
        for (String words : word){
            String rev = "";
            for (int w = words.length()-1; w >= 0;w--){
                rev = rev + words.charAt(w);

            }
            string = string + rev + " ";

        }
        return string;



    }
}
