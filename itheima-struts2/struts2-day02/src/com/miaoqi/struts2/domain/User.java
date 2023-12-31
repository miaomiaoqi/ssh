package com.miaoqi.struts2.domain;

import java.util.Date;

public class User {

    private String username;
    private String password;
    private Integer age;
    private Date birthday;
    private Double salary;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", age=" + age + ", birthday=" + birthday
                + ", salary=" + salary + "]";
    }

}
