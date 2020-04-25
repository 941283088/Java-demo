package com.sophie.muliti_thread.suspend;

/**
 * Created by yiqiang on 2020/4/25.
 */
public class MyThread extends Thread {
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true)
        {
            i++;
        }
    }

}
