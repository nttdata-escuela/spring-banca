package edisonChavez.model.entity;

import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "edison-chavez")
@Getter
@Setter
public class EdisonChavez {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type", length = 15)
    private String type;
}
