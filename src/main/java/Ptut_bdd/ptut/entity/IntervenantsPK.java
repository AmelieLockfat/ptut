package Ptut_bdd.ptut.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class IntervenantsPK implements Serializable {
    @Column(name = "identifiant")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String identifiant;
    @Column(name = "codefichue")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codefichue;

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
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
        IntervenantsPK that = (IntervenantsPK) o;
        return Objects.equals(identifiant, that.identifiant) && Objects.equals(codefichue, that.codefichue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiant, codefichue);
    }
}
