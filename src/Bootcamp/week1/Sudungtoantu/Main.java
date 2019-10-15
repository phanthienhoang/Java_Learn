package Bootcamp.week1.Sudungtoantu;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        float width;
        float height;

        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào chiều cao: ");
        width=input.nextFloat();

        System.out.println("Nhập vào chiều rộng: ");
        height=input.nextFloat();

        float area = width * height ;
        System.out.println("Area is: " + area);
    }
}
