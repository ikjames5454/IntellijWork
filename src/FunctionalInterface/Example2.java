package FunctionalInterface;

import java.util.function.Supplier;

public class Example2 {
    public static void main(String[] args) {
        Supplier<String> supplier = ()->{
            return "Hello";
        };
        String result = supplier.get();
        System.out.println(result);
    }
}
