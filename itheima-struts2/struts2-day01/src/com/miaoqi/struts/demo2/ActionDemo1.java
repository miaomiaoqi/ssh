package com.miaoqi.struts.demo2;

/**
 * Action的编写方式：Action类是一个POJO的类
 * @author miaoqi
 *
 */
public class ActionDemo1 {

    public String execute() {
        System.out.println("ActionDemo1执行了...");
        return null;
    }
}
