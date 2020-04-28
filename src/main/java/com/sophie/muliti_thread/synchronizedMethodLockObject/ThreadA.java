package com.sophie.muliti_thread.synchronizedMethodLockObject;

/**
 * Created by yiqiang on 2020/4/27.
 */
public class ThreadA extends Thread {
    private MyObject object;
    public ThreadA(MyObject object)
    {
        super();
        this.object = object;
    }
    @Override
    public void run()
    {
        super.run();
        object.methodA();
    }
}
