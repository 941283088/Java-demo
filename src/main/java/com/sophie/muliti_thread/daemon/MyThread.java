package com.sophie.muliti_thread.daemon;

/**
 * Created by yiqiang on 2020/4/26.
 */
public class MyThread extends Thread {
    private int i=0;
    public void run()
    {
        try{
            while (true)
            {
                i++;
                System.out.println("i="+(i));
                sleep(1000);
            }
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
