package tdd;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>james = new ArrayList<>();
        james.add("Ikenna");
        james.add("Ike");
        james.add("victor");
        james.remove("victor");
        System.out.println(james);
    }

}
