package Strings;

public class Examples {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.print("Progress: " + i + "%");
            System.out.print("\r"); // Carriage return to the beginning of the line
            try {
                Thread.sleep(150); // Sleep for a short time to simulate progress
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


//    String s = "hello ";
//    String g = "how are ";
//    String m = "doing with the ";
//    int b = 50000;
//    String c = " money";
//    StringBuilder n = new StringBuilder().append(s).append(g).append(m).append(b).append(c);
//        System.out.println(n);



}}}
