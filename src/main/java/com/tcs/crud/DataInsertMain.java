package com.tcs.crud;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.tcs.util.HibernateOGMUtil;
import com.tcs.vo.Employee;


public class DataInsertMain {

	private static EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) {

		/* Line 1 */ entityManagerFactory = HibernateOGMUtil.getEntityManagerFactory();

		/* Line 2 */ EntityManager em = entityManagerFactory.createEntityManager();

		/* Line 3 */ Employee employee = new Employee();
		/* Line 4 */employee.setName("Yogesh");

		/* Line 5 */ em.getTransaction().begin();
						
		/* Line 6 */ em.persist(employee);
		/* Line 7 */ em.getTransaction().commit();
		/* Line 8 */ em.close();
		/* Line 9 */ HibernateOGMUtil.closeEntityManagerFactory();
	}
}
