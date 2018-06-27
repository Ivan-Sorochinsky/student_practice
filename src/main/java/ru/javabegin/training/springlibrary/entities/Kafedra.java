package ru.javabegin.training.springlibrary.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Kafedra {
    private Integer id;
    private String denomination;
    private Integer countSpeciality;

    @Basic
    @Column(name = "id", nullable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "denomination", nullable = true, length = 30)
    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    @Basic
    @Column(name = "countSpeciality", nullable = true)
    public Integer getCountSpeciality() {
        return countSpeciality;
    }

    public void setCountSpeciality(Integer countSpeciality) {
        this.countSpeciality = countSpeciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kafedra kafedra = (Kafedra) o;

        if (id != null ? !id.equals(kafedra.id) : kafedra.id != null) return false;
        if (denomination != null ? !denomination.equals(kafedra.denomination) : kafedra.denomination != null)
            return false;
        if (countSpeciality != null ? !countSpeciality.equals(kafedra.countSpeciality) : kafedra.countSpeciality != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (denomination != null ? denomination.hashCode() : 0);
        result = 31 * result + (countSpeciality != null ? countSpeciality.hashCode() : 0);
        return result;
    }
}
