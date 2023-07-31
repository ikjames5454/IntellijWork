import java.util.Arrays;

public class Victor {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,1,3,10,9,2,7};
//        for (int i = 0; i < arr.length; i ++){
//            for (int j = 0; j < arr.length; j ++){
//                int temp = arr[i];
//                if (arr[i] < arr[j]){
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        int[] newArr = new  int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean check = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == newArr[count]){
                    check = true;
                    break;
                }
            }
            if (!check){
                newArr[count] = arr[i];
                count++;
            }

        }
        System.out.println(Arrays.toString(newArr));
    }
}
