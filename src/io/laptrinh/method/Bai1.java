package io.laptrinh.method;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    //nhập mảng
    public static int[] creatArr(int n, Scanner scanner){
            int [] arr = new int[n];
        for(int i =0; i<n;i++){
            System.out.println("Vui lòng nhập số hạng " + i );
            arr[i] = scanner.nextInt();
        }
        return  arr;
    }
    // in mảng ra màn hình
    public static void printArr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] agrs){
        int[] arr1,arr2,arr3;
        int n1=2, n2=3,n3=4;
        Scanner scanner = new Scanner(System.in);

        arr1 = creatArr(n1,scanner);
        arr2 = creatArr(n2,scanner);
        arr3 = creatArr(n3,scanner);

//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));

        printArr(arr1);
        printArr(arr2);
        printArr(arr3);
    }
}
