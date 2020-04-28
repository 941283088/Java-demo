package com.sophie.muliti_thread.synlockin_1;

/**
 * Created by yiqiang on 2020/4/28.
 */
public class Service {
    synchronized public void service1()
    {
        System.out.println("service1");
        service2();
    }
    synchronized public void service2()
    {
        System.out.println("service2");
        service3();
    }
    synchronized public void service3()
    {
        System.out.println("service3");
    }
}
