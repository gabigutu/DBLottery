package com.db.Lottery.repository;

import com.db.Lottery.entities.Ticket;
import com.db.Lottery.service.TicketService;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TicketRepository {
    @Autowired
    EntityManager entityManager;
    @Transactional
    public int insertTicket(String cnp, String ticketNumber){
        int result = entityManager.createQuery("INSERT INTO Ticket(ticketNumber,cnp) VALUES ('"
                        + ticketNumber + "','" + cnp + "')").executeUpdate();
        System.out.println(result);
        return result;
    }
    @Transactional
    public Ticket selectByCNPandTicket(String cnp, String ticketNumber){
        return entityManager.createQuery("SELECT ticketNumber, cnp FROM Ticket WHERE ticketNumber = '"
                + ticketNumber + "' AND cnp = '"
                + cnp + "'", Ticket.class).getSingleResult();
    }
}
