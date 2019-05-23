package com.starshot.domain;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;

import static org.junit.Assert.*;

public class TimeRecordTest {

    SessionFactory sessionFactory;

    @Before
    public void setUp() throws Exception {
        sessionFactory = new Configuration().configure()
                .buildSessionFactory();

    }

    @Test
    public void saveRecord() {
        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(new TimeRecord("jose almario"));
        entityManager.getTransaction().commit();
        entityManager.close();
        assertTrue(true);
    }

}