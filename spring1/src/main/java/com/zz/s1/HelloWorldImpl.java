package com.zz.s1;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zzhang on 2017/2/21.
 */
public class HelloWorldImpl implements HelloWorldIntf {

    @Autowired
    private CField1 sfield;

    public String sayHi(String name) {
        return "Hello " + name;
    }
}
