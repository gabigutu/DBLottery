package com.db.Lottery.repository;

import com.db.Lottery.entities.Buyer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.JDBCType;

@Repository
public class BuyerRepository {
    @PersistenceContext
    EntityManager entityManager;
    public boolean buyerExists(String cnp){
        return getByCnp(cnp)!=null;
    }
    @Transactional
    public boolean createBuyer(String cnp){
        int result = entityManager.createQuery("INSERT into Buyer(cnp) VALUES('" + cnp + "')").executeUpdate();
        return result==1?true:false;
    }
    @Transactional
    public Buyer getByCnp(String cnp){
        return entityManager.find(Buyer.class, cnp);
    }
}
