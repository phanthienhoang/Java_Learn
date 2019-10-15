package Bootcamp.week1.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang
{
    public static int[] arrayCreate(int n,Scanner input){
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("vui lòng nhập các giá trị thứ " +(i+1) );
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static void findMaxMinScore(int[] arr){
         int min = arr[0];
         int max = arr[0];
         for (int i = 0; i<arr.length; i++){
             if(arr[i] < min){
                 min = arr[i];
             }
             if(arr[i] > max){
                 max = arr[i];
             }
         }
        System.out.println("giá trị nhỏ nhất là " + min);
        System.out.println("giá trị lớn nhất là " + max);
    }
    public static void main(String[] args) {
        int[] arr;
        int n ;
        Scanner input2 = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng");

        n = input2.nextInt();

        arr= arrayCreate(n,input2);

        System.out.println(Arrays.toString(arr));

        findMaxMinScore(arr);

    }
}
