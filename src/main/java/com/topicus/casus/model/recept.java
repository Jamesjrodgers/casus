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
public class recept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String naam;
    private String type;
    private int hoeveelheid;

    private int BSN;
    private String voorschrijfDatum;
    private String afleverMethode;
    private String eindDatum;
    private String voorschrift;


    @ManyToOne
    private medicijn medicijn;
}
