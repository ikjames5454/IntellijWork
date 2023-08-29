package ChibuzorAssignment;

public class ArrayOfArrays {
    public static void main(String[] args) {
        String[][] object = new String[][]{{"x", "o", "x"}, {"o", "o", "x"}, {"o", "x", "x"}};

        for (int number = 0; number < object.length; number++) {
            for (int num = 0; num < object[number].length; num++) {
                if (object[number][num].equals("x")) {
                    object[number][num] = "1";
                }
                if (object[number][num].equals("o")) {
                    object[number][num] = "0";
                }

                System.out.print(object[number][num] + " ");

            }


            System.out.println();

        }

    }

}
