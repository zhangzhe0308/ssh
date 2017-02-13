package com.zz.s2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zz.s2.bean.Admin;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by zzhang on 2017/2/10.
 */
public class LoginAction extends ActionSupport implements ModelDriven<Admin>, SessionAware {
    private Admin admin;
    private Map<String, Object> session;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String login() {
        session.put("admin", admin);
        System.out.println("Save admin session");
        return INPUT;
    }

    public Admin getModel() {
        if (admin == null) admin = new Admin();
        return admin;
    }

    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
}
