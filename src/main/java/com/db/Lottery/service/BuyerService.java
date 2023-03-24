package com.db.Lottery.service;

import com.db.Lottery.entities.Buyer;
import com.db.Lottery.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerService {
    @Autowired
    BuyerRepository buyerRepository;
    public Buyer createIfDoesntExist(String cnp){
        if(!buyerExists(cnp))
            return createBuyer(cnp);

        return buyerRepository.getByCnp(cnp);
    }
    public boolean buyerExists(String cnp){
            return buyerRepository.buyerExists(cnp);
    }
    public Buyer createBuyer(String cnp){
        if(buyerRepository.createBuyer(cnp))
            return buyerRepository.getByCnp(cnp);
        else
            return null;
    }
}
