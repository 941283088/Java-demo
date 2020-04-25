package com.sophie.muliti_thread.stop;

/**
 * Created by yiqiang on 2020/4/24.
 */
public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否终止?="+Thread.interrupted());
        System.out.println("是否终止2="+Thread.interrupted());
        System.out.println("end!");
    }
}
