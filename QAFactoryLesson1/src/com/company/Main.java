package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("QA Factory");
        int a=7;
        int x=3;
        System.out.println(a);
        a=a+10*x;
        System.out.println(a);
        String s;
        s="nice time";
        System.out.println(s);
        System.out.println(s+" "+a);
        System.out.println("a="+a);
        double h=10.5;
        h=h/5;
        System.out.println(h);
        boolean g;
        g=true;
        g=false;
        g=true && false;
        System.out.println(g);
        g=true||false;
        System.out.println(g);
        System.out.println(h==2.1);
        System.out.println(10!=5); //не равно

        //МАСИВЫ!!!
        int[] m={1,10,20};
        System.out.println(m[1]);
        System.out.println(m[0]+" "+m[1]+" "+m[2]);
        int p;
        p=m[0];
        System.out.println(p);
        String[] m1={"hello","class"};
        System.out.println(m1[0]+m1[1]);
    }
}
