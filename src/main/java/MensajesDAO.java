import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {
    public static void crearMensajeDB(Mensaje mensaje){
        Conexion dbConnect = new Conexion();
        try(Connection connection = dbConnect.GetConnection()){
            PreparedStatement preparedStatement = null;
            try{
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje, fecha_mensaje) VALUES (?,?,?)";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, mensaje.getMensaje());
                preparedStatement.setString(2, mensaje.getAutorMensaje());
                preparedStatement.setString(3, mensaje.getFechaMensaje());
                preparedStatement.executeUpdate();
                System.out.println("Mensaje creado de manera correcta");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerMensajesDB(){

    }
    public static void borrarMensajeDB(int idMensaje){

    }
    public static void actualizarMensajeDB(Mensaje mensaje){

    }
}
