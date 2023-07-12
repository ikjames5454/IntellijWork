package tdd;

public class Financial {
    private double rmb;
    private int dollar;




    public void convertDollar(double dollar) {
        this.rmb = dollar * 6.81;
    }

    public double getRmb() {
        return rmb;
    }

    public void convertRMD(double rmb){
    this.dollar = (int)(rmb / 6.81);
    }
    public int getDollar(){
    return dollar;
        }

    }

