package com.sophie.jdk8;

import com.sun.glass.ui.SystemClipboard;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by yiqiang on 2020/4/20.
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4);
        for(Integer i:li) {
            System.out.println(i);
        }
        System.out.println("-------");
        li.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("-------");
        li.forEach(i -> {
            System.out.println(i);
        });
    }
}
