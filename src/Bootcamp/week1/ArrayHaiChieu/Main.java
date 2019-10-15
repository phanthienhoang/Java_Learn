package Bootcamp.week1.ArrayHaiChieu;

import java.util.Scanner;

public class Main
{
    public static int[][] createArray(int n, int m , Scanner input)
    {
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        return  arr;
    }

    public static void print(int n,int m,int [][]arr){
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
    }
    public static void findMaxMinScore(int n, int m, int[][] arr){
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n , m;
        int arr[][];
        do {
            System.out.println("nhập vào số dòng cho mảng");
            n = input.nextInt();
            System.out.println("nhập vào số cột cho mảng");
            m = input.nextInt();
        }while (m<1 || n<1);
        arr =createArray(n,m,input);
        print(n,m,arr);
        findMaxMinScore(n,m,arr);
    }
}
