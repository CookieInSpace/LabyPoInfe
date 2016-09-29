package Zada4a_2;

import java.util.Scanner;

/**
 * Created by Домашний on 29.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите знфчение a ");
        double a = sc.nextDouble();
        System.out.print("Веедите значение b ");
        double b = sc.nextDouble();
        double x = (Math.pow((a+b),3)-(Math.pow(a,3)+3*a*Math.pow(b,2)))/(3*b*Math.pow(a,3)+Math.pow(b,3));
        System.out.println("Значение выражения "+x);

        }
    }
