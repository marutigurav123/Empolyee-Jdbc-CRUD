package com.jdbc.empolyee;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import com.mysql.cj.jdbc.Driver;
public class EmpolyeeCrud {	
	public Connection getConnection() throws SQLException, IOException {		
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		FileInputStream fileInputStream=new FileInputStream("config.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);		
		Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username")
				,properties.getProperty("password"));
		return connection;				
	}
	
	public Employee saveEmployee(Employee emp) throws SQLException, IOException {
		Connection con=getConnection();
		String query ="insert into jdbcbasic.employee values(?,?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, emp.getId());
		pstmt.setString(2, emp.getName());
		pstmt.setLong(3, emp.getPhone());
		pstmt.setString(4, emp.getEmail());
		pstmt.setString(5, emp.getPassword());
		pstmt.setDouble(6, emp.getSalary());
		pstmt.execute();
		con.close();
		System.out.println("Inserted");
		return emp;		
		
	}
	
	public String updateEmp(String name, int id) throws SQLException, IOException {
		Connection connection=getConnection();
		String query="update jdbcbasic.employee set name=? where id=?";
		PreparedStatement pstmt=connection.prepareStatement(query);
	    pstmt.setString(1, name);
	    pstmt.setInt(2,id);
	    pstmt.execute();
	    connection.close();
	    System.out.println("updated");
		return "updated";     
	}
	
	public void deleteEmp(int id) throws SQLException, IOException {
		
		Connection con=getConnection();
		
		String query="delete from  jdbcbasic.employee where id=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.execute();
		con.close();
		System.out.println("Deleted");
		
		
	}
	public int getData(int id) throws SQLException, IOException {
		Connection con=getConnection();
		
		String query="select * from jdbcbasic.employee where id=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, id);
		ResultSet rs=pstmt.executeQuery(); 
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getLong(3)); 
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));	
			System.out.println(rs.getDouble(6));
		}
		
		con.close();
		System.out.println("selected");
		return id; 
		
	
}
}
