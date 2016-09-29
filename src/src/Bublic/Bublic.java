package Bublic;

import java.util.Scanner;

/**
 * Created by Домашний on 30.09.2016.
 */
public class Bublic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение х ");
        double x = sc.nextDouble();
        System.out.print("Введите значение y ");
        double y = sc.nextDouble();
        boolean a = (x*x+y*y<=4) &&! (x*x+y*y<=1);
        System.out.println("Попадание в заданную область "+a);
    }
}
