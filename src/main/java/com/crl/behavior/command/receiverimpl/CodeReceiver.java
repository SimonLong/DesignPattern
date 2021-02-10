package com.crl.behavior.command.receiverimpl;

import com.crl.behavior.command.Receiver;

/**
 * 代码组
 * Created by caorl on 2020/9/4.
 */
public class CodeReceiver extends Receiver {
    
    public void find() {
        System.out.println("找到代码组");
    }

    public void add() {
        System.out.println("客户要增加一个代码");
    }

    public void change() {
        System.out.println("客户要修改一个代码");
    }

    public void delete() {
        System.out.println("客户要删除一个代码");
    }

    public void plan() {
        System.out.println("客户要求代码变更计划");
    }
}
