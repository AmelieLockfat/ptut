package Ptut_bdd.ptut.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Personneinterne {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "identifiant")
    private String identifiant;
    @Basic
    @Column(name = "motdepasse")
    private String motdepasse;
    @Basic
    @Column(name = "prenompers")
    private String prenompers;
    @Basic
    @Column(name = "nompers")
    private String nompers;
    @Basic
    @Column(name = "estdirecteur")
    private Boolean estdirecteur;
    @Basic
    @Column(name = "intituleniveau")
    private String intituleniveau;

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public String getPrenompers() {
        return prenompers;
    }

    public void setPrenompers(String prenompers) {
        this.prenompers = prenompers;
    }

    public String getNompers() {
        return nompers;
    }

    public void setNompers(String nompers) {
        this.nompers = nompers;
    }

    public Boolean getEstdirecteur() {
        return estdirecteur;
    }

    public void setEstdirecteur(Boolean estdirecteur) {
        this.estdirecteur = estdirecteur;
    }

    public String getIntituleniveau() {
        return intituleniveau;
    }

    public void setIntituleniveau(String intituleniveau) {
        this.intituleniveau = intituleniveau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personneinterne that = (Personneinterne) o;
        return Objects.equals(identifiant, that.identifiant) && Objects.equals(motdepasse, that.motdepasse) && Objects.equals(prenompers, that.prenompers) && Objects.equals(nompers, that.nompers) && Objects.equals(estdirecteur, that.estdirecteur) && Objects.equals(intituleniveau, that.intituleniveau);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiant, motdepasse, prenompers, nompers, estdirecteur, intituleniveau);
    }
}
