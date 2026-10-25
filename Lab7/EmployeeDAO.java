package Lab7;


import java.sql.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EmployeeDAO {
    private static final Logger logger = Logger.getLogger(EmployeeDAO.class.getName());
    private Connection conn = null;
    private PreparedStatement ps = null;

    public void prepareDAO(){
        try{
            conn = DBConnection.getConnection();
            String query = "INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)";
            ps = conn.prepareStatement(query);
            FileHandler fh =  new FileHandler("employeeApp.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void insertEmployee(int id, String name, int salary){
        try{
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setDouble(3,salary);
            int rows = ps.executeUpdate();
            conn = DBConnection.getConnection();

            logger.info(rows+" rows affected");

        }catch(Exception e){
            logger.log(Level.SEVERE,"Error inserting employee",e);
        }
    }

    public void fetchAllEmployee(){
        String query  = "SELECT * FROM employee";
        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)){
            while (rs.next()){
                logger.info("ID:"+rs.getInt("id")+
                        ", Name: "+rs.getString("name")+
                        ", Salary: "+rs.getDouble("salary"));
            }
        }
        catch(SQLException e){
            logger.log(Level.SEVERE, "Error fetching employees: ", e);
        }
    }

    public void deleteEmployee(int id) {
        String query = "DELETE FROM employee WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);

            int rowsAffected = ps.executeUpdate();
            logger.info(rowsAffected + " row(s) deleted successfully.");
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error deleting employee: ", e);
        }
    }

    public void updateEmployee(int id, String newName, int newSalary) {
        String query = "UPDATE employee SET name = ?, salary = ? WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, newName);
            ps.setInt(2, newSalary);
            ps.setInt(3, id);

            int rowsAffected = ps.executeUpdate();
            logger.info(rowsAffected + " row(s) updated successfully.");
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error updating employee: ", e);
        }
    }




}
