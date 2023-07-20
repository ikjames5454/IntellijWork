package Chapter4;

public class Exercise4_6 {
    public static void main(String[] args) {
    loop();
    }


    public static void loop() {
        int x = -2;
        int total = 0;
        while (x <= 10) {
            int y = x + 2;
            x++;
            total += y;
            System.out.printf("Y is: %d and total is %d\n", y, total);
        }
    }
}