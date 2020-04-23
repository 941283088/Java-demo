package com.sophie.muliti_thread.security;

/**
 * Created by yiqiang on 2020/4/23.
 */
public class Alogin extends Thread{
    @Override
    public void run()
    {
        LoginServlet.doPost("a","aa");
    }
}
