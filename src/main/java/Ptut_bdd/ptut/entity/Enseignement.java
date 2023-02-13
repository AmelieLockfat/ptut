package Ptut_bdd.ptut.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Enseignement {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codeens")
    private Integer codeens;
    @Basic
    @Column(name = "nomens")
    private String nomens;
    @Basic
    @Column(name = "coefficient")
    private Double coefficient;
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
    @Column(name = "heuretotalencadree")
    private Double heuretotalencadree;
    @Basic
    @Column(name = "heuretravailperso")
    private Double heuretravailperso;
    @Basic
    @Column(name = "modalitesevaluation")
    private String modalitesevaluation;
    @Basic
    @Column(name = "prerequis")
    private String prerequis;
    @Basic
    @Column(name = "planducours")
    private String planducours;
    @Basic
    @Column(name = "contenu")
    private String contenu;
    @Basic
    @Column(name = "codeue")
    private String codeue;

    public Integer getCodeens() {
        return codeens;
    }

    public void setCodeens(Integer codeens) {
        this.codeens = codeens;
    }

    public String getNomens() {
        return nomens;
    }

    public void setNomens(String nomens) {
        this.nomens = nomens;
    }

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
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

    public Double getHeuretotalencadree() {
        return heuretotalencadree;
    }

    public void setHeuretotalencadree(Double heuretotalencadree) {
        this.heuretotalencadree = heuretotalencadree;
    }

    public Double getHeuretravailperso() {
        return heuretravailperso;
    }

    public void setHeuretravailperso(Double heuretravailperso) {
        this.heuretravailperso = heuretravailperso;
    }

    public String getModalitesevaluation() {
        return modalitesevaluation;
    }

    public void setModalitesevaluation(String modalitesevaluation) {
        this.modalitesevaluation = modalitesevaluation;
    }

    public String getPrerequis() {
        return prerequis;
    }

    public void setPrerequis(String prerequis) {
        this.prerequis = prerequis;
    }

    public String getPlanducours() {
        return planducours;
    }

    public void setPlanducours(String planducours) {
        this.planducours = planducours;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getCodeue() {
        return codeue;
    }

    public void setCodeue(String codeue) {
        this.codeue = codeue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enseignement that = (Enseignement) o;
        return Objects.equals(codeens, that.codeens) && Objects.equals(nomens, that.nomens) && Objects.equals(coefficient, that.coefficient) && Objects.equals(heurecm, that.heurecm) && Objects.equals(heuretd, that.heuretd) && Objects.equals(heuretp, that.heuretp) && Objects.equals(heuretotalencadree, that.heuretotalencadree) && Objects.equals(heuretravailperso, that.heuretravailperso) && Objects.equals(modalitesevaluation, that.modalitesevaluation) && Objects.equals(prerequis, that.prerequis) && Objects.equals(planducours, that.planducours) && Objects.equals(contenu, that.contenu) && Objects.equals(codeue, that.codeue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeens, nomens, coefficient, heurecm, heuretd, heuretp, heuretotalencadree, heuretravailperso, modalitesevaluation, prerequis, planducours, contenu, codeue);
    }
}
