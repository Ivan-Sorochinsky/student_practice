package ru.javabegin.training.springlibrary.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Student {
    private Integer id;
    private Double academicPerformance;
    private String firstname;
    private String lastName;
    private Double attendance;
    private Integer kurs;
    private String speciality;

    @Basic
    @Column(name = "id", nullable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "academicPerformance", nullable = true, precision = 0)
    public Double getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(Double academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    @Basic
    @Column(name = "firstname", nullable = true, length = 30)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastName", nullable = true, length = 30)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "attendance", nullable = true, precision = 0)
    public Double getAttendance() {
        return attendance;
    }

    public void setAttendance(Double attendance) {
        this.attendance = attendance;
    }

    @Basic
    @Column(name = "kurs", nullable = true)
    public Integer getKurs() {
        return kurs;
    }

    public void setKurs(Integer kurs) {
        this.kurs = kurs;
    }

    @Basic
    @Column(name = "speciality", nullable = true, length = 30)
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != null ? !id.equals(student.id) : student.id != null) return false;
        if (academicPerformance != null ? !academicPerformance.equals(student.academicPerformance) : student.academicPerformance != null)
            return false;
        if (firstname != null ? !firstname.equals(student.firstname) : student.firstname != null) return false;
        if (lastName != null ? !lastName.equals(student.lastName) : student.lastName != null) return false;
        if (attendance != null ? !attendance.equals(student.attendance) : student.attendance != null) return false;
        if (kurs != null ? !kurs.equals(student.kurs) : student.kurs != null) return false;
        if (speciality != null ? !speciality.equals(student.speciality) : student.speciality != null) return false;

        return true;
    }
}
