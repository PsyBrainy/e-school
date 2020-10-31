package com.school.persistence.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private String name;
    private String dni;
    private String address;
    private String mail;
    private String phone;
    private String comments;
    private Integer prensence;

    @OneToOne
    @JoinColumn(name = "parentsId", insertable = false, updatable = false)
    private Parents parents;

    @ManyToMany
    @JoinColumn(name = "project", insertable = false, updatable = false)
    private List<Project> projectsDelivered;

    public Student() {
    }

    public Student(String name, String dni, String address, String mail, String phone, String comments, Parents parents) {
        this.name = name;
        this.dni = dni;
        this.address = address;
        this.mail = mail;
        this.phone = phone;
        this.comments = comments;
        this.parents = parents;
    }

    public Student(String name, String dni, String address, String mail, String phone, String comments, Integer prensence, Parents parents) {
        this.name = name;
        this.dni = dni;
        this.address = address;
        this.mail = mail;
        this.phone = phone;
        this.comments = comments;
        this.prensence = prensence;
        this.parents = parents;

    }

    public Student(Integer studentId, String name, String dni, String address, String mail, String phone, String comments, Integer prensence) {
        this.studentId = studentId;
        this.name = name;
        this.dni = dni;
        this.address = address;
        this.mail = mail;
        this.phone = phone;
        this.comments = comments;
        this.prensence = prensence;
    }


    public Integer getPrensence() {
        return prensence;
    }

    public void setPrensence(Integer prensence) {
        this.prensence = prensence;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }
}
