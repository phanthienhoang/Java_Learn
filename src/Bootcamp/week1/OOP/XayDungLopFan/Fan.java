package Bootcamp.week1.OOP.XayDungLopFan;

public class Fan
{
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    private boolean ON = false ;
    private int radius = 5;
    private String color = "blue";
    /*
    *
    * tạo get và set
    * ALT + insert
     *
    * */
    public Fan() {
}


    public Fan(boolean ON, int radius, String color) {
        this.ON = ON;
        this.radius = radius;
        this.color = color;
    }


    private static int speed = SLOW;


    public void setSpeed(String speed) {
        switch (speed){
            case "SLOW":
                this.speed = SLOW;
                break;
            case "MEDIUM":
                this.speed = MEDIUM;
                break;
            case "FAST":
                this.speed = FAST;
                break;
            default:
                System.out.println("đừng bấm khang khang");
        }
    }
    public int getSpeed() {
        return speed;
    }

    public boolean isON() {
        return ON;
    }

    public void setON(boolean ON) {

        this.ON = ON;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void setSpeed(int speed) {
        Fan.speed = speed;
    }


}
