package com.sophie.muliti_thread;

/**
 * Created by yiqiang on 2020/4/22.
 */
public class MyThreeadShare extends Thread{
    private int count=5;
    public MyThreeadShare(String name)
    {
        super();
        this.setName(name);
    }
    @Override
    public void run()
    {
        super.run();
        while (count >0)
        {
            count -- ;
            System.out.println("由" + this.currentThread().getName()+"计算,count="+count);

        }
    }
}
