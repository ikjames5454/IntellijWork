package Chapter4;

public class Exercise32 {
    public static void main(String[] args) {

        for ( int count = 0; count < 16; count++){
            for ( int counter = 0; counter < 16; counter++ ){
                if ( (count + counter) % 2 == 0 ){
                    System.out.print("* " );
                }
               else{
                    System.out.print(" " );
                }
            }
            System.out.println();
        }


    }
}
