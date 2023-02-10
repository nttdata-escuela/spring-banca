package com.nttdata.banca.account.model.entity;

import com.nttdata.banca.card.model.entity.Card;
import com.nttdata.banca.customer.model.entity.Customer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "accounts")
@Getter
@Setter
public class Account {
  @Id
  private String id;

  @Column(name = "number", length = 15, nullable = false)
  private String number;

  @Column(name = "amount", nullable = false)
  private Float amount;

  @Column(name = "create_at", nullable = false) // Snake Case
  @Temporal(TemporalType.TIMESTAMP)
  private Date createAt;  // lower Camel Case

  @ManyToOne  // Foreign Key
  @JoinColumn(name = "customer_id")
  private Customer customer;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "accounts_cards",
    joinColumns = { @JoinColumn(referencedColumnName = "id", name = "account_id") },  // Account
    inverseJoinColumns = { @JoinColumn(referencedColumnName = "id", name = "card_id") })  // Card
  private List<Card> cards;
}
