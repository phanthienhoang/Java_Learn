package Bootcamp.week1.DocSoThanhChu;

import java.util.Scanner;


public class VietNam {
    public static String don_vi(int n) {

        switch (n) {
            case 0:
                return "Không";
            case 1:
                return "Một";
            case 2:
                return "Hai";
            case 3:
                return "Ba";
            case 4:
                return "Bốn";
            case 5:
                return "Năm";
            case 6:
                return "Sáu";
            case 7:
                return "Bảy";
            case 8:
                return "Tám";
            default:
                return "Chin";
        }
    }

    public static String hang_chuc(int n) {
        switch (n) {
            case 0:
                return "Linh";
            case 1:
                return "Mười";
            case 2:
                return "Hai Mươi";
            case 3:
                return "Ba Mươi";
            case 4:
                return "Bốn Mươi";
            case 5:
                return "Năm Mươi";
            case 6:
                return "Sáu Mươi";
            case 7:
                return "Bảy Mươi";
            case 8:
                return "Tám Mươi";
            default:
                return "Chín Mươi";
        }
    }
    public static String hang_tram(int n) {

        switch (n) {
            case 0:
                return " ";
            case 1:
                return "Một Trăm";
            case 2:
                return "Hai Trăm";
            case 3:
                return "Ba Trăm";
            case 4:
                return "Bốn Trăm";
            case 5:
                return "Năm Trăm";
            case 6:
                return "Sáu Trăm";
            case 7:
                return "Bảy Trăm";
            case 8:
                return "Tám Trăm";
            default:
                return "Chin Trăm";
        }
    }

    public static void main(String[] agrs) {

        String number,result1,result2, result3;
        String num1 , num2 , num3;
        int length, parNum1 , parNum2, parNum3;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số muốn đọc");
        number = input.nextLine();
        length = number.length();

        if(length == 1){
            num1 = number.substring(length-1,1);
            parNum1 = Integer.parseInt(num1);
            result1 = don_vi(parNum1);
            System.out.println(result1);
        }

        else if(length == 2){
            num1 = number.substring(0,1);
            num2 = number.substring(1,2);
            parNum1 = Integer.parseInt(num1);
            parNum2 = Integer.parseInt(num2);
            result1 = hang_chuc(parNum1);
            result2 = don_vi(parNum2);
            System.out.println(result1 + " " + result2 );
        }

        else if(length == 3){
            num1 = number.substring(0,1);
            num2 = number.substring(1,2);
            num3 = number.substring(2,3);
            parNum1 = Integer.parseInt(num1);
            parNum2 = Integer.parseInt(num2);
            parNum3 = Integer.parseInt(num3);
            result1 = hang_chuc(parNum2);
            result2 = don_vi(parNum3);
            result3 = hang_tram(parNum1);
            System.out.println( result3 + " " +result1 + " " + result2 );
        }
        else {
            System.out.println("ko tìm thấy");
        }
    }
}
