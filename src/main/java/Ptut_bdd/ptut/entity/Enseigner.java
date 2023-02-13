package Ptut_bdd.ptut.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@IdClass(EnseignerPK.class)
public class Enseigner {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "identifiant")
    private String identifiant;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codeens")
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
        Enseigner enseigner = (Enseigner) o;
        return Objects.equals(identifiant, enseigner.identifiant) && Objects.equals(codeens, enseigner.codeens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiant, codeens);
    }
}
