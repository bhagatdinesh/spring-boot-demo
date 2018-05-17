package com.example.springbootdemo;

import com.dkb.entity.Post;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@RunWith(SpringRunner.class)
//@SpringApplicationConfiguration
@SpringBootTest
public class SpringbootdemoApplicationTests {

    private EntityManagerFactory entityManagerFactory;
    @Test
    public void contextLoads() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist( new Post( "Our very first event!") );
        entityManager.persist( new Post( "A follow up event") );
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    protected void setUp() throws Exception {
        entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.tutorial.jpa" );
    }
}
