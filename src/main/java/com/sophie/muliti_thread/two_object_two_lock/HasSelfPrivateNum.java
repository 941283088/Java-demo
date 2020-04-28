package com.sophie.muliti_thread.two_object_two_lock;

import com.sophie.muliti_thread.priority.ThreadA;

/**
 * Created by yiqiang on 2020/4/27.
 */
public class HasSelfPrivateNum {
    private int num =0;
    synchronized public void addI(String username)
    {
        try{
            if(username.equals("a"))
            {
                num =100;
                System.out.println("a set over !");
                ThreadA.sleep(2000);
            }else
            {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username +" num="+num);
        }catch (InterruptedException e)
        {e.printStackTrace();}
    }
}
