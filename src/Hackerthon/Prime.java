package Hackerthon;

public class Prime {

        public void checkPrime(int... numbers) {
            for (int number : numbers) {
                if (isPrime(number)) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }

        public boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

