package com.sophie.muliti_thread.priority;

/**
 * Created by yiqiang on 2020/4/26.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        ThreadA a1 = new ThreadA();
        ThreadA a2 = new ThreadA();
        a1.setPriority(Thread.NORM_PRIORITY -3);
        a1.start();
        a2.setPriority(Thread.NORM_PRIORITY +3);
        a2.start();
        Thread.sleep(2000);
        a1.stop();
        a2.stop();
        System.out.println("a1="+a1.getCount());
        System.out.println("a2="+a2.getCount());
    }
}
