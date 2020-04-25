package com.sophie.muliti_thread.stop;

/**
 * Created by yiqiang on 2020/4/25.
 */
public class MyThread2 extends Thread{
    @Override
    public void run()
    {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                Thread.sleep(1000);
                if (this.isInterrupted()) {
                    System.out.println("外面叫我停止了!");
                    return;
                    //throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("for后又运行了");
        }catch (ThreadDeath |InterruptedException ex)
        {
            ex.printStackTrace();
            System.out.println("run方法中catch了!");
        }

    }
}
