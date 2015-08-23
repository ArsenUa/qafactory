package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Arsen on 20.08.15.
 */
public class testlesson {

    @Test
    public void test1(){
        Assert.assertEquals(20,10 +10);
        Assert.assertEquals(true,1==2);
        Assert.assertTrue(1==2);
    }

 //   @Test
   // public void test3() {
        Assert.assertEquals(10,sumAll(new int[]{1,4,2,3,0}));
    //}

    @Test
    public void testFailed(){
        Assert.assertEquals(38,sumAll(new int[]{1,41,2}));

    }

    public static int sumAll(int[] a){
        int res=0;
        for (int e:a){
            res=res+e;
            //res1=res+e
            //res2=res1(res+e)=e1;
        }
        return res;
    }

    public static int sumAll2(int[]a){
        int res=0;
        for (int i=0;i<a.length;i++){
            int e=a[i];
            res=res+e;
        }
        return res;
    }
//написать и  подсчитать все результаты

}
