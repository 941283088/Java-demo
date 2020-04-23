package com.sophie.muliti_thread.security;

import javax.swing.*;

/**
 * Created by yiqiang on 2020/4/23.
 */
public class Run {
    public static void main(String[] args) {
        Alogin a = new Alogin();
        a.start();
        Blogin b = new Blogin();
        b.start();
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + "  "+runThread.getId());
    }
}
