package tdd;

public class NamesInput {

    public static void main(String[] args) {
        NamesInput names = new NamesInput();
        String name = "ikenna alagbu";
        names.collectName(name);

    }
    public String  collectName(String fullName) {
        String[] array = fullName.split(" ");
        String newName = "";
        for (int a = 0; a < array.length-1; a++){
            newName += array[a].toUpperCase().charAt(0)+ ". ";
        }
        String names = newName+ array[array.length-1];
        System.out.println(names);

        return names;


    }

    public int canAdd(String characters) {
        int sum = 0;
        for (int a = 0; a < characters.length(); a++){
            char num = characters.charAt(a);
            if (Character.isDigit(num)){
                sum += Character.getNumericValue(num);
            }
        }
        return sum;
    }
}
