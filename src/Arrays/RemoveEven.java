package Arrays;

import java.util.Arrays;

public class RemoveEven {
    public static void main(String[] args) {
        int[] arrays = {22, 41, 15, 8, 2, 1};
        int oddNumber = 0;
        int[] odd = null;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                oddNumber = oddNumber + 1;
            }
        }
            odd = new int[oddNumber];
            System.out.println(Arrays.toString(odd));

            int i = 0;
            for (int nums : arrays) {
                if (nums % 2 != 0) {
                    odd[i++] = nums;
                }
            }
            System.out.println(Arrays.toString(odd));
            for (int nums = 0; nums < odd.length; nums++) {
                odd[nums] -= 2;
            }
            System.out.println(Arrays.toString(odd));

        }

    }


