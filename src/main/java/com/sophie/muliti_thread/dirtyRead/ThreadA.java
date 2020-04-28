package com.sophie.muliti_thread.dirtyRead;

/**
 * Created by yiqiang on 2020/4/28.
 */
public class ThreadA extends Thread{
    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar)
    {
        super();
        this.publicVar = publicVar;
    }
    public void run()
    {
        super.run();
        publicVar.setValue("B","BB");
    }
}
