package com.miaoqi.dao;

import org.springframework.stereotype.Repository;

@Repository("bookDao1")
public class BookDao {

    private String label = "1";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "BookDao [label=" + label + "]";
    }

}
