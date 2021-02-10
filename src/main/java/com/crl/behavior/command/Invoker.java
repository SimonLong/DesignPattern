package com.crl.behavior.command;

/**
 * 负责人
 * Created by caorl on 2020/9/4.
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }
}
