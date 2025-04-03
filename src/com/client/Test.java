
package com.client;

import org.hibernate.Session;

import com.config.HibernateUtil;
import com.model.Department;
import com.model.Employee;

public class Test {
	
public static void main(String[] args) {

Session session=HibernateUtil.getSessionFactory().openSession();
	

Employee A=new Employee();
A.setEid(2);
A.setEname("kj");

Employee B=new Employee();
B.setEid(4);
B.setEname("pp");

Department d=new Department();

d.setDid(101);
d.setDname("HR");
d.getE().add(A);
d.getE().add(B);

session.save(d);

session.beginTransaction().commit();

		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
