public class Multiplication {
    public static void main(String[] args) {
        iCanMultiply(2, 10);
        iCanSquare(5,2);
        reverseArray(2347689);

    }

    public static int iCanMultiply(int firstNumber, int secondNumber) {
        int total = 0;
        for (int num = 1; num <= secondNumber; ) {
            total = total + firstNumber;
            num++;



        }
        System.out.println(total);
        return total;
    }

    public static int iCanSquare(int firstNumber, int secondNumber) {
        int numbers = firstNumber;
        for (int num = 1; num < secondNumber; num++) {
            numbers = iCanMultiply(numbers, firstNumber);



        }
        System.out.println(numbers);
        return numbers;

    }

    public static int reverseArray(int number) {
        String nums = number + "";
        String nun = "";
        for(int count = nums.length()-1; count >= 0;count--){
            char numbered = nums.charAt(count);
            nun += numbered;
        }
        System.out.println(nun);
        return Integer.parseInt(nun);


    }

    public int element(int number) {

    return number;
    }
}
