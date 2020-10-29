package com.school.persistence.entity;



import javax.persistence.*;


@Entity
@Table(name = "parents")
public class Parents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idParents;

    private String nameFather;
    private String nameMather;
    private String emailFather;
    private String emailMather;
    private String comments;

    @OneToOne
    @JoinColumn(name = "studentId")
    private Student student;

    public Parents() {
    }

    public Integer getIdParents() {
        return idParents;
    }


    public void setIdParents(Integer idParents) {
        this.idParents = idParents;
    }

    public String getNameFather() {
        return nameFather;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    public String getNameMather() {
        return nameMather;
    }

    public void setNameMather(String nameMather) {
        this.nameMather = nameMather;
    }

    public String getEmailFather() {
        return emailFather;
    }

    public void setEmailFather(String emailFather) {
        this.emailFather = emailFather;
    }

    public String getEmailMather() {
        return emailMather;
    }

    public void setEmailMather(String emailMather) {
        this.emailMather = emailMather;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
