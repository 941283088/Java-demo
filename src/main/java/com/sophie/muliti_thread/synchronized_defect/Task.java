package com.sophie.muliti_thread.synchronized_defect;

/**
 * Created by yiqiang on 2020/4/28.
 */
public class Task {
    private String getData1;
    private String getData2;
    public synchronized void doLongTimeTask()
    {
        try
        {
            System.out.println("begin task");
            Thread.sleep(3000);
            getData1 = "长时间处理任务后从远程返回的值 1 threadNmae=" +Thread.currentThread().getName();
            getData2 =  "长时间处理任务后从远程返回的值 2 threadNmae=" +Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("task end");
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
