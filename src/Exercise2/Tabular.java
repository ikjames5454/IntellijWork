package Exercise2;

public class Tabular {
    public static void main(String[] args) {
      multiplication();
    }

    public static void multiplication() {
        System.out.println("\t\t" + "N1" + "\t\t\t" + "N2" + "\t\t" + "N3" + "\t\t\t" + "N4" + "\t\t" + "N5");
        System.out.println();
        for (int b = 1; b < 6; b++) {
            for (int c = 1; c < 6; c++) {
                int multiplication = (int) Math.pow(b, c);

                System.out.printf("%10d", multiplication);


            }
            System.out.println();
        }

    }


}
