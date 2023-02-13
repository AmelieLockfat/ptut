package Ptut_bdd.ptut.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Semestre {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idsemestre")
    private Integer idsemestre;
    @Basic
    @Column(name = "numsemestre")
    private Integer numsemestre;
    @Basic
    @Column(name = "intituleniveau")
    private String intituleniveau;

    public Integer getIdsemestre() {
        return idsemestre;
    }

    public void setIdsemestre(Integer idsemestre) {
        this.idsemestre = idsemestre;
    }

    public Integer getNumsemestre() {
        return numsemestre;
    }

    public void setNumsemestre(Integer numsemestre) {
        this.numsemestre = numsemestre;
    }

    public String getIntituleniveau() {
        return intituleniveau;
    }

    public void setIntituleniveau(String intituleniveau) {
        this.intituleniveau = intituleniveau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Semestre semestre = (Semestre) o;
        return Objects.equals(idsemestre, semestre.idsemestre) && Objects.equals(numsemestre, semestre.numsemestre) && Objects.equals(intituleniveau, semestre.intituleniveau);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idsemestre, numsemestre, intituleniveau);
    }
}
