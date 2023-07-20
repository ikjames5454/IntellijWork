package Exercise2;

public class sevenSegment {
    public static void main(String[] args) {
        segmentedDisplay("01100111");


    }

    public static void segmentedDisplay(String numbers){
        char james = numbers.charAt(0);
        char james1 = numbers.charAt(1);
        char james2 = numbers.charAt(2);
        char james3= numbers.charAt(3);
        char james4 = numbers.charAt(4);
        char james5 = numbers.charAt(5);
        char james6 = numbers.charAt(6);
        char james7 = numbers.charAt(7);
        char[] jamesArray = {james,james1,james2,james3,james4,james5,james6,james7};
        String[][] segment = new String[][]{
                {"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"},};
        for (int number = 0; number < segment.length; number++) {
            for (int num = 0; num < segment[number].length; num++) {
                if (numbers.charAt(7) == '1'){
                    if(numbers.charAt(0) == '0'){
                        segment[0][1] = " ";
                        segment[0][2] = " ";
                    }
                    if(numbers.charAt(1) == '0'){
                        segment[1][3] = " ";
                    }
                    if(numbers.charAt(2) == '0'){
                        segment[3][3] = " ";
                    }
                    if(numbers.charAt(3) == '0'){
                        segment[4][0] = " ";
                        segment[4][1] = " ";
                        segment[4][2] = " ";
                    }
                    if(numbers.charAt(4) == '0'){
                        segment[3][0] = " ";
                    }
                    if(numbers.charAt(5) == '0') {
                        segment[1][0] = " ";
                    }
                    if(numbers.charAt(6) == '0'){
                        segment[2][0] = " ";
                        segment[2][1] = " ";
                        segment[2][3] = " ";
                    }
                    System.out.print(segment[number][num] + " ");
                }

            }
            System.out.println();
        }

    }
}