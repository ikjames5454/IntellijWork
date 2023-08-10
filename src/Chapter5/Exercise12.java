package Chapter5;

public class Exercise12 {
    public static void main(String[] args) {
divisible();
    }

    public static void divisible(){
        int sum = 0;
        for(int num = 1; num < 30; num++){
            if (num % 3 == 0){
                sum = sum + num;
//                System.out.println(num + "\n");
                System.out.println("the sums are: " + sum);

            }
        }
        System.out.println("the sum is: " + sum);
    }
}
