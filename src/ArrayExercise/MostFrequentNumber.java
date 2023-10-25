package ArrayExercise;

public class MostFrequentNumber {
    public static void main(String[] args) {
        int[] num = {3,2,3, 2, 2, 2,3,3,2,2,2};
        int mostFrequency = num[0];
        int store = 0;
        for (int b = 0; b < num.length; b++){
            int count = 0;
            for (int c = 0; c < num.length; c++){
                if (num[b] == num[c]){
                    count++;

                }

                }
            if (count > mostFrequency) {
                mostFrequency = count;
                store = num[b];

            }
            }
        System.out.print(store);
        }
    }

