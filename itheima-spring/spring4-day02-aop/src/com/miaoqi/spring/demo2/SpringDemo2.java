package com.miaoqi.spring.demo2;

import org.junit.Test;

public class SpringDemo2 {

    /**
     * Cglib的测试
     */
    @Test
    public void demo1() {
        CustomerDao customerDao = new CustomerDao();
        customerDao.save();
        customerDao.update();
        customerDao.find();
        customerDao.delete();
    }

    @Test
    public void demo2() {
        CustomerDao customerDao = new CustomerDao();
        CustomerDao proxy = new CglibProxy(customerDao).createProxy();
        proxy.save();
        proxy.update();
        proxy.find();
        proxy.delete();
    }

}
