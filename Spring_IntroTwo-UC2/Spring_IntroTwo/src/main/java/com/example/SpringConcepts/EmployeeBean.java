package com.example.SpringConcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private int eid;
    private String ename;

    // Injecting DepartmentBean via Autowire
    @Autowired
    private DepartmentBean deptBean;

    // Logger for logging actions
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    // Default constructor
    public EmployeeBean() {
        logger.trace("EmployeeBean object created using default constructor");
    }

    // Constructor with Autowired annotation
    @Autowired
    public EmployeeBean(DepartmentBean deptBean) {
        logger.trace("*** Autowiring by using @Autowire annotation on constructor ***");
        this.deptBean = deptBean;
    }

    // Getter and Setter for eid
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        logger.debug("Setting eid to {}", eid);
        this.eid = eid;
    }

    // Getter and Setter for ename
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        logger.debug("Setting ename to {}", ename);
        this.ename = ename;
    }

    // Getter for deptBean
    public DepartmentBean getDeptBean() {
        return deptBean;
    }

    // For logging purpose when deptBean is set
    public void setDeptBean(DepartmentBean deptBean) {
        logger.debug("Setting deptBean to {}", deptBean);
        this.deptBean = deptBean;
    }

    // Method to display Employee details
    public void showEmployeeDetails() {
        logger.debug("Employee ID: {}", eid);
        logger.debug("Employee Name: {}", ename);
        deptBean.setDeptName("Information Technology");
        logger.debug("Department Name: {}", deptBean.getDeptName());
    }


}
