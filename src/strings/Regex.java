package strings;

public class Regex {
    public static void main(String[] args) {
        String number = "09036234553";
        System.out.println(regex(number));

    }
    public static boolean regex(String number) {
        String regex = "^(080|081|070|090|091)\\d{8}$|^(0805|0807|0809|0815|0817|0905|0915|0802|0808|0812|0701|0902|0809|0819|0909)\\d{7}$";
        if (!number.matches(regex)){
            return false;
        }else{
            return true;
        }
    }
}
