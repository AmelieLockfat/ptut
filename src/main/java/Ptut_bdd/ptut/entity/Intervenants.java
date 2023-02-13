package Ptut_bdd.ptut.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@IdClass(IntervenantsPK.class)
public class Intervenants {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "identifiant")
    private String identifiant;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codefichue")
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
        Intervenants that = (Intervenants) o;
        return Objects.equals(identifiant, that.identifiant) && Objects.equals(codefichue, that.codefichue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiant, codefichue);
    }
}
