package com.nttdata.banca.cristobalRamirez.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cristobal-ramirez")
@Getter
@Setter
public class CristobalRamirez {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type", length = 15)
    private String type;
}
