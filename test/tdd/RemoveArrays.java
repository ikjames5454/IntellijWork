package tdd;

public class RemoveArrays {
    public static int[] iCanPosition(int[] element) {
        position(element, 4, 60);
        return element;
    }
    public static void position(int[] a, int position, int vr){
        for (int b = a.length-1; b > position; b--){
            a[b] = a[b-1];
        }
        a[position] = vr;
    }

    public int[] reverseArray(int[] element) {
        int oddNumbers = 0;
        int[] oddCollector = null;
        for ( int y = 0; y < element.length; y++) {
            if (y % 2 != 0) {
                oddNumbers++;
            }
        }
            oddCollector = new int[oddNumbers];
            int i = 0;
            for ( int a : element){
                if ( a % 2 != 0){
                    oddCollector[i++] = a;
                }
            }
            for ( int b = 0; b < oddCollector.length; b++){
                oddCollector[b] -= 2;
            }
           return  oddCollector;


    }
    public int[] reverseArrays(int[] elements){
        int number = 0;
        int[] evenCollector = null;
        for (int n = 0; n < elements.length; n++){
            if ( n % 2 == 0){
                number++;
            }
        }
        evenCollector = new int[number];
        int m = 0;
        for ( int i : elements){
            if ( i % 2 == 0){
                evenCollector[m++] = i;
            }
        }
        for ( int name = 0; name < evenCollector.length; name++){
            evenCollector[name] -= 2;
        }
        return evenCollector;
    }

    public int[] reversingArrays(int[] element) {
        int temp = 0;
        for ( int r = 0; r < element.length/2; r++){
            temp = element[r];
            element[r] = element[element.length - r - 1];
            element[element.length - r - 1] = temp;
        }
        for ( int n : element){

        }
        return element;
    }

    public int[] reversingArraying(int[] element) {
        int temp = 0;
        for ( int n = 0; n < element.length; n += 2){
            temp = element[n];
            element[n] = element[n + 1];
            element[n + 1] = temp;
        }
        for ( int num : element){

        }
        return element;
    }

    public int[] Arrays(int[] element) {
        int temp = 0;
        int num = 3;
        int nums = element.length-4;
        while (num < nums){
            temp = element[num];
            element[num] = element[nums];
            element[nums] = temp;
            num++;
            nums--;
        }
        for ( int y : element){

        }
        return element;

    }

    public int[] ArraysOf(int[] element) {
        for ( int n = 0; n < element.length;n++){
            element[n] += 9;
        }
        for (int n = 0; n < element.length; n++){
            if (n % 2 != 0){
                element[n] -= 5;
            }

        }

        return element;
    }

    public static int[] iCanAdd(int[] element) {
        remove(element, 67);
        remove(element, 967);
        remove(element, 7);
        return element;
    }
    public static void remove(int[] a, int vr){
        for ( int b = a.length-1; b > 0; b--){
            a[b] = a[b-1];
        }
        a[0] = vr;
    }
}
