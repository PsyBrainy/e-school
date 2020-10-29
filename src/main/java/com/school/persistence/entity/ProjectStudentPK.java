package com.school.persistence.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProjectStudentPK implements Serializable {

    private Integer studentId;
    private Integer projectId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}
