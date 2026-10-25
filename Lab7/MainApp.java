package Lab7;


public class MainApp {
    public static void main(String[] args) {
       EmployeeDAO dao = new EmployeeDAO();


       dao.prepareDAO();
       dao.insertEmployee(105, "Alice", 50000);
       dao.insertEmployee(106, "Bob", 60000);
       dao.fetchAllEmployee();
       dao.updateEmployee(106, "Robert", 65000);
       dao.deleteEmployee(105);
       dao.fetchAllEmployee();
    }
}
