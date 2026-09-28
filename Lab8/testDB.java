package Lab8;

import java.sql.*;

public class testDB {
    private static Connection con;
    private static Statement stm;
    private static ResultSet rs;

    public static void loadDriver(String s)  {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("loaded driver sucessfully");
    }

    public static void createConnection()  {
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","pran","pran");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void generateStatement(){
        try {
            stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void display() {
        try {
            rs = stm.executeQuery("select * from login");
            while (rs.next()) {
                System.out.println("name: " + rs.getString(1) + "\t");
                System.out.println("password: " + rs.getString(2));
                System.out.println();
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    public static void closeObjects(){
        try {
            rs.close();
            stm.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args ){
//        loadDriver();
//        createConnection();
//        generateStatement();
//        display();
//        closeObjects();
    }
}