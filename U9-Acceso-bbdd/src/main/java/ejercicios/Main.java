package ejercicios;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("-----------------------------");
        System.out.println("LISTA DE EMPLEADOS");
        System.out.println(ADClassicModels.getEmpleados());
        System.out.println("-----------------------------");

        System.out.println("-----------------------------");
        System.out.println("LISTA DE OFICINAS");
        System.out.println(ADClassicModels.getOffices());
        System.out.println("-----------------------------");

        //Cierro cualquier conexión que se haya abierto en otro lado
        ConexionBD.close();
    }
}
