package Exercise2;

import java.security.SecureRandom;

public class DiceRolling {
    public static void main(String[] args) {
        DiceRolling newDice = new DiceRolling();
        newDice.rollingADie();

    }

    public void rollingADie(){
        SecureRandom randomValue = new SecureRandom();
        int random1 = 0;
        int random2 = 0;
        int random3 = 0;
        int random4 = 0;
        int random5 = 0;
        int random6 = 0;
        for(int num = 1; num < 60_000_000;num++){
            int random = 1 + randomValue.nextInt(6);
            if (random == 1){
                random1++;

            }
            if (random == 2){
                random2++;
            }
            if (random == 3){
                random3++;

            }
            if (random == 4){
                random4++;

            }
            if (random == 5){
                random5++;

            }
            if (random == 6){
                random6++;

            }

        }
        System.out.println("Random\t\tOccurrence of numbers");
        System.out.printf("1\t\t%20d\n2\t\t%20d\n3\t\t%20d\n4\t\t%20d\n5\t\t%20d\n6\t\t%20d",random1,random2,random3,random4,random5,random6);

    }
}
