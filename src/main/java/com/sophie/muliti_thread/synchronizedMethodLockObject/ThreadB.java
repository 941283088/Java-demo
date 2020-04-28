package com.sophie.muliti_thread.synchronizedMethodLockObject;

/**
 * Created by yiqiang on 2020/4/27.
 */
public class ThreadB extends Thread{
    private MyObject object;
    public ThreadB(MyObject object)
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
