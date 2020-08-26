package com.topicus.casus.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class medicijn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String naam;
    private String type;
    private String hoeveelheid;

    private int BSN;
    private String voorschrijfDatum;
    private String afleverMethode;
    private String eindDatum;
    private String voorschrift;


    @ManyToOne
    private recept recept;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHoeveelheid() {
        return hoeveelheid;
    }

    public void setHoeveelheid(String hoeveelheid) {
        this.hoeveelheid = hoeveelheid;
    }

    public com.topicus.casus.model.recept getRecept() {
        return recept;
    }

    public void setRecept(com.topicus.casus.model.recept recept) {
        this.recept = recept;
    }

    public int getBSN() {
        return BSN;
    }

    public void setBSN(int BSN) {
        this.BSN = BSN;
    }

    public String getVoorschrijfDatum() {
        return voorschrijfDatum;
    }

    public void setVoorschrijfDatum(String voorschrijfDatum) {
        this.voorschrijfDatum = voorschrijfDatum;
    }

    public String getAfleverMethode() {
        return afleverMethode;
    }

    public void setAfleverMethode(String afleverMethode) {
        this.afleverMethode = afleverMethode;
    }

    public String getEindDatum() {
        return eindDatum;
    }

    public void setEindDatum(String eindDatum) {
        this.eindDatum = eindDatum;
    }

    public String getVoorschrift() {
        return voorschrift;
    }

    public void setVoorschrift(String voorschrift) {
        this.voorschrift = voorschrift;
    }
}
