package com.sophie.muliti_thread;

/**
 * Created by yiqiang on 2020/4/22.
 */
public class Run {
    public static void main(String[] args) {
        //这个就是无序的
//        MyThreeadShare a = new MyThreeadShare("A");
//        MyThreeadShare b = new MyThreeadShare("B");
//        MyThreeadShare c = new MyThreeadShare("C");
//        a.start();
//        b.start();
//        c.start();
//        //这个就是顺序的  为什么呢?
//
        Thread a1= new MyThreeadShare("A1");
        Thread b1 = new MyThreeadShare("B1");
        Thread c1 = new MyThreeadShare("C1");
        a1.start();
        b1.start();
        c1.start();

        //共享数据
//        MyThreadNoShare share = new MyThreadNoShare();
//        Thread a2 = new Thread(share,"A2");
//        Thread b2 = new Thread(share,"B2");
//        Thread c2 = new Thread(share,"C2");
//        Thread d2 = new Thread(share,"D2");
//        a2.start();
//        b2.start();
//        c2.start();
//        d2.start();

    }
}
