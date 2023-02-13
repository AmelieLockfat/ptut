package Ptut_bdd.ptut.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Diplome {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "intitulediplome")
    private String intitulediplome;

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
        Diplome diplome = (Diplome) o;
        return Objects.equals(intitulediplome, diplome.intitulediplome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intitulediplome);
    }
}
