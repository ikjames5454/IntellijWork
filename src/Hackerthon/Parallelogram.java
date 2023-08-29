package Hackerthon;

import java.util.Scanner;

public class Parallelogram {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter te number of breadth and height: ");
//        int breadth = input.nextInt();
//        int height = input.nextInt();
//        int area;
//
//        try {
//            if (breadth < 0 && height < 0) {
//                throw new IllegalArgumentException("breadth and height must be positive");
//            } else {
//                area = breadth * height;
//                System.out.println(area);
//            }
//
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//
//    }


//    public static void main(String[] args) {
//        int area = flags();
//        System.out.println(area);
//
//    }
//    public static int flags () {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter te number of breadth and height: ");
//        int breadth = input.nextInt();
//        int height = input.nextInt();
//        try {
//            if (breadth < 0 || height < 0) {
//                throw new IllegalArgumentException("breadth and height must be positive");
//
//            }
//            return breadth * height;
//        }catch (IllegalArgumentException e){
//            System.out.println(e);
//            throw e;
//        }
//
//    }
//}

    public static void main(String[] args) {
        try {
            int area = flags();
            System.out.println(area);
        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int flags() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of breadth and height: ");
        int breadth = input.nextInt();
        int height = input.nextInt();
        input.close();

        if (breadth < 0 || height < 0) {
            throw new IllegalArgumentException("Breadth and height must be positive");
        }

        return breadth * height;
    }
}


