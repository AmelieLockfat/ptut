package Ptut_bdd.ptut.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Niveau {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "intituleniveau")
    private String intituleniveau;
    @Basic
    @Column(name = "nomorientation")
    private String nomorientation;

    public String getIntituleniveau() {
        return intituleniveau;
    }

    public void setIntituleniveau(String intituleniveau) {
        this.intituleniveau = intituleniveau;
    }

    public String getNomorientation() {
        return nomorientation;
    }

    public void setNomorientation(String nomorientation) {
        this.nomorientation = nomorientation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Niveau niveau = (Niveau) o;
        return Objects.equals(intituleniveau, niveau.intituleniveau) && Objects.equals(nomorientation, niveau.nomorientation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intituleniveau, nomorientation);
    }
}
