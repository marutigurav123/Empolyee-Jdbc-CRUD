package com.jdbc.empolyee;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) throws SQLException, IOException {
		//Insert DAta
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the id");
//		int id=sc.nextInt();
//		System.out.println("Enter the name");
//		String name=sc.next();
//		System.out.println("Enter the phone");
//		long phone=sc.nextLong();
//		System.out.println("Enter the email");
//		String email=sc.next();
//		System.out.println("Enter the pass");
//		String pass=sc.next();
//		System.out.println("Enter the salary");
//		double sal=sc.nextDouble();
//		
//		Employee emp=new Employee();
//		emp.setId(id);
//		emp.setName(name);
//		emp.setPhone(phone);
//		emp.setEmail(email);
//		emp.setPassword(pass);
//		emp.setSalary(sal);
//		
//		EmpolyeeCrud ec= new EmpolyeeCrud();
//		ec.saveEmployee(emp);
//		
		
		
		//Update Data
//		EmpolyeeCrud ec1= new EmpolyeeCrud();
//		ec1.updateEmp("Maruti", 1);
		
		

		//Delete Data
//	  Scanner sc=new Scanner(System.in);
//	   System.out.println("Enter the id");
//	   int id=sc.nextInt();
//	   
//	   Employee emp2=new Employee();
//		emp2.setId(id);
//		
//		EmpolyeeCrud ec2= new EmpolyeeCrud();
//		ec2.deleteEmp(id);
		
		//get data
//		Scanner sc=new Scanner(System.in);
//		   System.out.println("Enter the id");
//		   int id=sc.nextInt();
//		   
	
//		   Employee emp3=new Employee();
//		    emp3.setId(id);
//			
//			EmpolyeeCrud ec3= new EmpolyeeCrud();
//			ec3.getData(id);
			
			// Another Way to get DAta
			EmpolyeeCrud ec4= new EmpolyeeCrud();
			ec4.getData(1);
			
		
	}
	
	

}
