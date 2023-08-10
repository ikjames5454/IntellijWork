package Enum;

public class ActivityTest {
    public static void main(String[] args) {


        Activity activity = Activity.EATING;
//        if (activity == Activity.EATING){
//            System.out.println("BON APETY");
//        }
//        else if (activity == Activity.RUNNING){
//            System.out.println("BREAK A LEG");
//        }
//        else if (activity == Activity.WORKING) {
//            System.out.println("have a nice day");
//
//        }
        switch (activity){
            case WORKING:
                System.out.println("have a nice day");
                break;


            case EATING:
                System.out.println("Bon apetite");
                break;


        }




    }

    }

