package com.sophie.muliti_thread.throw_exception_no_lock;

/**
 * Created by yiqiang on 2020/4/28.
 */
public class Service {
    synchronized public void testMethord()
    {
        if(Thread.currentThread().getName().equals("a"))
        {
            System.out.println("ThreadName = "+ Thread.currentThread().getName()+" run beginTime =" +System.currentTimeMillis());
            int i=1;
            while (i==1)
            {
                if(("" + Math.random()).substring(0,8).equals("0.123123"))
                {
                    System.out.println("ThreadName=" + Thread.currentThread().getName()+" run exceptionTime = "
                    + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else
        {
            System.out.println("Thread B run time=" + System.currentTimeMillis());
        }
    }
}
