package Exercise2;

import java.util.Arrays;

public class ArrayWork {
    public static void main(String[] args) {
        double[] number = new double[8];

        for(int counter = 0; counter < number.length; counter++) {
            number[counter] = 7;

        }
        System.out.print(Arrays.toString(number) + " \n");

        for(int counter = 0; counter < number.length; counter++) {
            number[counter] = 7;


            if (counter % 2 != 0){
                number[counter] -= 1.5;

            }
        }
        System.out.print(Arrays.toString(number));

        for(int counter = 0; counter < number.length; counter++) {
            if (counter % 2 == 0) {
                number[counter] += 2.3;
                number[0] = number[counter] - 4.7;

            }

            if (counter % 2 != 0) {
                number[counter] = 7;
                number[counter] -= 1.5;
                number[7] = number[counter] - 4.7;
            }
        }

                System.out.printf("\n" + Arrays.toString(number));


            }
        }