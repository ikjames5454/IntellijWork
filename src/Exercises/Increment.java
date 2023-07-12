package Exercises;

public class Increment {
    public static void main(String[] args) {
        int number = 8;
        System.out.printf("number before post increment: %d%n",number);
        System.out.printf("number during post increment: %d%n",number++);
        System.out.printf("number after post increment: %d%n%n",number);
         number = 8;
        System.out.printf("number before pre increment: %d%n",number);
        System.out.printf("number during pre incrementing: %d%n",++number);
        System.out.printf("number after preincrement: %d%n",number);

    }
}
