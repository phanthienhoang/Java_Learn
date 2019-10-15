package Bootcamp.week1.HienThiLoiChao;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String str;
        System.out.println("nhập tên người bạn muốn chào");

        Scanner input = new Scanner(System.in);
        str = input.nextLine();

        System.out.println("hi " +str);
    }
}
