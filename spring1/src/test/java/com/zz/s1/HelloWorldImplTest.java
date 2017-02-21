package com.zz.s1;

import org.apache.logging.log4j.LogManager;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.logging.log4j.Logger;

import static org.junit.Assert.*;

/**
 * Created by zzhang on 2017/2/21.
 */
public class HelloWorldImplTest {

    public static Logger logger = LogManager.getLogger(HelloWorldImplTest.class);

    @Test
    public void sayHi() throws Exception {

        logger.info("Test 1 started");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorldIntf hello = context.getBean(HelloWorldIntf.class);
        assertEquals(hello.sayHi("zz"), "Hello zz");
    }

}