package Bootcamp.week1.OOP.StopWatch;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class Stopwatch {
    private final LocalTime start;
    private final LocalTime stop;

    public void fan(int x){

    }


    public Stopwatch() {
        start = LocalTime.now();
        stop = LocalTime.now();
    }

    public static void main(String[] args)  throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        Scanner input = new Scanner(System.in);

        int n;
        Stopwatch star1 = new Stopwatch();
        System.out.println("thời gian bắt đầu: " + star1.start);

        System.out.println("nhập 1 để kết thúc");
        n = input.nextInt();

        if(n==1){
            Stopwatch star2 = new Stopwatch();
            System.out.println("thời gian kết thúc: " + star2.stop);
        }
    }
}
