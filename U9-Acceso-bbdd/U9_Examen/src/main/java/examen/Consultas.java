package examen;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
// devuelve una lista de oficina que se obtiene de la base de datos  y que será utilizada para mostrar toda esa
// información en formato JSON por pantalla.

public class Consultas {
    public static void main(String[] args) {
        mostrarOficinas();
    }

    public static List<Office> mostrarOficinas() {
        Connection con = ConexionBD.getConnection();
        ArrayList<Office> lista_oficinas = new ArrayList<>();

        String consulta = "SELECT * from offices";

        PreparedStatement statement = null;

        try {
            statement = con.prepareStatement(consulta);
            // statement.setInt(1,);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String officeCode = rs.getString("officeCode");
                String city = rs.getString("city");
                String phone = rs.getString("phone");
                String addressLine1 = rs.getString("addressLine1");
                String addressLine2 = rs.getString("addressLine2");
                String state = rs.getString("state");
                String country = rs.getString("country");
                String postalCode = rs.getString("postalCode");
                String territory = rs.getString("territory");

                Office office = new Office(officeCode, city, phone, addressLine1, addressLine2, state, country, postalCode, territory);
                lista_oficinas.add(office);
            }
            System.out.println(lista_oficinas);


            System.out.println("");
            Gson gson = new Gson();

            Type listType = new TypeToken<ArrayList<Office>>() {}.getType();

            System.out.println(gson.toJson(lista_oficinas,listType));

            return lista_oficinas;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lista_oficinas;
    }
}
