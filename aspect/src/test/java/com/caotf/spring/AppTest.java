package com.caotf.spring;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        assertNotNull(context);
        MyService service = (MyService) context.getBean("serviceImpl");
        service.doSomething();
    }
}
