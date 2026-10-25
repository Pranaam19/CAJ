package Lab7;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBase {
    private static Connection con = null;

    static{
        try{
            Properties props = new Properties();
            InputStream input = new FileInputStream("src/Lab8/db.properties"    );

            props.load(input);

            String driver = props.getProperty("db.driver");
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.username");
            String password = props.getProperty("db.password");

            Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static Connection getConnection(){
        return con;
    }
//    public static Statement getStatement(){
//
//    }
}
