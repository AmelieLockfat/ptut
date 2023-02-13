package Ptut_bdd.ptut.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@IdClass(EnseignantPK.class)
public class Enseignant {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "identifiant")
    private String identifiant;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codefichens")
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
        Enseignant that = (Enseignant) o;
        return Objects.equals(identifiant, that.identifiant) && Objects.equals(codefichens, that.codefichens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiant, codefichens);
    }
}
