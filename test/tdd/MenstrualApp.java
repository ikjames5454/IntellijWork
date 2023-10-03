package tdd;

import javax.swing.*;

public class MenstrualApp {
    private static Menstrual menstrual = new Menstrual();

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        try {
            displayMessage("WELCOME TO SIMPLE MENSTRUAL APP");
            mainMenu();
        }catch (Exception e){
            displayMessage("wrong action");
            menu();
        }
    }
    public static void mainMenu(){
        int menstrual = Integer.parseInt(inputMethod("""
                My beautiful ladies una don land, oya choose option
                1. Check beginning of flow date
                2. Check end of menstrual circle
                3. Check ovulation Date
                4. Check next safe Date
                5. exit
                """));
        switch (menstrual){
            case 1: beginningOfDate();
            case 2: endOfMenstrualApp();
            case 3: ovulationDate();
            case 4: safeDate();
            case 5: exit();
            default:mainMenu();
        }

    }

    private static void beginningOfDate() {
        try {
            String lastPeriod = inputMethod("Enter the last date of period in this format: YY-MM-DD");
            int circleDuration = Integer.parseInt(inputMethod("Enter the duration of your circle"));
            String display = String.valueOf(menstrual.checkNextFlowDate(lastPeriod, circleDuration));
            displayMessage("your next flow date start: " + display);
            mainMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            beginningOfDate();
        }
    }

    private static void endOfMenstrualApp() {
        try{
            String lastPeriod = inputMethod("Enter the last date of period in this format: YY-MM-DD");
            int circleDuration = Integer.parseInt(inputMethod("Enter the duration of your circle"));
            String display = String.valueOf(menstrual.checkEndOfMenstrualCircle(lastPeriod,circleDuration));
            displayMessage("your menstrual circle ends at: " + display);
            displayMessage("so your period start a day after the end of your circle");
        }catch (Exception e){
            displayMessage(e.getMessage());
        }
    }

    private static void ovulationDate() {
        try{
            String lastPeriod = inputMethod("Enter the last date of period in this format: YY-MM-DD");
            int circleDuration = Integer.parseInt(inputMethod("Enter the duration of your circle"));
            String display = String.valueOf(menstrual.ovulationDate(lastPeriod,circleDuration));
            displayMessage("your ovulation date start " + display);
            displayMessage("which last for a period of 24 hours, it start in between your circle that is half of your circle \n" +
                    " duration, so you have a high percentage chance of getting pregnant, so thread carefully");
            mainMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            ovulationDate();
        }
    }

    private static void safeDate() {
        try{
            String lastPeriod = inputMethod("Enter the last date of period in this format: YY-MM-DD");
            int circleDuration = Integer.parseInt(inputMethod("Enter the duration of your circle"));
            String display = String.valueOf(menstrual.nextSafeDate(lastPeriod,circleDuration));
            displayMessage("your safe date is: " + display);
            displayMessage("your safe date start 7 days before the end of your menstrual circle \n " +
                    "not hundred percent guaranteed, you fit still get belle, is not a reliable contraception \n," +
                    "Sperm can survive inside the female reproductive tract for a few days,");
            mainMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            safeDate();
        }

    }

    private static void exit() {
        int display = Integer.parseInt(confirmMethod("are you sure you want to logout", String.valueOf(JOptionPane.YES_NO_OPTION)));
        if (display == JOptionPane.YES_OPTION){
            System.exit(1);
        }else {
            mainMenu();
        }


    }

    public static String inputMethod(String input) {
        return JOptionPane.showInputDialog(null, input);
    }

    public static void displayMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    public static String confirmMethod(String confirmInput, String yesORNo){
        return String.valueOf(JOptionPane.showConfirmDialog(null,confirmInput,yesORNo,JOptionPane.YES_NO_OPTION));
    }
}
