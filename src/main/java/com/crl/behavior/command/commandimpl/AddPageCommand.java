package com.crl.behavior.command.commandimpl;

import com.crl.behavior.command.Command;

/**
 * Created by caorl on 2020/9/4.
 */
public class AddPageCommand extends Command {
    //执行一个增加一项需求的命令
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
