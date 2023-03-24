package com.db.Lottery.controllers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @PutMapping("/buy")
    public Object ticketBuy (@RequestParam (name = "cnp") String cnp) {

        return null;
    }

}
