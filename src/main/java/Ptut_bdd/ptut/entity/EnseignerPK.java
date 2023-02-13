package Ptut_bdd.ptut.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class EnseignerPK implements Serializable {
    @Column(name = "identifiant")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String identifiant;
    @Column(name = "codeens")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeens;

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public Integer getCodeens() {
        return codeens;
    }

    public void setCodeens(Integer codeens) {
        this.codeens = codeens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnseignerPK that = (EnseignerPK) o;
        return Objects.equals(identifiant, that.identifiant) && Objects.equals(codeens, that.codeens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiant, codeens);
    }
}
