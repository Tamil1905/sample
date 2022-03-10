package com.tamil.marks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MarksDAO {

	public static void addMarks(String name,int priliminary,int mains,int interview) throws Exception {

			// Step 1 : Database Driver ( Optional)
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2: Get the Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
					"rev_user", "rev_user");
			System.out.println(connection);
			
			String query = "INSERT into marks_portal (NAME,priliminary,mains,interview) VALUES('"+ name +"',"+priliminary+","+ mains +","+interview+")";
			
			System.out.println(query);
			
			Statement statement = connection.createStatement();
			int rows = statement.executeUpdate(query);
			System.out.println("No of rows inserted:" + rows);
			
			
			statement.close();
			connection.close();
			
		}

	}

