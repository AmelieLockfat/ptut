package Ptut_bdd.ptut.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@IdClass(MatieresPK.class)
public class Matieres {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codeens")
    private Integer codeens;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codefichue")
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
        Matieres matieres = (Matieres) o;
        return Objects.equals(codeens, matieres.codeens) && Objects.equals(codefichue, matieres.codefichue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeens, codefichue);
    }
}
