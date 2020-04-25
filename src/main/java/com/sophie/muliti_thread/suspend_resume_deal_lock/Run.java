package com.sophie.muliti_thread.suspend_resume_deal_lock;


/**
 * Created by yiqiang on 2020/4/25.
 */
public class Run {
    public static void main(String[] args) {
        try{
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread(){
                @Override
                public void run(){
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread()
            {
                @Override
                public void run()
                {
                    System.out.println("thread2 启动了,但是进入不了printString");
                    object.printString();
                }
            };
            thread2.start();

        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
