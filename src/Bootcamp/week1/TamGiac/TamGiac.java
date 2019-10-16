package Bootcamp.week1.TamGiac;

import java.util.Scanner;

public class TamGiac {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("nhap gia tri");
        a = input.nextInt();
        System.out.println("nhap gia tri");
        b = input.nextInt();
        System.out.println("nhap gia tri");
        c = input.nextInt();
        try {
            checkNumber.check(a,b,c);
        } catch (ngoaile1 e) {
            System.out.println(e.getMessage());
        }catch (ngoaile2 e) {
            System.out.println(e.getMessage());
        }
    }
}
