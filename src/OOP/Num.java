package OOP;

import java.util.List;

public class Num {
    private String name = "bronze";

    private String membership;
    public static List<Num> nums;
    public Num(String name, String membership) {
        setMembership(membership);
        setName(name);
    }
    public static void print_array_list(){
        for (Num a : nums){
            System.out.print(a.getName() + " ");
        }

    }

    public Num(String name) {
        setName(name);
    }

    public String toString(){
        return getName() + " " + getMembership();
    }
    public Num(){

    }
    public boolean equals(Num num1){
        if ( getName().equals(num1.getName()) && getMembership().equals(num1.getMembership())){
            return true;
        }
        else {
            return false;
        }
    }

    void setName(String name) {
        System.out.println("how wonderful you are");
        this.name = name;

    }

    String getName() {
        return name;
    }

    void setMembership(String membership) {
        this.membership = membership;

    }
    void setMembership(Membership membership){
        this.membership = membership.name();
    }
    String getMembership(){
        return membership;
    }
    public enum Membership {
        BRONZE,
        SILVER,
        GOLD;
    }
}

