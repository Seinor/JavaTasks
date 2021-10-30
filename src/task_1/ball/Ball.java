package task_1.ball;

public class Ball {
    private String model;
    private int diameter;

    public Ball(String m, int d) {
        model = m;
        diameter = d;

    }
    public Ball(){
        model = "*Empty*";
        diameter = 0;

    }
    public Ball(String m){
        model = m;
        diameter = 0;

    }

    public void setModel(String  model) {
        this.model =  model;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter () {
        return diameter;
    }

    public String getModel() {
        return model;
    }

    public String toString() {
        return this.model+", "+this.diameter + "cm";
    }


}
