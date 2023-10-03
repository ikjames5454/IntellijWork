package Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] name = {6,2,3,4,1,0,5};
        String word = "kissdry";

        for (int a = 0; a < name.length; a++){
            for (int b = 0; b < name.length;b++ ){
                if (name[a] == b){
                    System.out.print(word.charAt(b));
                }


            }
        }
    }
}
