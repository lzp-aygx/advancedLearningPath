package com.example.demo.domain;

/**
 * Created by lizhupeng on 2017/9/18.
 */
public class Role {
    private String id;
    private String code;
    private String employeeId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
