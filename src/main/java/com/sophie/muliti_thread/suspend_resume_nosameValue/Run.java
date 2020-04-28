package com.sophie.muliti_thread.suspend_resume_nosameValue;

/**
 * Created by yiqiang on 2020/4/26.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread(){
            public void run()
            {
                myObject.setValue("a","aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);
        Thread thread2 = new Thread()
        {
            public void run()
            {
                myObject.printUserNamePassword();
            }
        };
        thread2.start();
        //会出现数据不同步,这也是 suspend的问题.
    }
}
