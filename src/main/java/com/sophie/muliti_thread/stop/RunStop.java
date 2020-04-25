package com.sophie.muliti_thread.stop;

/**
 * Created by yiqiang on 2020/4/25.
 */
public class RunStop {
    public static void main(String[] args) {
        try {
            MyThread2 thread = new MyThread2();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
