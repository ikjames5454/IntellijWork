package Chapter4;

import java.util.Scanner;

public class Integer23 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int largestNumber = 0;
            int secondLargestNumber = 0;
            int thirdLargestNumber = 0;
            for(int counter = 1; counter <= 10; counter++){
                System.out.print("Enter the integer number: ");
                int integer = input.nextInt();
                if ( integer > largestNumber){
                    thirdLargestNumber = secondLargestNumber;
                    secondLargestNumber = largestNumber;
                    largestNumber = integer;
                }
                else {
                    if (integer > secondLargestNumber) {
                        thirdLargestNumber = secondLargestNumber;
                        secondLargestNumber = integer;

                    } else {
                        if (integer > thirdLargestNumber) {
                            thirdLargestNumber = integer;
                        }
                    }
                }
            }


            System.out.println("largestNumber is: " + largestNumber);
        System.out.println("Second largestNumber is: " + secondLargestNumber);
        System.out.println("third largestNumber is: " + thirdLargestNumber);

        }
    }

