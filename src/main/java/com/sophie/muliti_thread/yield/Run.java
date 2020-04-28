package com.sophie.muliti_thread.yield;

/**
 * Created by yiqiang on 2020/4/26.
 */
public class Run
{
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
