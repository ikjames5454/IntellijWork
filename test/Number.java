public class Number {
    public String displayNumber() {

        int number = 1;
        String result = "";
        while (number < 11) {
            if(number<10) result = result + number + ",";
           else result = result + number;

            number=number+1;
        }
        return result;
    }


}
