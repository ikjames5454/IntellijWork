package OOP;

public class Printer {
//    public static void main(String[] args){
//        printArray();
//
//    }
//    public static void printArray(){
//        int[] arrays = {1, 2, 3};
//        for ( int a : arrays){
//            System.out.println(a);
//        }
//        String[] string = { "Hello", "World"};
//        for ( String b : string){
//            System.out.println(b);
//        }
//    }
//    public static void main( String args[] )
//    {
//        Printer myPrinter= new Printer();
//        Integer[] intArray = { 1, 2, 3 };
//        String[] stringArray = {"Hello","World"};
//        myPrinter.printArray( intArray  );
//        myPrinter.printArray( stringArray );
//        int count=0;
//        for (Method method : Printer.class.getDeclaredMethods()) {
//            String name = method.getName();
//            if(name.equals("printArray"))
//                count++;
//        }
//
//        if(count>1)System.out.println("Method overloading is not allowed!");
//        assert count==1;
//
//    }

    public void printArray(Integer[] array) {
        for (Integer item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void printArray(String[] array) {
        for (String item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}


//public class Main {
//        public static void main(String[] args) {
//            Printer myPrinter = new Printer();
//            Integer[] intArray = {1, 2, 3};
//            String[] stringArray = {"Hello", "World"};
//            myPrinter.printArray(intArray);
//            myPrinter.printArray(stringArray);
//
//            int count = 0;
//            for (Method method : Printer.class.getDeclaredMethods()) {
//                String name = method.getName();
//                if (name.equals("printArray")) {
//                    count++;
//                }
//            }
//
//            if (count > 1) {
//                System.out.println("Method overloading is not allowed!");
//            }
//            assert count == 1;
//        }
//    }





