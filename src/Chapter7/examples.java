package Chapter7;

public class examples {
    public static void main(String[] args) {
        int[] arrays = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        for(int counter = 0; counter < arrays.length;counter++){
            if (counter == 10){
                System.out.printf("%5d: ", 100);
            }
            else{
                System.out.printf("%02d-%02d: ",counter * 10, counter * 10 + 9);

            }
            for (int num = 0; num < arrays[counter]; num++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
