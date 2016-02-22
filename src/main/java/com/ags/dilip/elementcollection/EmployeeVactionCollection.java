package com.ags.dilip.elementcollection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class EmployeeVactionCollection {

    private static EntityManager em;
    
    public static void main(String[] args) {
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
	  em = emf.createEntityManager();
	  
	  createEmployeeVacation();
    }

    private static void createEmployeeVacation() {
	List<VacationEntry> vacationList = new ArrayList<VacationEntry>();
	for(int i=0 ; i< 3; i++){
	    VacationEntry vacationObj = new VacationEntry();
	    vacationObj.setDaysTaken(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of days")));
	    vacationObj.setStartDate(new Date().toString());
	    vacationList.add(vacationObj);
	    
	}
	Employee emp = new Employee();
	emp.setVacationBookings(vacationList);
	Set<String> nameSet = new TreeSet<String>();
	nameSet.add("name");
	nameSet.add("name1");
	emp.setName(nameSet);
	    
	em.getTransaction().begin();
	//em.persist(vacationList);
	//em.persist(nameSet);  
	em.persist(emp);
	
	em.getTransaction().commit();
    }
}
