package com.sophie.muliti_thread.stop;

/**
 * Created by yiqiang on 2020/4/24.
 */
public class Run3 {
    public static void main(String[] args) {
        try
        {
            MyThread thread = new MyThread();
            thread.start();
            thread.interrupt();
            System.out.println("是否终止1="+thread.isInterrupted());
            System.out.println("是否终止2="+thread.isInterrupted());
        }catch (Exception e)
        {
            System.out.println("main cache");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
