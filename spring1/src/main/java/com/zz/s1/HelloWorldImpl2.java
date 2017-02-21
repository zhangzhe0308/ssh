package com.zz.s1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zzhang on 2017/2/21.
 */
@Service(value = "helloWorld")
public class HelloWorldImpl2 implements HelloWorldIntf {

    @Autowired
    private CField1 sfield;

    public String sayHi(String name) {
        return "Hello " + name;
    }
}
