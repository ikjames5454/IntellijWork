package Hackerthon;

import java.lang.reflect.Method;

public class Methods {
    public static void main(String[] args) {
        Methods print = new Methods();
        Integer[] numbers = {1, 2, 3, 4};
        String[] strings = {"hello", "world"};
        print.arraysNumber(numbers);
        print.arraysNumber(strings);
        print.arraysNumber();
        int count = 0;
        for (Method method : Methods.class.getDeclaredMethods()) {
            String name = method.getName();
            if (name.equals("arraysNumber")) {
                count++;
            }
            if (count > 1) {
                System.out.println("Method overloading is not allowed");
            }
            assert count == 1;


        }


    }

    public void arraysNumber(Object[] element) {
        for (Object a : element) {
            System.out.println(a);
        }

    }

    public void arraysNumber() {
        System.out.println("Hello world");
    }
}
