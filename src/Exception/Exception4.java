package Exception;

public class Exception4 {
    public static void main(String[] args){
        int k = 8;
        int m = 2;
        try {
            int n = k + m;
            if (n > 10) {
                throw new MyException("ERROR");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
