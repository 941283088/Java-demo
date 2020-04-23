package com.sophie.jdk8;

/**
 * Created by yiqiang on 2020/4/20.
 */
public class Test2 {
    public void myTst(MyInterface myInterface)

    {
        System.out.println("1");
        myInterface.test();
        System.out.println("2");
    }
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.myTst(()->{
            System.out.println("mytest");
        });
        System.out.printf("---------");
    }
}
