package com.vivek;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Teacher t = new Teacher();
//		t.setId(7);
//		t.setName("Robert");
//		t.setTech("M.L.");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		
		//Fetch data
		Teacher t = em.find(Teacher.class, 1);
		System.out.println(t);
//		Query q = em.createQuery("from Teacher");
//		List<Teacher> l = q.getResultList();
//		for(Teacher t : l) {
//			System.out.println(t);
//		}
		
		
		//Input data
//		em.getTransaction().begin();
//		em.persist(t);
//		em.getTransaction().commit();
//		System.out.println("Record saved");
	}
}
