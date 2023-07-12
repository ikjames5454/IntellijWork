package Exercises;

public class Picture {
    public static void main(String[] args) {
        int[][] picture = {
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
        };

       for (int[] row : picture) {

              for(int number:row) {
                  if (number == 0) {
                      System.out.print(" ");
                  }
                  if (number == 1){
                      System.out.print("*");

                  }

              }
    System.out.print("\n") ;
          }



    }
}