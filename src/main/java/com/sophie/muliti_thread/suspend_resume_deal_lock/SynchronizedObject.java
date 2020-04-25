package com.sophie.muliti_thread.suspend_resume_deal_lock;

/**
 * Created by yiqiang on 2020/4/25.
 */
public class SynchronizedObject {
    synchronized public void printString()
    {
        System.out.println("begin");
        if(Thread.currentThread().getName().equals("a"))
        {
            System.out.println("a线程永远 suspend了");
            Thread.currentThread().suspend();
        }
    }
}
