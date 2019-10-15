package Bootcamp.week1.OOP;

public class MyClass {
    MyClass(){}
    MyClass(float x){

    }
    void MyClass(){

    }

    public void MyClass1(int x, double y){

    }

    public static void swap(String  a, String b){
        String c ;
        c= a;
        a=b;
        b=c;
    }

    public static void main(String[] args) {
        String a ="a";
        String b ="b";
        swap( a,b);
        System.out.println(a);
        System.out.println(b);
    }
}
