package com.nttdata.banca.jordanLaqui.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "jordan_laqui")
@Getter
@Setter
public class JordanLaqui {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type", length = 15)
    private String type;
}
