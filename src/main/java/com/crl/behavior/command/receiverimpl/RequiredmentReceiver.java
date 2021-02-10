package com.crl.behavior.command.receiverimpl;

import com.crl.behavior.command.Receiver;

/**
 * 需求组
 * Created by caorl on 2020/9/4.
 */
public class RequiredmentReceiver extends Receiver {

    public void find() {
        System.out.println("找到需求组");
    }

    public void add() {
        System.out.println("客户要增加一个需求");
    }

    public void change() {
        System.out.println("客户要修改一个需求");
    }

    public void delete() {
        System.out.println("客户要删除一个需求");
    }

    public void plan() {
        System.out.println("客户要求需求变更计划");
    }
}
