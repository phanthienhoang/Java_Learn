package Bootcamp.week1.OOP;

import java.io.IOException;

public class JLineTest
{
    public static void main(String[] args) throws  IOException{

        System.out.println("sdsadsadas");
        clrscr();
    }
    public static void clrscr(){
        //Clears Screen in Java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
}