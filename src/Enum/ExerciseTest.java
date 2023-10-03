package Enum;

public class ExerciseTest {
    public static void main(String[] args) {
        Exercise exercise = Exercise.SQUATTING;
        System.out.println(exercise + " " + exercise.getTime());
        System.out.println();
        System.out.println(exercise.ordinal());
        for(Exercise size : Exercise.values()){
            System.out.println( size + ":" + size.getTime());
        }

    }
}
