package Bootcamp.week1.ArrayHaiChieu.MaTranVuong;

import  Bootcamp.week1.ArrayHaiChieu.Main;
import java.util.Scanner;

public class TinhTongDuongCheo
{
    public static int tinhTongCheo(int n ,int[][] arr){
        int sum = 0;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j){
                    sum +=arr[i][j];
                }
            }
        }
        return sum;
    }
    public static  int tinhTongTheoCot(int n ,int c ,int[][] arr){
        int sum = 0;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(j==c){
                    sum +=arr[i][c];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m ,c ,sum, sumCot;
        int arr[][];
        do
        {
            System.out.println("nhập vào số dòng cho mảng");
            n = input.nextInt();
            System.out.println("nhập vào số cột cho mảng");
            m = input.nextInt();
        }while(m!=n);


        arr = Main.createArray(n, m, input);
        Main.print(n, m, arr);
        sum=tinhTongCheo(n,arr);
        System.out.println("Tổng của các phần tử chéo trong ma trận vuông là " + sum);

        do {
            System.out.println("nhập cột bạn muốn tính");
            c = input.nextInt()-1;
        }while (c>n || c<0);

        sumCot=tinhTongTheoCot(n,c,arr);

        System.out.println("Tổng của các phần tử trong cột "+ (c+1) +" ma trận vuông là " + sumCot);
    }
}
