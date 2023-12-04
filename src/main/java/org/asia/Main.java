package org.asia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        try {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NBDunit");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Calculator Jake = new Calculator(2,3);
            System.out.println("Add: "+Jake.addNumbers());
            System.out.println(Jake.subtractNumbers());
            System.out.println(Jake.divideNumbers());
            System.out.println(Jake.multiplyNumbers());
            System.out.println(Jake.powerNumbers());
            Calculator Jake2 = new Calculator(2,1);
            Calculator Jake3 = new Calculator(3,7);
            Calculator Jake4 = new Calculator(6,9);
            Calculator Jake5 = new Calculator(3,3);
            entityManager.getTransaction().begin();
            entityManager.persist(Jake);
            entityManager.persist(Jake2);
            entityManager.persist(Jake3);
            entityManager.persist(Jake4);
            entityManager.persist(Jake5);
            entityManager.getTransaction().commit();
            Calculator Stefan = entityManager.find(Calculator.class, 1L);
            System.out.println(Stefan.getNumber1());
        } catch (Exception e) {
            System.out.println(e.toString());
            System.exit(1);
        }


    }
}