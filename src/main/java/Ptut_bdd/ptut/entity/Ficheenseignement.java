package Ptut_bdd.ptut.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Ficheenseignement {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codefichens")
    private Integer codefichens;
    @Basic
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
    @Column(name = "anneedetude")
    private String anneedetude;
    @Basic
    @Column(name = "nompers")
    private String nompers;
    @Basic
    @Column(name = "prenompers")
    private String prenompers;
    @Basic
    @Column(name = "numtelpers")
    private String numtelpers;
    @Basic
    @Column(name = "emailpers")
    private String emailpers;
    @Basic
    @Column(name = "coordprivee")
    private Boolean coordprivee;
    @Basic
    @Column(name = "numsemestre")
    private Integer numsemestre;
    @Basic
    @Column(name = "idsemestre")
    private Integer idsemestre;
    @Basic
    @Column(name = "intituleniveau")
    private String intituleniveau;
    @Basic
    @Column(name = "intituleue")
    private String intituleue;
    @Basic
    @Column(name = "codeue")
    private String codeue;

    public Integer getCodefichens() {
        return codefichens;
    }

    public void setCodefichens(Integer codefichens) {
        this.codefichens = codefichens;
    }

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

    public String getAnneedetude() {
        return anneedetude;
    }

    public void setAnneedetude(String anneedetude) {
        this.anneedetude = anneedetude;
    }

    public String getNompers() {
        return nompers;
    }

    public void setNompers(String nompers) {
        this.nompers = nompers;
    }

    public String getPrenompers() {
        return prenompers;
    }

    public void setPrenompers(String prenompers) {
        this.prenompers = prenompers;
    }

    public String getNumtelpers() {
        return numtelpers;
    }

    public void setNumtelpers(String numtelpers) {
        this.numtelpers = numtelpers;
    }

    public String getEmailpers() {
        return emailpers;
    }

    public void setEmailpers(String emailpers) {
        this.emailpers = emailpers;
    }

    public Boolean getCoordprivee() {
        return coordprivee;
    }

    public void setCoordprivee(Boolean coordprivee) {
        this.coordprivee = coordprivee;
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

    public String getIntituleniveau() {
        return intituleniveau;
    }

    public void setIntituleniveau(String intituleniveau) {
        this.intituleniveau = intituleniveau;
    }

    public String getIntituleue() {
        return intituleue;
    }

    public void setIntituleue(String intituleue) {
        this.intituleue = intituleue;
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
        Ficheenseignement that = (Ficheenseignement) o;
        return Objects.equals(codefichens, that.codefichens) && Objects.equals(codeens, that.codeens) && Objects.equals(nomens, that.nomens) && Objects.equals(coefficient, that.coefficient) && Objects.equals(heurecm, that.heurecm) && Objects.equals(heuretd, that.heuretd) && Objects.equals(heuretp, that.heuretp) && Objects.equals(heuretotalencadree, that.heuretotalencadree) && Objects.equals(heuretravailperso, that.heuretravailperso) && Objects.equals(modalitesevaluation, that.modalitesevaluation) && Objects.equals(prerequis, that.prerequis) && Objects.equals(planducours, that.planducours) && Objects.equals(anneedetude, that.anneedetude) && Objects.equals(nompers, that.nompers) && Objects.equals(prenompers, that.prenompers) && Objects.equals(numtelpers, that.numtelpers) && Objects.equals(emailpers, that.emailpers) && Objects.equals(coordprivee, that.coordprivee) && Objects.equals(numsemestre, that.numsemestre) && Objects.equals(idsemestre, that.idsemestre) && Objects.equals(intituleniveau, that.intituleniveau) && Objects.equals(intituleue, that.intituleue) && Objects.equals(codeue, that.codeue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codefichens, codeens, nomens, coefficient, heurecm, heuretd, heuretp, heuretotalencadree, heuretravailperso, modalitesevaluation, prerequis, planducours, anneedetude, nompers, prenompers, numtelpers, emailpers, coordprivee, numsemestre, idsemestre, intituleniveau, intituleue, codeue);
    }
}
