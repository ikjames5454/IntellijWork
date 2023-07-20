package Exercise2;

import java.util.Arrays;

public class ArrayWork2 {
    public static void main(String[] args) {
        Character[] number = new Character[10];

        for(int counter = 0; counter < number.length; counter++) {
                number[9] = 'E';
        }
        System.out.print(Arrays.toString(number) + " \n");

        for(int counter = 0; counter < number.length; counter++){
            if ( counter % 2 != 0){
                number[counter] = 'A';
            }
        }
        System.out.print(Arrays.toString(number) + " \n");

        for(int counter = 0; counter < number.length; counter++){
            if ( counter % 2 == 0){
                number[counter] = 'L';
                number[2] = 'F';
            }
        }
        System.out.print(Arrays.toString(number) + " \n");

        for(int counter = 0; counter < number.length; counter++){

                number[counter] = '5';

        }
        System.out.print(Arrays.toString(number) + " \n");
    }



}
