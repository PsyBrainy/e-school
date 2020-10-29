package com.school.persistence.entity;



import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectId;

    private String nameProject;
    private Date limitDate;

    @OneToMany(mappedBy = "students")
    private List<Student> students;

    public Project() {
    }

    public Project(Integer projectId, String nameProject, Date limitDate, Date fechaEntrega) {
        this.projectId = projectId;
        this.nameProject = nameProject;
        this.limitDate = limitDate;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public Date getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
    }
}
