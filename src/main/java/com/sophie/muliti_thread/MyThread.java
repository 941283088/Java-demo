package com.sophie.muliti_thread;

/**
 * Created by yiqiang on 2020/4/22.
 */
public class MyThread extends Thread{
    @Override
    public void run()
    {
        super.run();
        System.out.println("MyThread");
    }
}
