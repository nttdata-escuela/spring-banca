package com.nttdata.banca.josephAvila.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "joseph-avila")
@Getter
@Setter
public class josephAvila {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type", length = 15)
    private String type;

}