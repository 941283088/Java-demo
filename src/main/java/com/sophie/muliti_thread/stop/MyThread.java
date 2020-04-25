package com.sophie.muliti_thread.stop;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by yiqiang on 2020/4/24.
 */
public class MyThread extends Thread{
    @Override
    public void run()
    {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.isInterrupted()) {
                    System.out.println("外面叫我停止了!");
                    return;
                    //throw new InterruptedException();
                }
                System.out.println("i=" + (i + i));
            }
            System.out.println("for后又运行了");
        }catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("run方法中catch了!");
        }

    }
}
