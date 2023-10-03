package tdd;

public class ReverseTo {

    public  String reverseMethod(int[] reverse, String name) {
        StringBuilder be = new StringBuilder();
        for (int a = 0; a < reverse.length;a++){
            for(int b = 0; b< reverse.length;b++){
                if (reverse[a] == b) {
                   be.append(name.charAt(b));
                    System.out.print(name.charAt(b));
                }
            }
        }

   return be.toString();
    }

    public static void main(String[] args) {
        ReverseTo reverse = new ReverseTo();
        String word = "kissdry";
        int[] x = {6,2,3,4,1,0,5};
        reverse.reverseMethod(x,word);


    }
}
