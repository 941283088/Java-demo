package com.sophie.muliti_thread.suspend_resume_nosameValue;

/**
 * Created by yiqiang on 2020/4/26.
 */
public class MyObject {
    private String username = "1";
    private String password = "11";
    public void setValue(String u,String p)
    {
        this.username = u;
        if(Thread.currentThread().getName().equals("a"))
        {
            System.out.println("停止a线程");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }
    public void printUserNamePassword()
    {
        System.out.println(username + " "+ password);
    }
}
