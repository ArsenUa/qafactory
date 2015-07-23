package com.company;

/**
 * Created by Arsen on 16.07.15.
 */
public class FibonnachiFor {
    public static void main(String[] args) {

        int a1 = 0;
        int a2 = 1;
        int a3;


        for (int i = 0; i < 20; i++) {
            System.out.println(a1);
            a3 = a1;
            a1 = a2;
            a2 = a1 + a3;
        }
    }
}
