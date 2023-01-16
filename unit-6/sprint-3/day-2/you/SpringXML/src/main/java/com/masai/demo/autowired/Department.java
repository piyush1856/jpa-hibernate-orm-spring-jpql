package com.masai.demo.autowired;

public class Department {

    private String deptName;


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    void doFirst() {
        System.out.println("Object was created");
    }
}
