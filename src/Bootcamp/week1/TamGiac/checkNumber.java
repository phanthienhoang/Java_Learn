package Bootcamp.week1.TamGiac;

public class checkNumber {
    public static void check(int c , int a ,int b) throws numberHonKhong,ngoaile2  {
        if (c < 0 ||a<0 || b<0) {
            throw new numberHonKhong("Number ko duoc be hon 0");
        }else if ( a+b <= c || a + c <= b || b + c <=a ) {
            throw new ngoaile2("day ko phai la tam gia");
        }
        System.out.println("tam giacs ok");
    }
}
