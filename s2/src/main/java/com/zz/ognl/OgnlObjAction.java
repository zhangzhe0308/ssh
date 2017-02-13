package com.zz.ognl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zzhang on 2017/2/10.
 */
@ParentPackage("default")
@Namespace("/ognl")
@InterceptorRef("defaultStack")
public class OgnlObjAction extends ActionSupport {
    private User user;

    @Action(value = "test", results = {@Result(name = "success", location = "/WEB-INF/ognl/ognlobj.jsp")})
    public String test() throws Exception {
        ActionContext ctx = ActionContext.getContext();

        ctx.getApplication().put("msg", "Application message");

        ctx.getSession().put("msg", "Session message");

        HttpServletRequest request = ServletActionContext.getRequest();

        request.setAttribute("msg", "Request message");

        user = new User();
        user.setUsername("zz");
        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
