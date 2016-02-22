package com.coderevisited.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeTest {

    private static EntityManager em;

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        em = emf.createEntityManager();

        createEmployee("Saint", "Peter", "Engineering");
        createEmployee("Jack", " Dorsey", "Imaginea");
        createEmployee("Sam", "Fox", "Imaginea");


    }

    private static void createEmployee(String firstName, String lastName, String dept) {
        em.getTransaction().begin();
        Employee1 emp = new Employee1(firstName, lastName, dept);
        em.persist(emp);
        em.getTransaction().commit();
    }
}
