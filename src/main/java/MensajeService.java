import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class MensajeService {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Tu nombre");
        String nombre = sc.nextLine();
        Timestamp fecha = new Timestamp(System.currentTimeMillis());

        Mensaje registro = new Mensaje();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(nombre);
        registro.setFechaMensaje(fecha.toString());
        MensajesDAO.crearMensajeDB(registro);
    }
    public static void listarMensaje(){

    }
    public static void borrarMensaje(){

    }
    public static void editarMensaje(){

    }
}
