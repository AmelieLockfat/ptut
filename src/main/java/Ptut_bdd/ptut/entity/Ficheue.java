package Ptut_bdd.ptut.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Ficheue {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codefichue")
    private Integer codefichue;
    @Basic
    @Column(name = "codeue")
    private String codeue;
    @Basic
    @Column(name = "intituleue")
    private String intituleue;
    @Basic
    @Column(name = "modalitescontrole")
    private String modalitescontrole;
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
    @Column(name = "heurecm")
    private Double heurecm;
    @Basic
    @Column(name = "heuretd")
    private Double heuretd;
    @Basic
    @Column(name = "heuretp")
    private Double heuretp;
    @Basic
    @Column(name = "volumstage")
    private Double volumstage;
    @Basic
    @Column(name = "volumprojet")
    private Double volumprojet;
    @Basic
    @Column(name = "volumtravailperso")
    private Double volumtravailperso;
    @Basic
    @Column(name = "prerequis")
    private String prerequis;
    @Basic
    @Column(name = "nomsens")
    private String nomsens;
    @Basic
    @Column(name = "contenusens")
    private String contenusens;
    @Basic
    @Column(name = "nomspers")
    private String nomspers;
    @Basic
    @Column(name = "prenomspers")
    private String prenomspers;
    @Basic
    @Column(name = "idsemestre")
    private Integer idsemestre;
    @Basic
    @Column(name = "numsemestre")
    private Integer numsemestre;
    @Basic
    @Column(name = "intituleniveau")
    private String intituleniveau;
    @Basic
    @Column(name = "nomorientation")
    private String nomorientation;
    @Basic
    @Column(name = "intitulediplome")
    private String intitulediplome;
    @Basic
    @Column(name = "nomdomaine")
    private String nomdomaine;
    @Basic
    @Column(name = "nomnature")
    private String nomnature;

    public Integer getCodefichue() {
        return codefichue;
    }

    public void setCodefichue(Integer codefichue) {
        this.codefichue = codefichue;
    }

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

    public String getModalitescontrole() {
        return modalitescontrole;
    }

    public void setModalitescontrole(String modalitescontrole) {
        this.modalitescontrole = modalitescontrole;
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

    public Double getVolumstage() {
        return volumstage;
    }

    public void setVolumstage(Double volumstage) {
        this.volumstage = volumstage;
    }

    public Double getVolumprojet() {
        return volumprojet;
    }

    public void setVolumprojet(Double volumprojet) {
        this.volumprojet = volumprojet;
    }

    public Double getVolumtravailperso() {
        return volumtravailperso;
    }

    public void setVolumtravailperso(Double volumtravailperso) {
        this.volumtravailperso = volumtravailperso;
    }

    public String getPrerequis() {
        return prerequis;
    }

    public void setPrerequis(String prerequis) {
        this.prerequis = prerequis;
    }

    public String getNomsens() {
        return nomsens;
    }

    public void setNomsens(String nomsens) {
        this.nomsens = nomsens;
    }

    public String getContenusens() {
        return contenusens;
    }

    public void setContenusens(String contenusens) {
        this.contenusens = contenusens;
    }

    public String getNomspers() {
        return nomspers;
    }

    public void setNomspers(String nomspers) {
        this.nomspers = nomspers;
    }

    public String getPrenomspers() {
        return prenomspers;
    }

    public void setPrenomspers(String prenomspers) {
        this.prenomspers = prenomspers;
    }

    public Integer getIdsemestre() {
        return idsemestre;
    }

    public void setIdsemestre(Integer idsemestre) {
        this.idsemestre = idsemestre;
    }

    public Integer getNumsemestre() {
        return numsemestre;
    }

    public void setNumsemestre(Integer numsemestre) {
        this.numsemestre = numsemestre;
    }

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

    public String getIntitulediplome() {
        return intitulediplome;
    }

    public void setIntitulediplome(String intitulediplome) {
        this.intitulediplome = intitulediplome;
    }

    public String getNomdomaine() {
        return nomdomaine;
    }

    public void setNomdomaine(String nomdomaine) {
        this.nomdomaine = nomdomaine;
    }

    public String getNomnature() {
        return nomnature;
    }

    public void setNomnature(String nomnature) {
        this.nomnature = nomnature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ficheue ficheue = (Ficheue) o;
        return Objects.equals(codefichue, ficheue.codefichue) && Objects.equals(codeue, ficheue.codeue) && Objects.equals(intituleue, ficheue.intituleue) && Objects.equals(modalitescontrole, ficheue.modalitescontrole) && Objects.equals(bibliographiedebase, ficheue.bibliographiedebase) && Objects.equals(creditsects, ficheue.creditsects) && Objects.equals(ordreue, ficheue.ordreue) && Objects.equals(motcles, ficheue.motcles) && Objects.equals(competenses, ficheue.competenses) && Objects.equals(heurecm, ficheue.heurecm) && Objects.equals(heuretd, ficheue.heuretd) && Objects.equals(heuretp, ficheue.heuretp) && Objects.equals(volumstage, ficheue.volumstage) && Objects.equals(volumprojet, ficheue.volumprojet) && Objects.equals(volumtravailperso, ficheue.volumtravailperso) && Objects.equals(prerequis, ficheue.prerequis) && Objects.equals(nomsens, ficheue.nomsens) && Objects.equals(contenusens, ficheue.contenusens) && Objects.equals(nomspers, ficheue.nomspers) && Objects.equals(prenomspers, ficheue.prenomspers) && Objects.equals(idsemestre, ficheue.idsemestre) && Objects.equals(numsemestre, ficheue.numsemestre) && Objects.equals(intituleniveau, ficheue.intituleniveau) && Objects.equals(nomorientation, ficheue.nomorientation) && Objects.equals(intitulediplome, ficheue.intitulediplome) && Objects.equals(nomdomaine, ficheue.nomdomaine) && Objects.equals(nomnature, ficheue.nomnature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codefichue, codeue, intituleue, modalitescontrole, bibliographiedebase, creditsects, ordreue, motcles, competenses, heurecm, heuretd, heuretp, volumstage, volumprojet, volumtravailperso, prerequis, nomsens, contenusens, nomspers, prenomspers, idsemestre, numsemestre, intituleniveau, nomorientation, intitulediplome, nomdomaine, nomnature);
    }
}
