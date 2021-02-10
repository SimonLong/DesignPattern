package com.crl.behavior.command;

import com.crl.behavior.command.commandimpl.AddRequirementCommand;

/**
 * Created by caorl on 2020/9/4.
 */
public class Client {

    public static void main(String[] args){
        //定义项目接头人
        Invoker yy = new Invoker();
        //客户要增加一个需求
        System.out.println("----------客户要求增加需求----------");
        //客户下达命令
        Command command = new AddRequirementCommand();
        //接头人接受命令
        yy.setCommand(command);
        //接头人执行命令（屏蔽客户与开发人员的交流，促进客户的用户体验）
        yy.action();
    }
}
