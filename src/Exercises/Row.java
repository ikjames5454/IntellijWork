package Exercises;

public class Row {
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



        for (int i = 0; i < picture.length;i=i+1) {
            for (int j = 0; j < picture[i].length;j+=1) {
                if (picture[i][j] == 0) {
                    System.out.print(" ");
                }
                if (picture[i][j] == 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
}

