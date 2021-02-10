package com.crl.behavior.command;

import com.crl.behavior.command.receiverimpl.CodeReceiver;
import com.crl.behavior.command.receiverimpl.PageReceiver;
import com.crl.behavior.command.receiverimpl.RequiredmentReceiver;

/**
 * Created by caorl on 2020/9/4.
 */
public abstract class Command {
    protected RequiredmentReceiver rg = new RequiredmentReceiver();
    protected PageReceiver pg = new PageReceiver();
    protected CodeReceiver cg = new CodeReceiver();
    public abstract void execute();
}
