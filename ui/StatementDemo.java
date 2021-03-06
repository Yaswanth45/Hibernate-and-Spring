package com.cts.jdbcd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementDemo {

	public static void main(String[] args) {
		try(
				Scanner sc=new Scanner(System.in);
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","welcome");
				){
			Statement st = con.createStatement();
			
			String jobId, jobTitle, minSalary, maxSalary;
			
			System.out.print("Enter job id : ");
			jobId = sc.next();
			System.out.print("Enter job title : ");
			jobTitle = sc.next();
			System.out.println("Enter min. salary : ");
			minSalary = sc.next();
			System.out.println("Enter max. salary : ");
			maxSalary = sc.next();
			
			String sql = 
			"insert into jobs values (" + "'" + jobId + "'" + "," +"'" + jobTitle + "'" + "," + minSalary + "," + maxSalary + ")";
			
			
			st.executeUpdate(sql);

			System.out.println("Row Inserted.");
		} catch (SQLException e) {
			System.err.println("Could not insert");
			e.printStackTrace();
		}

	}

}
