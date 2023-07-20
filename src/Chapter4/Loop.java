package Chapter4;

public class Loop {
    public static void main(String[] args) {
        int counter = 1;
        for (; counter <=10; counter++){
            if ( counter == 6 ){
                break;
            }
            System. out.printf("%d ", counter);
        }
        System.out.printf("\n the count that broke is: %d\n",counter);
    }
}
