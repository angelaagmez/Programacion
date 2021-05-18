package entregable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Insertar una nueva oficina en Sevilla con dos nuevos empleados. Insertar un nuevo cliente que esté relacionado con
// uno de los empleados de la oficina nueva.

// Insertar una nueva categoría de productos (productLine) y posteriormente un producto que pertenezca a dicha catgoría
// previamente insertada

public class Transacciones {
    public static void insertarOficina() {
        Connection con = ConexionDB.getConnection();

        try{
            con.setAutoCommit(false);

            String oficina = "INSERT INTO offices VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(oficina);

            statement.setString(1,"45");
            statement.setString(2,"Sevilla");
            statement.setString(3,"+34 637 947 293");
            statement.setString(4,"110 National Square");
            statement.setString(5,"Siute 45");
            statement.setString(6,"NY");
            statement.setString(7,"USA");
            statement.setString(8,"4362");
            statement.setString(9,"NA");

            statement.executeUpdate();

            String empleado = "INSERT INTO employees VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement statement1 = con.prepareStatement(empleado);

            statement1.setInt(1,89);
            statement1.setString(2,"Bonilla");
            statement1.setString(3,"Angela");
            statement1.setString(4,"x4536");
            statement1.setString(5,"abg@gmail.com");
            statement1.setString(6,"45");
            statement1.setInt(7,1002);
            statement1.setString(8,"VP Sales");

            statement1.executeUpdate();

            String empleado2 = "INSERT INTO employees VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement statement2 = con.prepareStatement(empleado2);

            statement2.setInt(1,90);
            statement2.setString(2,"Waack");
            statement2.setString(3,"Gonzalo");
            statement2.setString(4,"x5689");
            statement2.setString(5,"gwc@gmail.com");
            statement2.setString(6,"45");
            statement2.setInt(7,1002);
            statement2.setString(8,"VP Marketing");

            statement2.executeUpdate();

            String cliente = "INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement3 = con.prepareStatement(cliente);

            statement3.setInt(1,120);
            statement3.setString(2,"Alicia and company");
            statement3.setString(3,"Acosta");
            statement3.setString(4,"Alicia");
            statement3.setString(5,"+34 693 237 456");
            statement3.setString(6,"Valley Street");
            statement3.setString(7,"89");
            statement3.setString(8,"London");
            statement3.setString(9,"ND");
            statement3.setString(10,"98473");
            statement3.setString(11,"UK");
            statement3.setInt(12,90);
            statement3.setString(13,"253273.45");

            statement3.executeQuery();


            con.commit();

        } catch (SQLException e) {
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

    public static void insertarCategoriaProductos(){
        Connection con = ConexionDB.getConnection();

        try{
            con.setAutoCommit(false);

            String categoria = "INSERT INTO productlines VALUES (?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(categoria);

            statement.setString(1,"Motorcycles");
            statement.setString(2,"Our motorcycles are state of the art replicas of classic as well as " +
                    "contemporary motorcycle legends such as Harley Davidson, Ducati and Vespa. Models contain stunning" +
                    " details such as official logos, rotating wheels, working kickstand, front suspension, gear-shift " +
                    "lever, footbrake lever, and drive chain. Materials used include diecast and plastic. The models " +
                    "range in size from 1:10 to 1:50 scale and include numerous limited edition and several out-of-production" +
                    " vehicles. All models come fully assembled and ready for display in the home or office. Most include" +
                    " a certificate of authenticity.");
            statement.setString(3,"");
            statement.setString(4,"");

            statement.executeUpdate();

            String producto = "INSERT INTO products VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement1 = con.prepareStatement(producto);

            statement1.setString(1,"S11_6523");
            statement1.setString(2,"2017 Harley-Davidson Dragon Bike");
            statement1.setString(3,"Motorcycles");
            statement1.setString(4,"1:10");
            statement1.setString(5,"Alicia and company");
            statement1.setString(6,"Model features, official Harley Davidson logos and insignias, " +
                    "detachable rear wheelie bar, heavy diecast metal with resin parts, authentic multi-color " +
                    "tampo-printed graphics, separate engine drive belts, free-turning front fork");
            statement1.setInt(7,3452);
            statement1.setDouble(8,99.9);
            statement1.setDouble(9,194.6);

            statement1.executeUpdate();

            con.commit();


        } catch (SQLException e) {
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
