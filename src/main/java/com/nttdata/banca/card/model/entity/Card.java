package com.nttdata.banca.card.model.entity;

import com.nttdata.banca.account.model.entity.Account;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cards")
@Getter
@Setter
public class Card {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "number", length = 16, nullable = false)
  private String number;

  @Column(name = "clave", length = 4, nullable = false)
  private String clave;

  @ManyToMany(mappedBy = "cards", fetch = FetchType.LAZY)
  private List<Account> accounts;
}
