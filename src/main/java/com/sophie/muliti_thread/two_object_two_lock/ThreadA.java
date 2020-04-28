package com.sophie.muliti_thread.two_object_two_lock;

/**
 * Created by yiqiang on 2020/4/27.
 */
public class ThreadA extends Thread{
    private HasSelfPrivateNum numRef;
    public ThreadA(HasSelfPrivateNum numRef)
    {
        super();
        this.numRef = numRef;
    }
    public void run()
    {
        super.run();
        numRef.addI("a");
    }
}
