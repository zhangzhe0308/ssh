package com.zz.s2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zz.s2.bean.Admin;

/**
 * Created by zzhang on 2017/2/14.
 */
public class ValidateAction extends ActionSupport {

    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void ValidateExecute() {
        addFieldError("admin.username", getText("name.required"));
    }

    @Override
    public String execute() {
        return SUCCESS;
    }

    public void ValidateGo() {
        addFieldError("admin.username", getText("name.required"));
    }

    public String go() {
        return SUCCESS;
    }
}
