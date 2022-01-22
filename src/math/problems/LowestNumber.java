package math.problems;

	import databases.ConnectToSqlDB;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

	public class LowestNumber {

		public static void main(String[] args)
		{
// Either we can initialize array elements or can
// get input from user. Always it is best to get
// input from user and form the array
			int[] initializedArray
					= new int[] { 25, 110, 74, 75, 5 };
			System.out.println("Given array ");
			for (int i = 0; i < initializedArray.length; i++) {
				System.out.println(initializedArray[i]);
			}
// Initialize minValue with first element of array.
			int minValue = initializedArray[0];
// Loop through the array
			for (int i = 0; i < initializedArray.length; i++) {
// Compare elements of array with minValue and
// if condition true, make minValue to that
// element
				if (initializedArray[i] < minValue)
					minValue = initializedArray[i];
			}
			System.out.println(
					"Smallest element present in given array: "
							+ minValue);
		}
	}
// Java Program to Retrieve Contents of a Table Using JDBC
// connection
// Showing linking of created database
// Importing SQL libraries to create database
import java.sql.*;
public class connection {
	Connection con = null;

	public static Connection connectDB() {
		try {
// Importing and registering drivers
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/hotelman",
					"root", "Bamakomali1#9");
// here,root is the username and Bamakomali1#9" is the
// password,you can set your own username and
// password.
			return con;
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}