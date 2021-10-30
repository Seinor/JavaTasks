package task_1.ball;

public class TestBall {

    public static void main(String[] args) {

        Ball b1 = new Ball("Ball1", 23);
        System.out.println(b1);
        Ball b2 = new Ball("Ball2");
        b2.setDiameter(12);
        System.out.println(b2);


    }
}