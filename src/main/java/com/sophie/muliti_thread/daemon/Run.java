package com.sophie.muliti_thread.daemon;

/**
 * Created by yiqiang on 2020/4/26.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        MyThread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(5000);
        System.out.println("我离开 thread对像也不在打印了,也就是停止了!");

    }
}
