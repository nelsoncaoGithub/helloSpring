package com.caotf.spring;

import static org.junit.Assert.assertTrue;

import com.caotf.spring.proxy1.BookServiceImpl;
import com.caotf.spring.proxy2.SubBookServiceImpl;
import com.caotf.spring.staticproxy.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testBuy1() {
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.buy();
    }

    @Test
    public void testBuy2() {
        com.caotf.spring.proxy2.BookServiceImpl bookService = new SubBookServiceImpl();
        bookService.buy();
    }

    @Test
    public void testBuy3() {
        Service bookService = new ServiceProxy(new ServiceImpl());
        bookService.buy();
    }
}
