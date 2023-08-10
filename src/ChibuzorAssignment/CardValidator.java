package ChibuzorAssignment;

import java.util.Scanner;

public class CardValidator {
    private static final Scanner keyboard = new Scanner(System.in);
    private static String masterCardType;
    private static String visaCardType;
    private static String americaExpressCardType;
    private static String discoverCardType;
    private static String verveCardType;
    private static int doubleOfSecondDigit;
    private static int sumOfOddPlaces;

    public static void main(String[] args) {

        System.out.println("Hello kindly enter card details to verify ");
        Long cardNumber = keyboard.nextLong();
        String converter = "";
        String cardNumberHolder = cardNumber + converter;
        int length = cardNumberHolder.length();
        int sum;
        String validity;

        int[] numberBank = new int[length];
        for (int row = 0; row < cardNumberHolder.length(); row++) {

            numberBank[row] = Integer.parseInt(String.valueOf(cardNumberHolder.charAt(row)));
//            if (row == 0) {
//                numberBank[0] = index;
//            }
//            if (row == 1) {
//                numberBank[1] = index;
//            }
//            if (row == 2) {
//                numberBank[2] = index;
//            }
//            if (row == 3) {
//                numberBank[3] = index;
//            }
//            if (row == 4) {
//                numberBank[4] = index;
//            }
//            if (row == 5) {
//                numberBank[5] = index;
//            }
//            if (row == 6) {
//                numberBank[6] = index;
//            }
//            if (row == 7) {
//                numberBank[7] = index;
//            }
//            if (row == 8) {
//                numberBank[8] = index;
//            }
//            if (row == 9) {
//                numberBank[9] = index;
//            }
//            if (row == 10) {
//                numberBank[10] = index;
//            }
//            if (row == 11) {
//                numberBank[11] = index;
//            }
//            if (row == 12) {
//                numberBank[12] = index;
//            }
//            if (row == 13) {
//                numberBank[13] = index;
//            }
//            if (row == 14) {
//                numberBank[14] = index;
//            }
//            if (row == 15) {
//                numberBank[15] = index;
//            }
       }

            if (numberBank[0] == 4) {
                visaCardType = "VisaCard";
            }
            if (numberBank[0] == 5) {
                masterCardType = "MasterCard";
            }
            if (numberBank[0] == 3 && numberBank[1] == 7) {
                americaExpressCardType = "America Express Card";
            }
            if (numberBank[0] == 6) {
                discoverCardType = "Discover Card";
            }
            if (numberBank[0] == 5 && numberBank[1] == 0) {
                verveCardType = "Verve Card";
            }

            for (var row = cardNumberHolder.length() - 1; row >= 0; row--)
                if (row % 2 == 0) {
                    int container = numberBank[row] * 2;

                    if (container < 10) {
                        doubleOfSecondDigit += container;
                    } else {
                        String bContainer = String.valueOf(container);
                        for (int i = 0; i < bContainer.length(); i++) {
                            int cContainer = Integer.parseInt(String.valueOf(bContainer.charAt(i)));
                            doubleOfSecondDigit += cContainer;
                        }
                    }

                }


            for (int col = 0; col < cardNumberHolder.length(); col++) {
                if (col % 2 != 0) {
                    sumOfOddPlaces = sumOfOddPlaces + numberBank[col];
                }
            }
            sum = sumOfOddPlaces + doubleOfSecondDigit;
            if (sum % 10 == 0) {
                validity = "Valid";
            } else validity = "Invalid";

            if (numberBank[0] == 4) {
                System.out.println("***Credit card type: " + visaCardType);
            }
            if (numberBank[0] == 5) {
                System.out.println("***Credit card type: " + masterCardType);
            }
            if (numberBank[0] == 3 && numberBank[1] == 7) {
                System.out.println("***Credit card type: " + americaExpressCardType);
            }
            if (numberBank[0] == 6) {
                System.out.println("***Credit card type: " + discoverCardType);
            }
            if (numberBank[0] == 5 && numberBank[1] == 0) {
                System.out.println("***Credit Card type: " + verveCardType);
            }
            System.out.println("***Credit Card Number: " + cardNumberHolder);
            System.out.println("***Credit Card Length: " + length);
            System.out.println("***Credit Card Validity Status: " + validity);
        }
    }


