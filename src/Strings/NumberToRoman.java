package Strings;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class NumberToRoman {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        System.out.println("enter the romanNumber: ");
        String roman = input.nextLine();
        System.out.println(roman(roman.toUpperCase()));
    }
    public static int roman(String numeral){
        Map<Character,Integer> romanNumberDict = new Hashtable<>();
        romanNumberDict.put('I',1);
        romanNumberDict.put('V',5);
        romanNumberDict.put('X',10);
        romanNumberDict.put('L',50);
        romanNumberDict.put('C',100);
        romanNumberDict.put('D',500);
        romanNumberDict.put('M',1000);
        int total = 0;
        int preValue = 0;
        for(int num = numeral.length()-1; num >= 0; num--){
            char b = numeral.charAt(num);
            int value = romanNumberDict.get(b);
             if (value < preValue){
                 total -= value;
             }else{
                 total += value;
             }
             preValue = value;

        }
        return total;

    }
}
