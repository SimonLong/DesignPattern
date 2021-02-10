package com.crl.structural.facade.subsystem;

import com.crl.structural.facade.subsystem.SubSystemA;
import com.crl.structural.facade.subsystem.SubSystemB;

/**
 * Created by caorl on 2020/9/8.
 */
public class Context {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();

    public void complexMethod(){
        this.subSystemA.doSomethingA();
        this.subSystemB.doSomethingB();
    }
}
