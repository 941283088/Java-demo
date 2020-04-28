package com.sophie.muliti_thread.throw_exception_no_lock;


/**
 * Created by yiqiang on 2020/4/28.
 */
public class Test {
    public static void main(String[] args) {
        try
        {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(500);
            ThreadA b = new ThreadA(service);
            b.setName("b");
            b.start();

        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
