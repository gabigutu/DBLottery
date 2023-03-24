package com.db.Lottery.controllers;

import com.db.Lottery.entities.Buyer;
import com.db.Lottery.service.BuyerService;
import com.db.Lottery.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    BuyerService buyerService;
    @Autowired
    TicketService ticketService;
    @PutMapping("/buy")
    public String ticketBuy (@RequestParam (name = "cnp") String cnp) {
        Buyer buyer = buyerService.createIfDoesntExist(cnp);
        return ticketService.buyTicket(buyer.getCnp());
    }
}
