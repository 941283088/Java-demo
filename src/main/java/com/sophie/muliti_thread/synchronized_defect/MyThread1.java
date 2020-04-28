package com.sophie.muliti_thread.synchronized_defect;

/**
 * Created by yiqiang on 2020/4/28.
 */
public class MyThread1 extends Thread{
    private Task task;
    public MyThread1(Task task)
    {
        super();
        this.task = task;
    }
    public void run()
    {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
