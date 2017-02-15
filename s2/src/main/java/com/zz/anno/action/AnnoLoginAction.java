package com.zz.anno.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zz.s2.bean.Admin;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by zzhang on 2017/2/10.
 */
@ParentPackage("default")
@Namespace("/anno")
@InterceptorRef("defaultStack")
public class AnnoLoginAction extends ActionSupport implements ModelDriven<Admin>, SessionAware {
    private Admin admin;
    private Map<String, Object> session;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Action(value = "test", results = {@Result(name = "success", location = "/WEB-INF/anno/result.jsp"), @Result(name = "input", location = "/WEB-INF/s2/Login.jsp")})
    public String login() {
        session.put("admin", admin);
        System.out.println("Save admin session");
        return SUCCESS;
    }

    public Admin getModel() {
        if (admin == null) admin = new Admin();
        return admin;
    }

    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
}
