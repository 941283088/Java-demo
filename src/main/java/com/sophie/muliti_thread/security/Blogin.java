package com.sophie.muliti_thread.security;

import java.util.TreeMap;

/**
 * Created by yiqiang on 2020/4/23.
 */
public class Blogin extends Thread{
    @Override
    public void run()
    {
        LoginServlet.doPost("b","bb");
    }

}
