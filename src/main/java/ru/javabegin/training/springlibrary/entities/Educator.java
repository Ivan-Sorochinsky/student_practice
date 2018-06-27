package ru.javabegin.training.springlibrary.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Educator {
    private Integer id;
    private String firstname;
    private String lastname;
    private String kafedra;
    private String position;
    private Integer workload;
    private String timetableOfWork;

    @Basic
    @Column(name = "id", nullable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "lastname", nullable = true, length = 30)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "kafedra", nullable = true, length = 30)
    public String getKafedra() {
        return kafedra;
    }

    public void setKafedra(String kafedra) {
        this.kafedra = kafedra;
    }

    @Basic
    @Column(name = "position", nullable = true, length = 30)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "workload", nullable = true)
    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    @Basic
    @Column(name = "timetableOfWork", nullable = true, length = 30)
    public String getTimetableOfWork() {
        return timetableOfWork;
    }

    public void setTimetableOfWork(String timetableOfWork) {
        this.timetableOfWork = timetableOfWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Educator educator = (Educator) o;

        if (id != null ? !id.equals(educator.id) : educator.id != null) return false;
        if (firstname != null ? !firstname.equals(educator.firstname) : educator.firstname != null) return false;
        if (lastname != null ? !lastname.equals(educator.lastname) : educator.lastname != null) return false;
        if (kafedra != null ? !kafedra.equals(educator.kafedra) : educator.kafedra != null) return false;
        if (position != null ? !position.equals(educator.position) : educator.position != null) return false;
        if (workload != null ? !workload.equals(educator.workload) : educator.workload != null) return false;
        if (timetableOfWork != null ? !timetableOfWork.equals(educator.timetableOfWork) : educator.timetableOfWork != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (kafedra != null ? kafedra.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (workload != null ? workload.hashCode() : 0);
        result = 31 * result + (timetableOfWork != null ? timetableOfWork.hashCode() : 0);
        return result;
    }
}
