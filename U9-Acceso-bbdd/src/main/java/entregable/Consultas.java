package entregable;

import ejercicios.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consultas {
    public static void pagosClientes(){
        // solicita al usuario un número de cliente (customerNumber) y muestre por pantalla el nombre del cliente
        // (contactFirstName), su apellido (contactLastName), país (country)  y la suma de todos los pagos realizados
        // Statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero de cliente");
        int customerNumber = sc.nextInt();

        Connection con = ConexionDB.getConnection();

        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT c.contactFirstName, c.contactLastName, c.country, SUM(p.amount) AS suma FROM customers c" +
                    " JOIN payments p ON c.customerNumber=p.customerNumber WHERE c.customerNumber = "+customerNumber);

            while (rs.next()){
                System.out.println("ContactFirstName: "+rs.getString("contactFirstName"));
                System.out.println("ContactLastName: "+rs.getString("contactLastName"));
                System.out.println("Country: "+rs.getString("country"));
                System.out.println("Total amount: "+rs.getDouble("suma"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }

    public static void infoPedido(){
        // solicita al usuario el número del pedido (orderNumber) y muestra por pantalla el nombre, precio y cantidad
        // de todos los productos incluídos en el pedido así como el coste total
        // PreparedStatement

        Connection con = ConexionDB.getConnection();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de pedido ");
        int orderNumber = sc.nextInt();

        String consulta = "SELECT p.productName, o.priceEach, o.quantityOrdered FROM orderdetails o JOIN products p" +
                "ON o.productCode = p.productCode WHERE o.orderNumber = ?";
        String consulta2 = "SELECT SUM(o.quantityOrdered*o.priceEach) AS total FROM orderdetails WHERE o.orderNumber = ?";

        PreparedStatement statement = null;
        PreparedStatement statement2 = null;

        try{
            statement = con.prepareStatement(consulta);
            statement.setInt(1,orderNumber);

            statement2 = con.prepareStatement(consulta2);
            statement2.setInt(1,orderNumber);

            ResultSet rs = statement.executeQuery();
            ResultSet rs2 = statement2.executeQuery();

            while (rs.next()){
                System.out.println("ProductName: "+rs.getString("productName"));
                System.out.println("PriceEach: "+rs.getString("priceEach"));
                System.out.println("QuantityOrdered: "+rs.getDouble("quantity"));
            }

            while (rs2.next()){
                System.out.println("Total: "+rs2.getDouble(1));
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    public static void datosJefe(){
        // solicita el número de un empleado (employeeNumber) y muestra por pantalla el nombre(firstName) y los
        // apellidos(lastName) de su jefe
        // PreparedStatement
        Connection con = ConexionDB.getConnection();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de empleado ");
        int employeeNumber = sc.nextInt();

        String consulta = "SELECT e2.firstName, e2.lastName FROM employees e JOIN employees e2 ON e2.employeeNumber = e.reportsTo" +
                "WHERE e.employeeNumber = ?";
        PreparedStatement statement = null;

        try{
            statement = con.prepareStatement(consulta);
            statement.setInt(1,employeeNumber);
            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                System.out.println("FirstName: "+rs.getString("firstName"));
                System.out.println("LastName: "+rs.getString("lastName"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
