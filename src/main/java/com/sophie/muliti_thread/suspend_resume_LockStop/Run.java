package com.sophie.muliti_thread.suspend_resume_LockStop;

/**
 * Created by yiqiang on 2020/4/25.
 */
public class Run {
    public static void main(String[] args) {
        try
        {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end!");
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
