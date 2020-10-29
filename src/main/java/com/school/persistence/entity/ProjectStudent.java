package com.school.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "project_student")
public class ProjectStudent {

    @EmbeddedId
    private ProjectStudentPK id;

    private Date submitDate;

    @ManyToOne
    @JoinColumn(name = "studentId", insertable = false, updatable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "projectId", insertable = false, updatable = false)
    private Project project;

    public ProjectStudentPK getId() {
        return id;
    }

    public void setId(ProjectStudentPK id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
