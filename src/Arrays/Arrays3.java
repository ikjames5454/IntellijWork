package Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] name = {20, 45, 6, 12, 34, 5, 6, 7, 8, 99, 87};
        int total = 0;
        System.out.println(name.length);
        for (int count = 0; count < name.length; count++) {
            total += name[count];



        }
        System.out.println(total);
        int[] names = new int[]{name.length};
        for (int count = 0; count < names.length; count++) {
            System.out.println(names[count]);
        }
    }
}
