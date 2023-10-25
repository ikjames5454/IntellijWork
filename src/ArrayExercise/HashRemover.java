package ArrayExercise;

public class HashRemover {
//    public static void main(String[] args) {
//        System.out.println(condition());
//    }
//    public  static boolean condition(){
//        String words = "abchrr####chr";
//        String output1 = check(words);
//        System.out.println(output1);
//        String wordss = "abchr";
//        String output = check(wordss);
//        boolean check = false;
//        System.out.println(output);
//        if (output1.equals(output)){
//            check = true;
//            }return check;
//    }
//    public static String check(String word) {
//        char[] name = word.toCharArray();
//        String store = "";
//        for (int a = 0; a < name.length; a++) {
//            if (name[a] == '#') {
//                store += word.replace(name[a], ' ').replace(name[a-1], );
//            }
//            return store;
//        }

//        String name = "";
//                for (int a = 0; a < word.length(); a++){
//                    if (word.charAt(a) == '#'){
//                        name = word.replace(word.charAt(a), ' ').replace(word.charAt(a-1), ' ');
//                    }
//                    break;
//                }
//                if (name.toString().contains("#")){
//                    name = check(name);
//                }
//                return name;

//        if (word.contains("#")) return word.replaceAll(".+#+","");
//        else return word;

    public static String remove(String word) {
        char[] newWord = word.toCharArray();
        int index = 0;

        for (int i = 0; i < word.length(); i++) {
            if (newWord[i] == '#') {
                if (index > 0) {
                    index--;
                }
            } else {
                newWord[index] = newWord[i];
                index++;
            }
        }

        return new String(newWord, 0, index);
    }

    public static void main(String[] args) {
        String word = "abcd##ewd####";
        String name = remove(word);
        System.out.println(name);
    }
}



