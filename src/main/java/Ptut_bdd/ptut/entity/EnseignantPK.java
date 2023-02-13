package Ptut_bdd.ptut.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class EnseignantPK implements Serializable {
    @Column(name = "identifiant")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String identifiant;
    @Column(name = "codefichens")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codefichens;

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public Integer getCodefichens() {
        return codefichens;
    }

    public void setCodefichens(Integer codefichens) {
        this.codefichens = codefichens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnseignantPK that = (EnseignantPK) o;
        return Objects.equals(identifiant, that.identifiant) && Objects.equals(codefichens, that.codefichens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiant, codefichens);
    }
}
