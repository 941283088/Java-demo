package com.sophie.muliti_thread.stop;

/**
 * Created by yiqiang on 2020/4/24.
 */
public class RunSleep {
    public static void main(String[] args) {
        try
        {
            SleepThread thread = new SleepThread();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        }catch (InterruptedException e)
        {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
