package com.example.relationalDB.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee_master")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taskTitle;
    private String taskDetail;
    @ManyToOne
    @JoinColumn(name = "empId")
    private EmployeeMaster employeeMaster;
    @Column(name = "created_date", columnDefinition = "timestamp with time zone")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate = new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public EmployeeMaster getEmployeeMaster() {
        return employeeMaster;
    }

    public void setEmployeeMaster(EmployeeMaster employeeMaster) {
        this.employeeMaster = employeeMaster;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
