package teoria.transaccion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection con=ConexionBD.getConnection();

        try{
            con.setAutoCommit(false);
            OfficeModel.insertOffice(
                    new Office(
                            "8",
                            "Sevilla",
                            "+34 955 123 123",
                            "Avda Castilleja",
                            "default",
                            "",
                            "Spain",
                            "41940",
                            "EMEA"));

            System.out.println("Insertada oficina");

            EmployeeModel.insertEmployee(
                    new Employee(
                            8000,
                            "Perez",
                            "Jorge",
                            "8181",
                            "jorgeperez@classicmodelcars.com",
                            "8",
                            1102,
                            "Comercial"));
            con.commit();
            System.out.println("Insertado empleado");

        }catch (SQLException e){
            System.out.println("error: " +e.getMessage());
            try{
                if (con!=null){
                    System.out.println("Dejamos la BBDD en estado consistente.");
                    con.rollback();
                }
            } catch (SQLException throwables){
                System.out.println("Error en el rollback");
                throwables.printStackTrace();
            }
        }
    }
}
