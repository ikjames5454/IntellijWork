package ChibuzorAssignment;


import java.util.ArrayList;

public class Element {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(9);
        list.add(21);
        list.add(10);
        list.add(3);

        if (list.contains(10))
            System.out.println("10 exists");
        else
            System.out.println("10 does not exists");
        if (list.contains(36))
            System.out.println("36 exists");
        else
            System.out.println("36 does not exists");
        if (list.contains(10))
            System.out.println("9 exists");
        else
            System.out.println("9 does not exists");
        if (list.contains(10))
            System.out.println("21 exists");
        else
            System.out.println("21 does not exists");
    }
}
