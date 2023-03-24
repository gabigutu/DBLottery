package com.db.Lottery.service;

import com.db.Lottery.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;
@Service
public class TicketService {
    @Autowired
    TicketRepository ticketRepository;
    public String generateString(int length) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = length;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
    public String buyTicket(String cnp){
//        if(ticketRepository.insertTicket())
//            ticketRepository.
        String result = generateString(6);
        if(ticketRepository.insertTicket(cnp,result)==1)
            ticketRepository.selectByCNPandTicket(cnp,result);
        return "";
    }

}
