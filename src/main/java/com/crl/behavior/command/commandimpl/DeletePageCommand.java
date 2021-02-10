package com.crl.behavior.command.commandimpl;

import com.crl.behavior.command.Command;

/**
 * Created by caorl on 2020/9/4.
 */
public class DeletePageCommand extends Command {
    //执行一个删除一个页面的命令
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
