package multDimensionalArray;

public class Array3 {
    public static void main(String[] args) {
        int[][] integers = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        for (int i = 0; i < integers.length; i++){
            int sum = 0;
            for (int j = 0; j < integers[i].length; j++){
                sum += integers[i][j];
            }
            System.out.println("The sum of row " + (i + 1) + ": " + sum);
        }
        System.out.println();
        for (int i = 0; i < integers[0].length; i++){
            int sum = 0;
            for (int j = 0; j < integers.length; j++){
                sum += integers[j][i];
            }
            System.out.println("The sum of column " + (i + 1) + ": " + sum);
        }
    }
}
