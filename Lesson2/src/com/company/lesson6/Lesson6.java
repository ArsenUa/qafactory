package com.company.lesson6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Arsen on 04.08.15.
 */
public class Lesson6 {
    public static void main(String[] args) {
ArrayList<Integer> a= new ArrayList<Integer>();
        System.out.println(a.size());//0
        a.add(10);
        System.out.println(a.size());
        a.add(1);
        a.add(5);
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        a.remove(0);
        System.out.println(a.size());
        Integer[] a1={1,2,10,20};
        a.addAll(Arrays.asList(a1));
        System.out.println(a.size());

    }
}
