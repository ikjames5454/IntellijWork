package OOP;

import java.util.ArrayList;

public class Name {
    public static void main(String[] args) {
//        Num num = new Num("james","semicolon");
//        Num num1 = new Num("james","semicolon");
//        num.setName("james");
//        num.setMembership("semi colon");
//        num.setMembership(Num.Membership.BRONZE);
//        System.out.print(num1.getName() +"\ta member of");
//        System.out.print("\t" + num1.getMembership() + " ");
//        System.out.println(num.equals(num1));
//        System.out.print("\t" + num1);
        Num.nums = new ArrayList<>();
        Num.nums.add(new Num("michael"));
        Num.nums.add(new Num("tomide"));
        Num.nums.add(new Num("seyi"));
        Num.nums.add(new Num("benson"));
        Num.print_array_list();
//        System.out.println(nums.get(0).getName());

    }
}
