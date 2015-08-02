package com.company.lesson2;

/**
 * Created by Arsen on 16.07.15.
 */
public class FibonnachiFor {
    public static void main(String[] args) {

        int a1 = 0;
        int a2 = 1;
        int a3=0;


        for (int i = 0; i < 5; i++) {
            System.out.println(a1);
            a3 = a1;
            a1 = a2;
            a2 = a1 + a3;
            System.out.println("end of one circle");
        }
        System.out.println("---------------------");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
