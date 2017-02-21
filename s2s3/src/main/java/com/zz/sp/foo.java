package com.zz.sp;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;

import org.apache.logging.log4j.Logger;

/**
 * Created by zzhang on 2017/2/21.
 */
public class foo extends ActionSupport {

    public static Logger logger = LogManager.getLogger(foo.class);

    @Autowired
    private SField sField;

    public SField getsField() {
        return sField;
    }

    public void setsField(SField sField) {
        this.sField = sField;
    }

    @Override
    public String execute() throws Exception {
        logger.info(this.sField.toString());
        return SUCCESS;
    }
}
