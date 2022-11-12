import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDao {
	
	private String dbUrl = "jdbc:mysql://localhost:3306/employees";
	private String dbUsername = "root";
	private String dbPassword = "root";
	private String dbsql = "com.mysql.cj.jdbc.Driver";

	public String insertquery = "INSERT INTO employee (firstname, lastname, username, password, address, contactnumber) VALUES (?, ?, ?, ?, ?, ?);";
	public String selectById = "SELECT id,firstname,lastname,username,password,address,contactnumber FROM employee WHERE id = ?";
	public String selectAllEmployee = "SELECT * FROM employee";
	public String deleteEmployee = "DELETE FROM employee WHERE id = ?";
	public String updateEmployee = "UPDATE employee SET firstname = ?, lastname = ?, username = ?, password = ?, address = ?, contactnumber = ? WHERE id =?; ";

	protected Connection getConnection() {
		
		Connection connection = null;
		try {
			Class.forName(dbsql);
			connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		return connection;

	}

	public void insertEmployee (Employee employee) throws SQLException {

		try(Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(insertquery);){
			preparedStatement.setString(1, employee.getFirstName());
			preparedStatement.setString(2, employee.getLastName());
			preparedStatement.setString(3, employee.getUsername());
			preparedStatement.setString(4, employee.getPassword());
			preparedStatement.setString(5, employee.getAddress());
			preparedStatement.setString(6, employee.getContactNumber());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Employee selectEmployee(int id) {

		Employee employee = null;
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(selectById);){
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				String firstName = rs.getString("firstname");
				String lastName = rs.getString("lastname");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String address = rs.getString("address");
				String contactNumber = rs.getString("contactnumber");
				employee = new Employee(id,firstName,lastName,username,password,address,contactNumber);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return employee;

	}

	public List <Employee> selectAllEmployees() {

		List <Employee> employees = new ArrayList <> ();
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(selectAllEmployee);){
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("firstname");
				String lastName = rs.getString("lastname");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String address = rs.getString("address");
				String contactNumber = rs.getString("contactnumber");
				employees.add(new Employee( id, firstName, lastName, username, password, address, contactNumber));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;

	}
	
	public boolean deleteEmployee(int id) throws SQLException {

		boolean rowDeleted;
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(deleteEmployee);){
			preparedStatement.setInt(1,id);
			rowDeleted = preparedStatement.executeUpdate() > 0;
		}
		return rowDeleted;

	}

	public boolean updateEmployee(Employee employee) throws SQLException {

		boolean rowUpdated;
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(updateEmployee);){
			preparedStatement.setString(1, employee.getFirstName());
			preparedStatement.setString(2, employee.getLastName());
			preparedStatement.setString(3, employee.getUsername());
			preparedStatement.setString(4, employee.getPassword());
			preparedStatement.setString(5, employee.getAddress());
			preparedStatement.setString(6, employee.getContactNumber());
			preparedStatement.setInt(7, employee.getId());
			rowUpdated = preparedStatement.executeUpdate() > 0;
		}
		return rowUpdated;

	}

}