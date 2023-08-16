package ChibuzorAssignment;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Checkout {
    private static final Scanner input = new Scanner(in);
    private static  ArrayList <String> itemsBought = new ArrayList<>();
    private static  ArrayList <Integer> numberOfPieces = new ArrayList<>();
    private static ArrayList <Double> units = new ArrayList<>();
    private static String store = "SEMICOLON STORES";
    private static String branch = "MAIN BRANCH";
    private static String location = "312, ALBERT MACAULAY WAY, SABO YABA, LAGOS.";
    private static String number = "03293828343";
    private static Object time = LocalTime.now();
    private static DecimalFormat format = new DecimalFormat("##");
    private static double subTotals;
    private static String discounts;
    private static double billsTotal;
    private static String amounts;
    private static double myBalance;

private static Object date = LocalDate.now();
    private static String cashierName;
    private static String name;
    public static void main(String[] args) {
        customersName();
        output4();

    }
    public static void customersName(){
        out.println("What is the customer's name: ");
         name = input.nextLine();
        if (name.matches("^[a-zA-Z ]+$")) {

        }
        else {
            System.out.println("Invalid name");
            customersName();
        }

        itemBought();
    }
    public static void itemBought(){
        out.println("What did the user buy: ");
        String buy = input.nextLine();
        itemsBought.add(buy);
        piecesBought();
    }
    public static void piecesBought() {
        out.println("How many pieces: ");
        String pieces = input.nextLine();
        if (pieces.matches("^[0 -9 ]+$")) {
            if (Integer.parseInt(pieces) > 0) {
                numberOfPieces.add(Integer.parseInt(pieces));
                perUnit();
            }
        }
        else{
            out.println("invalid input: ");
            piecesBought();
        }
    }
    public static void perUnit(){
        out.println("How much per unit: ");
        String unit = input.nextLine();
        if (unit.matches("^[0 -9.]+$")){
            if (Double.parseDouble(unit) > 0){
                units.add(Double.parseDouble(unit));
                addMore();
            }
        }
        else{
            out.println("invalid input");
            perUnit();
        }




    }
    public static void addMore(){
        out.println("add more item: ");
        String moreItem = input.nextLine();
        if (moreItem.equalsIgnoreCase("yes")){
            itemBought();
        }
        else if (moreItem.equalsIgnoreCase("no")) {
            cashiersName();
        }
        else{
            out.println("invalid entry: ");
            addMore();
        }

    }
    public static void cashiersName(){
        out.println("What is your name: ");
         cashierName = input.nextLine();
        if (cashierName.matches("^[a-zA-Z ]+$")) {
            discount();

        }
        else {
            System.out.println("Invalid name");
            cashiersName();
        }

    }
    public static void discount(){
        out.println("How much discount will the customer get: ");
        String discount = input.nextLine();
        discounts = discount;

        if (discount.matches("^[0-9.]+$")) {
            if (Double.parseDouble(discount) > 0){
                output();
            }
        }

        else {
            System.out.println("Invalid name");
            discount();
        }

    }
    public static void output(){

        out.println(store);
        out.println(branch);
        out.println(location);
        out.println(number);
        out.println("Date: " + date + " " + time);
        out.println("cashier: " + cashierName);
        out.println("customer's Name: " + name);
    output2();
    }
    public static void output2(){
        out.println("=".repeat(60));
        out.println("\t\t" + "ITEM" + "\t\t" + "QTY" + "\t\t\t" + "PRICE" + "\t\t\t" + "TOTAL(NGN)");
        out.println();
        out.println("-".repeat(60));
        double subtotal = 0;
        for (int num = 0 ; num < itemsBought.size(); num++){
            double individualTotal ;
            individualTotal = numberOfPieces.get(num) * units.get(num);
            subtotal += individualTotal;
            out.println("\t\t" + itemsBought.get(num) + "\t\t" + numberOfPieces.get(num) + "\t\t\t" + units.get(num) + "\t\t\t" + individualTotal );
            subTotals = subtotal;

        }
        output3();

    }
    public static void output3() {
        out.println("_".repeat(60));
        out.println("\t\t\t\t\t\t\t" + "Sub Total:" + "\t\t\t" + subTotals);
        double discount = subTotals * ((Double.parseDouble(discounts)) / 100);
        out.printf("\t\t\t\t\t\t\t Discount: \t\t\t %.2f \n", discount);
        double vat = subTotals * (17.50 / 100);
        double billTotal = subTotals - discount + vat;
        out.printf("\t\t\t\t\t\t VAT @ 17.50%%: \t\t\t %.2f \n",vat);
        out.println("=".repeat(60));
        out.println("\t\t\t\t\t\t\t" + "Bill Total:" + "\t\t\t" + billTotal);
        billsTotal = billTotal;
        out.println("=".repeat(60));

    }

    public static void output4(){
    out.println("This is not a receipt kindly pay: " + billsTotal);
    out.println("=".repeat(60));
    payment();
    }
    public static void payment(){
        out.println();
        out.println("How much did the customer give you: ");
        String amount = input.nextLine();
        double balance;
        balance = Double.parseDouble(amount) - billsTotal;
        myBalance = balance;
        amounts = amount;
        if (amount.matches("^[0 -9 .]+$")) {
            if (Integer.parseInt(amount) > 0) {
                receipt();
            }
        }
        else{
            out.println("invalid input: ");
            payment();
        }



    }

    public static void receipt(){
        output();
        out.printf("\t\t\t\t\t\t Amount Paid: \t\t\t %.2f \n", Double.parseDouble(amounts));
        out.printf("\t\t\t\t\t\t\t Balance: \t\t\t %.2f \n",myBalance);
        out.println("=".repeat(60));
        out.println( "\t\t\t\t" + "THANK YOU FOR YOUR PATRONAGE");
        out.println("=".repeat(60));


    }

}
