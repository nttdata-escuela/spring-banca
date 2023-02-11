package com.nttdata.banca.alexanderdSalas.entity;

@Entity
@Table(name = "alexanderd-salas")
@Gette
@Sette
public class AlexanderdSalas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name="tipo", length = 15)
    private String type;
}
