package Chapter5;

public class Asterisk {
    public static void main(String[] args) {


        for (int num = 0; num < 5; num++) {
            for (int nums = 0; nums < 5 - num; nums++) {
                System.out.print(" ");
            }
            for (int nums = 0; nums < num; nums++) {
                System.out.print("*");
            }
            for (int nums = 0; nums - 1 < num; nums++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int num = 0; num < 5; num++) {
            for (int nums = 0; nums < num + 1; nums++) {
                System.out.print(" ");
            }
            for (int nums = 0; nums < 5 - num; nums++) {
                System.out.print("*" );
            }
            for (int nums = 0; nums < 5 - num -1; nums++) {
                System.out.print("*" );
            }
            System.out.println();


        }
    }
}

