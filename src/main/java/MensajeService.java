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
        System.out.println("**Lista de mensajes**");
        MensajesDAO.leerMensajesDB();
    }
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el ID del mensaje a borrar");
        int id_m = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_m);
    }
    public static void editarMensaje(){

    }
}
