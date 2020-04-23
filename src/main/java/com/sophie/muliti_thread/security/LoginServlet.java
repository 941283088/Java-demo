package com.sophie.muliti_thread.security;

/**
 * Created by yiqiang on 2020/4/23.
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
   synchronized public static void doPost(String username,String password)
    //public static void doPost(String username,String password)
    {
        try{
            usernameRef = username;
            if(username.equals("a"))
            {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username=" + usernameRef + " password=" + passwordRef);


        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
