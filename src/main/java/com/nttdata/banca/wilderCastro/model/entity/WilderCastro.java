package com.nttdata.banca.wilderCastro.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="wilder-castro")
@Getter
@Setter
public class WilderCastro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "type", length = 15)
    private String type;
}
