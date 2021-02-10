package com.crl.behavior.command.commandimpl;

import com.crl.behavior.command.Command;

/**
 * Created by caorl on 2020/9/4.
 */
public class AddRequirementCommand extends Command {
    //执行一个增加一个页面的命令
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
