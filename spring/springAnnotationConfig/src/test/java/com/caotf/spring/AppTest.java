package com.caotf.spring;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.caotf.spring.controller.UserController;
import com.caotf.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testInsertUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController controller = (UserController) context.getBean("userController");
        assertNotNull(controller);
        controller.insertUser((User) context.getBean("user"));
    }
}
