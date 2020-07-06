package hamsarha.ir.socialnet.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String cellNo;
    private String name;
    private String sureName;
    private Date birthDate;
    private boolean sex;

    @OneToOne
    private Education education;

    @OneToOne
    private Degree degree;

    @OneToOne
    private WorkExperiance workExperiance;

    public User(Long id, String cellNo, String name, String sureName, Date birthDate, boolean sex, Education education, Degree degree, WorkExperiance workExperiance) {
        this.id = id;
        this.cellNo = cellNo;
        this.name = name;
        this.sureName = sureName;
        this.birthDate = birthDate;
        this.sex = sex;
        this.education = education;
        this.degree = degree;
        this.workExperiance = workExperiance;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public WorkExperiance getWorkExperiance() {
        return workExperiance;
    }

    public void setWorkExperiance(WorkExperiance workExperiance) {
        this.workExperiance = workExperiance;
    }
}
