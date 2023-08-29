package Arrays;

public class SortedString {
    public static void main(String[] args) {
        String name = "Pension";
        String convert = name.toLowerCase();
        char[] str = convert.toCharArray();
        char temp;
//        for (int a = 0; a < str.length-1; a++){
//            for (int b = a; b < str.length; b++){
//                if ( str[a] > str[b]){
//                    temp = str[a];
//                    str[a] = str[b];
//                    str[b] = temp;
//                }
//            }
//        }
//
//            System.out.println(str);

        int a = 0;
        int b = str.length-1;
        while ( a < b) {
            char num;
            num = str[a];
            str[a] = str[b];
            str[b] = num;
            a++;
            b--;
        }
        System.out.println(str);
    }
}
