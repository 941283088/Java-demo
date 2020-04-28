package com.sophie.muliti_thread.dirtyRead;

/**
 * Created by yiqiang on 2020/4/28.
 */
public class PublicVar {
    public String username="A";
    public String password = "AA";
    synchronized public void setValue(String username,String password)
    {
        try
        {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue methord thread name="+Thread.currentThread().getName()+" username="+username
            +" password="+ password);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    synchronized public void getValue()
    {
        System.out.println("getValue methord thread name="+Thread.currentThread().getName()+" username="+username
                +" password="+ password);
    }
}
