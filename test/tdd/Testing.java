package tdd;

import java.time.LocalDate;
import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
        //System.out.println( date());
        //ovulation();
        //System.out.println(safeDates());
        System.out.println(date());
    }
   public static ArrayList<LocalDate> date(){
       LocalDate localDate = LocalDate.of(2023,9,17);
       localDate = localDate.plusDays(29);
       ArrayList<LocalDate> dates = new ArrayList<>();
       for (int i = 0; i < 7; i++) {
           localDate = localDate.plusDays(1);
           dates.add(localDate);
       }
       return dates;
   }
   public static void ovulation(){
       LocalDate localDate = LocalDate.of(2023,9,17);
       localDate = localDate.plusDays(30 - 14);
       //ArrayList<LocalDate> dates = new ArrayList<>();
//       for (int i = 0; i < 7; i++) {
//           localDate = localDate.plusDays(1);
//           dates.add(localDate);
//       }
       System.out.println(localDate);
   }
   public static ArrayList<LocalDate> safeDates(){
       LocalDate localDate = LocalDate.of(2023,9,17);
       localDate = localDate.plusDays(30);
       ArrayList<LocalDate> dates = new ArrayList<>();
       for (int i = 0; i < 9; i++) {
           localDate = localDate.minusDays(1);
           dates.add(localDate);
       }
       return dates;
   }
   public static ArrayList<LocalDate> mensDay(){
       LocalDate localDate = LocalDate.of(2023,9,17);

       //localDate = localDate.plusDays(29);
       ArrayList<LocalDate> dates = new ArrayList<>();
       dates.add(localDate);
       for (int i = 0; i < 6; i++) {
           localDate = localDate.plusDays(1);
           dates.add(localDate);
       }
       return dates;
   }

}
