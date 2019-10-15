package Bootcamp.week1.Time;

import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        Date now = new Date();
        System.out.println("giờ hiện tại là: " + now);
        System.out.println(java.time.LocalDateTime.now());
    }
}
