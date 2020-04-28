package com.sophie.muliti_thread.dirtyRead;

/**
 * Created by yiqiang on 2020/4/28.
 */
public class Test {
    public static void main(String[] args) {
        try{
            PublicVar publicVar = new PublicVar();
            ThreadA thread = new ThreadA(publicVar);
            thread.start();
            Thread.sleep(200);
            publicVar.getValue();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
