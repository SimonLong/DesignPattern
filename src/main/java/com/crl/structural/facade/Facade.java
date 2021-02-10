package com.crl.structural.facade;

import com.crl.structural.facade.subsystem.Context;
import com.crl.structural.facade.subsystem.SubSystemA;
import com.crl.structural.facade.subsystem.SubSystemB;
import com.crl.structural.facade.subsystem.SubSystemC;

/**
 * Created by caorl on 2020/9/8.
 */
public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    private Context context = new Context();

    public void methodA(){
        this.subSystemA.doSomethingA();
    }
    public void methodB(){
        this.subSystemB.doSomethingB();
    }
    public void methodC(){
        this.subSystemC.doSomethingC();
    }

    //这样保证门面角色是稳定的
    public void methodD(){
        this.context.complexMethod();
    }
}
