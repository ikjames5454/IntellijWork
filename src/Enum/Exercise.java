package Enum;

public enum Exercise {
    JUMPING("10minute"),
    SQUATTING("15Minute"),
    STRETCHING(),
    BOXING("18minute"),
    ;
    private String time;

    public static void main(String[] args) {

    }
        Exercise(String time) {
            this.time = time;
            System.out.println(this.name());

        }
        Exercise() {
            this.time = "5minute";
        }

        public void setTime (String time){
            this.time = time;
        }
        public String getTime () {
            return time;
        }
    }
