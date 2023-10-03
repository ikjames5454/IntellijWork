import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a name: ");
        String name = input.nextLine();
        Pattern pattern = Pattern.compile("hello");
        Matcher matcher = pattern.matcher(name);

        boolean found = matcher.find();
        System.out.println(found);
    }
}
