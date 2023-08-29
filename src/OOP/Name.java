package OOP;

public class Name {
    public static void main(String[] args) {
        Num num = new Num();
        num.setName("james");
        num.membership = "semi colon";
        System.out.print(num.getName() +"\ta member of");
        System.out.print("\t" + num.membership);
    }
}
