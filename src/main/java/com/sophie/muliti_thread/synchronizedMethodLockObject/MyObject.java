package com.sophie.muliti_thread.synchronizedMethodLockObject;

/**
 * Created by yiqiang on 2020/4/27.
 */
public class MyObject {
    synchronized public void methodA()
    {
        try{
            System.out.println("begin methodA threadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
