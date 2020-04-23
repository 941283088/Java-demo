package com.sophie.muliti_thread;

/**
 * Created by yiqiang on 2020/4/22.
 */
public class MyThreadNoShare extends Thread {
    private int count =8;
//    public MyThreadNoShare(String name)
//    {
//        super();
//        this.setName(name);
//    }
    @Override
    synchronized public void run()
    {
        super.run();
        //while (count >0)
        {
            count -- ;
            System.out.println("由" + this.currentThread().getName()+"计算,count="+count);

        }
    }
}
