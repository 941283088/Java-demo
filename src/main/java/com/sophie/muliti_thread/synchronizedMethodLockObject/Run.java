package com.sophie.muliti_thread.synchronizedMethodLockObject;


/**
 * Created by yiqiang on 2020/4/27.
 */
public class Run {
    public static void main(String[] args) {
        MyObject object =  new MyObject();
        ThreadA  a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();

    }
}
