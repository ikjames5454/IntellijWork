package ArrayExercise;

public class Multiple {
    public static void main(String[] args) {
        int[] b = {1,2,3,4,5,6,7,8,6,9};
        for (int r = 0; r < b.length; r++){
            for (int a = r + 1; a < b.length; a++){
                if (b[r] == b[a]){
                    System.out.print(b[a]);
                }
            }

        }
    }
}
