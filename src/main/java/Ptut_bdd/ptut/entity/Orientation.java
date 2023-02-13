package Ptut_bdd.ptut.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Orientation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "nomorientation")
    private String nomorientation;
    @Basic
    @Column(name = "intitulediplome")
    private String intitulediplome;

    public String getNomorientation() {
        return nomorientation;
    }

    public void setNomorientation(String nomorientation) {
        this.nomorientation = nomorientation;
    }

    public String getIntitulediplome() {
        return intitulediplome;
    }

    public void setIntitulediplome(String intitulediplome) {
        this.intitulediplome = intitulediplome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orientation that = (Orientation) o;
        return Objects.equals(nomorientation, that.nomorientation) && Objects.equals(intitulediplome, that.intitulediplome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomorientation, intitulediplome);
    }
}
