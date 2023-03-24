package com.db.Lottery.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "buyers")
public class Buyer {
    @Id
    String internalIdBuyer;
    @Column(unique = true)
    String cnp;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "first_name")
    String firstName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cnp")
    List<Ticket> tickets;


}
