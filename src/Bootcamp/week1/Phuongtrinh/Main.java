package Bootcamp.week1.Phuongtrinh;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double a;
        double b;

        Scanner input = new Scanner(System.in);

        System.out.println("nhập a:");
        a = input.nextDouble();

        System.out.println("nhập b: ");
        b = input.nextDouble();

        double x ;

        if(a!=0){
            x = (-b)/a;
            System.out.println("phương trình có 1 nghiệm là: " + x);
        }else {
            if(b==0) {
                System.out.println("phương trình có vô số nghiệm");
            }
            if(b!=0){
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
