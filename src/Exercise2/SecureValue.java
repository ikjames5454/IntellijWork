package Exercise2;

import java.security.SecureRandom;

public class SecureValue {
    public static void main(String[] args) {
        SecureRandom randomValues = new SecureRandom();

        for(int number = 1; number <= 20; number++){
            int randomNumber = 1 + randomValues.nextInt(6);
            System.out.printf("%d ",randomNumber);

            if (number % 5 == 0){
                System.out.println();
            }
        }

    }
}
