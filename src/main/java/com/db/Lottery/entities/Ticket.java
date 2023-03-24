package com.db.Lottery.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @Column(unique = true)
    int id;
    @Column(unique = true, name = "ticket_number")
    String ticketNumber;
    @Column(unique = true)
    String cnp;


}
