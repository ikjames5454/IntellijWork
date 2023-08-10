package Chapter5;

//public class CompoundInterest {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
////        (Modified Compound-Interest Program) Modify the application in Fig. 5.6 to use only in-
////                tegers to calculate the compound interest. [Hint: Treat all monetary amounts as integral numbers
////        of pennies. Then break the result into its dollars and cents portions by using the division and re-
////                mainder operations, respectively. Insert a period between the dollars and the cents portions.]
//
//        System.out.print("Enter principal amount in pennies: ");
//        int principal = input.nextInt();
//
//        System.out.print("Enter annual interest rate (as a decimal): ");
//        double annualRate = input.nextDouble();
//
//        System.out.print("Enter number of years: ");
//        int years = input.nextInt();
//
//        int amount;
//        int dollars;
//        int cents;
//
//        System.out.println("Year\tAmount on Deposit");
//
//        for (int year = 1; year <= years; year++) {
//            amount = principal * 100; // Convert principal to pennies
//
//            // Calculate amount with compound interest using integers
//            for (int i = 0; i < year; i++) {
//                amount += (amount * annualRate);
//            }
//
//            dollars = amount / 100; // Get the dollar portion
//            cents = amount % 100; // Get the cent portion
//
//            System.out.printf("%d\t$%d.%02d%n", year, dollars, cents);
//        }
//    }
//}

