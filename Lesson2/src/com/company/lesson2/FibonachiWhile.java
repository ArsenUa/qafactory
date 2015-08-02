package com.company.lesson2;

/**
 * Created by Arsen on 16.07.15.
 */
public class FibonachiWhile {
    public static void main(String[] args) {
        int x1=0;
        int x2=1;
        int x3;
        int i=0;
        while (i<20){
            System.out.println(x1);
            x3=x1;
            x1=x2;
            x2=x1+x3;
            i++;
    }
}
}
