package com.sophie.muliti_thread.stop;


/**
 * Created by yiqiang on 2020/4/24.
 */
public class Run {
    public static void main(String[] args) {
        try
        {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(20);
            myThread.interrupt();
            System.out.println("是否终止1="+Thread.interrupted());
            System.out.println("是否终止2="+MyThread.interrupted());
        }catch (Exception e)
        {
            System.out.println("main cache");
            e.printStackTrace();
        }
    }
}
