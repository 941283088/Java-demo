package com.sophie.muliti_thread.synlockin_1;

/**
 * Created by yiqiang on 2020/4/28.
 */
public class MyThread extends Thread {
    public void run()
    {
        Service service = new Service();
        service.service1();
    }
}
