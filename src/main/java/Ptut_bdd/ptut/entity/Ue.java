package Ptut_bdd.ptut.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Ue {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codeue")
    private String codeue;
    @Basic
    @Column(name = "intituleue")
    private String intituleue;
    @Basic
    @Column(name = "heurecm")
    private Double heurecm;
    @Basic
    @Column(name = "heuretd")
    private Double heuretd;
    @Basic
    @Column(name = "heuretp")
    private Double heuretp;
    @Basic
    @Column(name = "volumtravailperso")
    private Double volumtravailperso;
    @Basic
    @Column(name = "volumprojet")
    private Double volumprojet;
    @Basic
    @Column(name = "modalitescontrole")
    private String modalitescontrole;
    @Basic
    @Column(name = "prerequis")
    private String prerequis;
    @Basic
    @Column(name = "bibliographiedebase")
    private String bibliographiedebase;
    @Basic
    @Column(name = "creditsects")
    private Integer creditsects;
    @Basic
    @Column(name = "ordreue")
    private Integer ordreue;
    @Basic
    @Column(name = "motcles")
    private String motcles;
    @Basic
    @Column(name = "competenses")
    private String competenses;
    @Basic
    @Column(name = "numsemestre")
    private Integer numsemestre;
    @Basic
    @Column(name = "idsemestre")
    private Integer idsemestre;

    public String getCodeue() {
        return codeue;
    }

    public void setCodeue(String codeue) {
        this.codeue = codeue;
    }

    public String getIntituleue() {
        return intituleue;
    }

    public void setIntituleue(String intituleue) {
        this.intituleue = intituleue;
    }

    public Double getHeurecm() {
        return heurecm;
    }

    public void setHeurecm(Double heurecm) {
        this.heurecm = heurecm;
    }

    public Double getHeuretd() {
        return heuretd;
    }

    public void setHeuretd(Double heuretd) {
        this.heuretd = heuretd;
    }

    public Double getHeuretp() {
        return heuretp;
    }

    public void setHeuretp(Double heuretp) {
        this.heuretp = heuretp;
    }

    public Double getVolumtravailperso() {
        return volumtravailperso;
    }

    public void setVolumtravailperso(Double volumtravailperso) {
        this.volumtravailperso = volumtravailperso;
    }

    public Double getVolumprojet() {
        return volumprojet;
    }

    public void setVolumprojet(Double volumprojet) {
        this.volumprojet = volumprojet;
    }

    public String getModalitescontrole() {
        return modalitescontrole;
    }

    public void setModalitescontrole(String modalitescontrole) {
        this.modalitescontrole = modalitescontrole;
    }

    public String getPrerequis() {
        return prerequis;
    }

    public void setPrerequis(String prerequis) {
        this.prerequis = prerequis;
    }

    public String getBibliographiedebase() {
        return bibliographiedebase;
    }

    public void setBibliographiedebase(String bibliographiedebase) {
        this.bibliographiedebase = bibliographiedebase;
    }

    public Integer getCreditsects() {
        return creditsects;
    }

    public void setCreditsects(Integer creditsects) {
        this.creditsects = creditsects;
    }

    public Integer getOrdreue() {
        return ordreue;
    }

    public void setOrdreue(Integer ordreue) {
        this.ordreue = ordreue;
    }

    public String getMotcles() {
        return motcles;
    }

    public void setMotcles(String motcles) {
        this.motcles = motcles;
    }

    public String getCompetenses() {
        return competenses;
    }

    public void setCompetenses(String competenses) {
        this.competenses = competenses;
    }

    public Integer getNumsemestre() {
        return numsemestre;
    }

    public void setNumsemestre(Integer numsemestre) {
        this.numsemestre = numsemestre;
    }

    public Integer getIdsemestre() {
        return idsemestre;
    }

    public void setIdsemestre(Integer idsemestre) {
        this.idsemestre = idsemestre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ue ue = (Ue) o;
        return Objects.equals(codeue, ue.codeue) && Objects.equals(intituleue, ue.intituleue) && Objects.equals(heurecm, ue.heurecm) && Objects.equals(heuretd, ue.heuretd) && Objects.equals(heuretp, ue.heuretp) && Objects.equals(volumtravailperso, ue.volumtravailperso) && Objects.equals(volumprojet, ue.volumprojet) && Objects.equals(modalitescontrole, ue.modalitescontrole) && Objects.equals(prerequis, ue.prerequis) && Objects.equals(bibliographiedebase, ue.bibliographiedebase) && Objects.equals(creditsects, ue.creditsects) && Objects.equals(ordreue, ue.ordreue) && Objects.equals(motcles, ue.motcles) && Objects.equals(competenses, ue.competenses) && Objects.equals(numsemestre, ue.numsemestre) && Objects.equals(idsemestre, ue.idsemestre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeue, intituleue, heurecm, heuretd, heuretp, volumtravailperso, volumprojet, modalitescontrole, prerequis, bibliographiedebase, creditsects, ordreue, motcles, competenses, numsemestre, idsemestre);
    }
}
