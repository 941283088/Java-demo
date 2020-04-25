package com.sophie.muliti_thread.stop.stop_throw_lock;

import com.sophie.muliti_thread.stop.*;

/**
 * Created by yiqiang on 2020/4/25.
 */
public class Run {
    public static void main(String[] args) {
        try{
            SynchronizedObject object = new SynchronizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername()+" "+object.getPassword());
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
