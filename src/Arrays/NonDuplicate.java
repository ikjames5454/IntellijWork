package Arrays;

public class NonDuplicate {
    public static void main(String[] args) {
        int[] a = {4, 5, 7, 23, 56, 90, 56, 5, 7, 23};
//        System.out.println(Arrays.toString(a));
        for (int num = 0; num < a.length; num++) {
            int count = 0;
            for (int nums = 0; nums < a.length; nums++) {
                if (a[num] == a[nums]) {
                    count++;

                }

            }
            if (count == 1) {
                System.out.print(a[num] + " ");
            }
    }
    }}
