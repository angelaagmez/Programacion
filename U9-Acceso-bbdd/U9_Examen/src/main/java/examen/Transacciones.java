package examen;

// insertarCliente () que inserte los datos de un cliente y al menos dos pagos asociados a dicho cliente.

import java.sql.*;

public class Transacciones {
    public static void main(String[] args) {
        insertarCliente();
    }

    public static void insertarCliente(){
        Connection con = ConexionBD.getConnection();

        try{
            con.setAutoCommit(false);

            String clientes = "INSERT INTO customers (?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement statement = con.prepareStatement(clientes);

            statement.setInt(1,100);
            statement.setString(2,"Gift Stores");
            statement.setString(3,"Bonilla");
            statement.setString(4,"Angela");
            statement.setString(5,"+34 693 398 203");
            statement.setString(6,"Mandala Street");
            statement.setString(7,"70");
            statement.setString(8,"Las Vegas");
            statement.setString(9,"NV");
            statement.setString(10,"83030");
            statement.setString(11,"USA");
            statement.setInt(12,1166);
            statement.setDouble(13,437892.6);

            statement.executeUpdate();

            String pago1 = "INSERT INTO payments (?,?,?,?)";

            PreparedStatement statement1 = con.prepareStatement(pago1);

            statement1.setInt(1,100);
            statement1.setString(2,"AA556478");
            statement1.setDate(3, Date.valueOf("2020-10-09"));
            statement1.setDouble(4,25913.8);

            statement1.executeUpdate();

            String pago2 = "INSERT INTO payments (?,?,?,?)";

            PreparedStatement statement2 = con.prepareStatement(pago2);

            statement2.setInt(1,100);
            statement2.setString(2,"VO459165");
            statement2.setDate(3, Date.valueOf("2019-06-01"));
            statement2.setDouble(4,40750.2);

            statement2.executeUpdate();

            con.commit();


        } catch (SQLException throwables) {
            System.out.println("Error: "+throwables.getMessage());
        }
    }

}
