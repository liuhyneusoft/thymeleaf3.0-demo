package com.web.demo;

/**
 * Created by liuhaiyang on 2017/6/6.
 */
public class DemoForm {
    private String name;
    private String role;
    private String mail;
    private String assignPP;
    private String startDate;
    private String status;
    private Integer userReq;
    private Integer openReq;
    private Integer closedReq;

    public DemoForm() {
    }

    public DemoForm(String name, String role, String mail, String assignPP, String startDate, String status, Integer userReq, Integer openReq, Integer closedReq) {
        this.name = name;
        this.role = role;
        this.mail = mail;
        this.assignPP = assignPP;
        this.startDate = startDate;
        this.status = status;
        this.userReq = userReq;
        this.openReq = openReq;
        this.closedReq = closedReq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAssignPP() {
        return assignPP;
    }

    public void setAssignPP(String assignPP) {
        this.assignPP = assignPP;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getUserReq() {
        return userReq;
    }

    public void setUserReq(Integer userReq) {
        this.userReq = userReq;
    }

    public Integer getOpenReq() {
        return openReq;
    }

    public void setOpenReq(Integer openReq) {
        this.openReq = openReq;
    }

    public Integer getClosedReq() {
        return closedReq;
    }

    public void setClosedReq(Integer closedReq) {
        this.closedReq = closedReq;
    }
}
