package com.db.Lottery.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "buyers")
public class Buyer {
    @GeneratedValue
    @Column(unique = true)
    String internalIdBuyer;
    @Id
    @Column(unique = true)
    String cnp;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "first_name")
    String firstName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cnp")
    List<Ticket> tickets;

    public String getInternalIdBuyer() {
        return internalIdBuyer;
    }

    public void setInternalIdBuyer(String internalIdBuyer) {
        this.internalIdBuyer = internalIdBuyer;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
