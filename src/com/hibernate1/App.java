package com.hibernate1;


	import org.hibernate.Session;
import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

import com.hibernate.project.Users;

	

	public class App {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SessionFactory factory = new Configuration()
	                .configure("hibernate.cfg.xml")
	                .addAnnotatedClass(Users.class)
	                .buildSessionFactory();

	Session session = factory.getCurrentSession();

	try {
	// Create object of entity class type
	Users user = new Users( 3, "Ali","Akhtar","aliakhtar1997@gmail.com");
	// Start transaction
	session.beginTransaction();
	// Perform operation
	session.save(user);


	// Commit the transaction 
	session.getTransaction().commit();
	System.out.println("Row Added");


	} finally {
	session.close();
	factory.close();
	}

	}
	
	}



	
