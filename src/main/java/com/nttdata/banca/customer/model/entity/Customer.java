package com.nttdata.banca.customer.model.entity;

import com.nttdata.banca.account.model.entity.Account;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customers") // plural
@Getter
@Setter
public class Customer { // singula
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "last_name", length = 40, nullable = false)
  private String lastName;

  @Column(name = "first_name", length = 40, nullable = false)
  private String firstName;

  @Column(name = "dni", length = 8, nullable = false)
  private String dni;

  @Column(name = "birthday")
  @Temporal(TemporalType.DATE)
  private Date birthday;

  @Column(name = "age", columnDefinition = "tinyint")
  private Integer age;

  @OneToMany(mappedBy = "customer" )
  private List<Account> accounts;

}
