package com.zz.s2.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zzhang on 2017/2/10.
 */
public class Test1Action extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println(this.getClass().toString() + " executes");
        return super.execute();
    }
}
