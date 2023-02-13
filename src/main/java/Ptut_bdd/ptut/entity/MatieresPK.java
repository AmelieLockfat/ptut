package Ptut_bdd.ptut.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class MatieresPK implements Serializable {
    @Column(name = "codeens")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeens;
    @Column(name = "codefichue")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codefichue;

    public Integer getCodeens() {
        return codeens;
    }

    public void setCodeens(Integer codeens) {
        this.codeens = codeens;
    }

    public Integer getCodefichue() {
        return codefichue;
    }

    public void setCodefichue(Integer codefichue) {
        this.codefichue = codefichue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatieresPK that = (MatieresPK) o;
        return Objects.equals(codeens, that.codeens) && Objects.equals(codefichue, that.codefichue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeens, codefichue);
    }
}
