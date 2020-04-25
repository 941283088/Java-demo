package com.sophie.muliti_thread.suspend_resume_LockStop;

/**
 * Created by yiqiang on 2020/4/25.
 */
public class MyThread extends Thread {
    private long i = 0;
    @Override
    public void run()
    {
        while (true)
        {
            i++;
            System.out.println(i);
        }
    }
}
