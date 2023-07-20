package Exercise2;

public class ArrayOfArray {
    public static void main(String[] args) {
        String[][] object = new String[][]{{"x", "0", "x"}, {"o", "o", "x"}, {"o", "x", "x"}};

        for (int number = 0; number < object.length; number++) {
            for (int num = 0; num < object[number].length; num++) {
                String result = object[number][num];


                System.out.print(result + " ");


            }
            System.out.println();
        }
    }
}