package Chapter4;

import java.util.Scanner;

public class CreditLimit18 {

    public static void main(String[] args) {
        creditLimit();


    }






public static void creditLimit(){

    Scanner input = new Scanner(System.in);
    int newBalance = 0;
        while (true){
            System.out.print("Enter Account number: ");
            String accountNumber = input.nextLine();
            System.out.print("Enter balance at the beginning of the month: ");
            int beginningBalance = input.nextInt();
            System.out.print("Enter total all items charged by the customer this month: ");
            int totalItemCharged = input.nextInt();
            System.out.print("Enter total of all credit applied by the customer this month: ");
            int totalCreditApplied = input.nextInt();
            System.out.print("Enter Allowed credit limit: ");
            int creditLimit = input.nextInt();
            System.out.println();

            newBalance = beginningBalance + totalItemCharged - totalCreditApplied;

            if (newBalance > creditLimit){
                System.out.println("Credit limit exceeded");

            }

            System.out.printf("The newBalance: %d\n",newBalance);
            System.exit(0);
        }


}

}