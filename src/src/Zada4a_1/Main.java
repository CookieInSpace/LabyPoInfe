package Zada4a_1;

import java.util.Scanner;

/**
 * Created by Домашний on 29.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите знчение х ");
        double x = sc.nextDouble();
        double y = Math.pow(x,5);
        double z = y*Math.sqrt(Math.abs(x-1))+Math.abs(25-y);
        System.out.println("Значение выражения "+z);
        }

    }

