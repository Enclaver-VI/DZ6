
package com.company;

import java.util.Scanner;

public class DZ5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int num = in.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 2:");
        int num2 = sc.nextInt();

        System.out.println("Результат:" + " " + num * num2);
    }
}
