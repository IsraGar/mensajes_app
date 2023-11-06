import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_connection(){
        Connection connection = null;
        try{
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "admin");
           if(connection != null){
               System.out.println("Conexión exitosa");
           }else{
               System.out.println("Problemas al conectar a la BBDD");
           }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}