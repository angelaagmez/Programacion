package ejercicios;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {

    public static List<Employee> getEmpleados() {
        Connection con = ConexionBD.getConnection();
        ArrayList<Employee> lista_empleados = new ArrayList<>();

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employees");

            while (rs.next()) {
                Employee e = new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8)
                );
                lista_empleados.add(e);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return lista_empleados;

    }

    public static List<Office> getOffices() {
        Connection con = ConexionBD.getConnection();
        ArrayList<Office> lista_oficinas = new ArrayList<>();

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from offices");

            while (rs.next()) {
                Office o = new Office(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9));
                lista_oficinas.add(o);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return lista_oficinas;
    }
}
