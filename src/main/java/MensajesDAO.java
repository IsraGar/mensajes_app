import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {

    private static Connection getConnection() throws SQLException {
        return DatabaseConnection.getConnection();
    }
    public static void crearMensajeDB(Mensaje mensaje){
        try(Connection myConn = getConnection()){
            PreparedStatement preparedStatement = null;
            try{
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje, fecha_mensaje) VALUES (?,?,?)";
                preparedStatement = myConn.prepareStatement(query);
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
        try(Connection myConn = getConnection()){
            PreparedStatement preparedStatement = null;
            try{
                PreparedStatement preparedStatement1 = null;
                ResultSet resultSet = null;
                String query = "SELECT * from mensajes";
                preparedStatement1 = myConn.prepareStatement(query);
                resultSet = preparedStatement1.executeQuery();

                while(resultSet.next()){
                    System.out.println("ID: " + resultSet.getInt("id_mensaje"));
                    System.out.println("Mensaje: " + resultSet.getString("mensaje"));
                    System.out.println("Autor: " + resultSet.getString("autor_mensaje"));
                    System.out.println("Fecha: " + resultSet.getString("fecha_mensaje"));
                    System.out.println("--------------------");
                }
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void borrarMensajeDB(int idMensaje){

    }
    public static void actualizarMensajeDB(Mensaje mensaje){

    }
}
