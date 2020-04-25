package com.sophie.muliti_thread.stop;

/**
 * Created by yiqiang on 2020/4/24.
 */
public class SleepThread extends Thread{
    @Override
    public void run()
    {
        super.run();
        try{
            System.out.println("reun begin");
            Thread.sleep(200000);
            System.out.println("run End");
        }catch (InterruptedException e)
        {
            System.out.println("在沉睡中被停止!进入catch"+this.isInterrupted());
            e.printStackTrace();
        }
    }
}
