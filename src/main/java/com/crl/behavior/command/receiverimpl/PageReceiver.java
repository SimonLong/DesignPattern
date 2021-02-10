package com.crl.behavior.command.receiverimpl;

import com.crl.behavior.command.Receiver;

/**
 * 美工组
 * Created by caorl on 2020/9/4.
 */
public class PageReceiver extends Receiver {
    
    public void find() {
        System.out.println("找到页面组");
    }

    public void add() {
        System.out.println("客户要增加一个页面");
    }

    public void change() {
        System.out.println("客户要修改一个页面");
    }

    public void delete() {
        System.out.println("客户要删除一个页面");
    }

    public void plan() {
        System.out.println("客户要求页面变更计划");
    }
}
