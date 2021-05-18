package examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static Connection con = null;

    public static Connection getConnection(){
        try{
            if (con==null){
                con = DriverManager.getConnection("jdbc:mariadb://localhost:3333/classicmodels?user=root&password=123456"
                        + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
                System.out.println("Connection Successful");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }

    public static void close() {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

