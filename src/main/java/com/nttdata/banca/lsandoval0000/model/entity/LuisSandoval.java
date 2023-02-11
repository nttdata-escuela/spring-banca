package com.nttdata.banca.lsandoval0000.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "luis_sandoval")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LuisSandoval {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(name = "last_name", length = 100, nullable = false)
    private String lastName;
    @Column(nullable = false)
    private BigDecimal salary;
    @Column(nullable = false)
    private Date birthdate;

}
