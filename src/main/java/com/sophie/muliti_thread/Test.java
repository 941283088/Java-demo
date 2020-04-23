package com.sophie.muliti_thread;

/**
 * Created by yiqiang on 2020/4/22.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(MyThread.currentThread().getName());
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("end!");

        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("end!");

    }
}
