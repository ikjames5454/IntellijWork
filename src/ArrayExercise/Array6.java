package ArrayExercise;

public class Array6 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        int[][] b = {{1,2},{3},{4,5}};

        System.out.println("the array in a");
        output(a);
        System.out.println("the array in b");
        output(b);
        System.out.println("the total in a is");
        total(a);
        System.out.println("the total in b is");
        total(b);
    }
    public static void output(int[][] b){
        for (int a = 0; a < b.length; a++){
            for (int c = 0; c < b[a].length; c++){
                System.out.printf("%d ",b[a][c]);
            }
            System.out.println();
        }
    }
    public static void total(int[][] r){
        int total = 0;
        for (int a = 0; a < r.length; a++){
            for (int c = 0; c < r[a].length; c++){
                total += r[a][c];
            }

        }
        System.out.println(total);
    }
}
