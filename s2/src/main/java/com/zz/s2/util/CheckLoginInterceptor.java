package com.zz.s2.util;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.zz.s2.action.LoginAction;
import com.zz.s2.bean.Admin;

import java.util.Map;

/**
 * Created by zzhang on 2017/2/10.
 */
public class CheckLoginInterceptor extends AbstractInterceptor {
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println(this.getClass().toString() + " is working");
        Object obj = actionInvocation.getAction();
        if (!(obj instanceof LoginAction)) {
            System.out.println("Working on action other than LoginAction");
            Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
            Admin admin = (Admin) session.get("admin");
            if (admin == null) {
                System.out.println("Admin session not exists, jump to INPUT page");
                return Action.INPUT;
            } else
                return actionInvocation.invoke();
        } else
            return actionInvocation.invoke();
    }
}
