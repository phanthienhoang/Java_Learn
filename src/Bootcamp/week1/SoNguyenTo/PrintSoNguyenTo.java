package Bootcamp.week1.SoNguyenTo;

import java.util.Scanner;

public class PrintSoNguyenTo
{
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int dem = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (dem < n) {
            if (Main.isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }
}
