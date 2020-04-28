package com.sophie.muliti_thread.throw_exception_no_lock;

/**
 * Created by yiqiang on 2020/4/28.
 */
public class ThreadA extends Thread{
    private Service service;
    public ThreadA(Service service)
    {
        super();
        this.service = service;
    }
    public void run()
    {
        service.testMethord();
    }
}
