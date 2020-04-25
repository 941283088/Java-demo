package com.sophie.muliti_thread.stop.stop_throw_lock;

/**
 * Created by yiqiang on 2020/4/25.
 */
public class MyThread extends Thread {
    private SynchronizedObject object;
    public MyThread (SynchronizedObject object)
    {
        super();
        this.object = object;
    }
    @Override
    public void run()
    {
        object.printString("b","bb");
    }
}
