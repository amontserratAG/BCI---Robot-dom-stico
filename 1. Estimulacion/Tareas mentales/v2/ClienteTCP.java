import java.net.*;
import java.io.*;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;

public class ClienteTCP extends Thread {

  Socket socket;
  String nombre;
  //Integer varCompartida;
  //Protocolo prt;

  public ClienteTCP(String host, int puerto, String nom) throws IOException {
    boolean flag = false;
    while(!flag){
      try {
        // Instanciamos un socket con la dirección del destino y el
        // puerto que vamos a utilizar para la comunicación
        socket = new Socket(host, puerto);
        nombre = nom;
        //varCompartida = var;
        flag = true;
      } catch (IOException e) {
        System.err.println(e.getMessage());
      }
    }
  }

  @Override
  public void run() {
    System.out.println("Entre a tcp");
    File temp = null;
    PrintWriter bw = null;
    // Declaramos e instanciamos el objeto DataInputStream
    // que nos valdrá para recibir datos del servidor
    DataInputStream in = null;
    //BufferedReader in = null;
    /*try {
      in = new BufferedReader (new InputStreamReader(socket.getInputStream()));
      //in = new DataInputStream (socket.getInputStream());
    } catch (IOException ex) {
      Logger.getLogger(ClienteTCP.class.getName()).log(Level.SEVERE, null, ex);
      System.out.println("Fallo conexión");
    }*/

    // declaramos una variable de tipo string
    // Declaramos un bloque try y catch para controlar la ejecución del subprograma
    try {
      //int flag = 1;
      temp = new File("eeg.txt");
      bw = new PrintWriter(new FileWriter(temp));
      String mensaje = "";
      if (!temp.exists()) {
        System.out.println("Creando Archivo prueba");
      } else {
        System.out.println("Sobre Escribiendo Archivo");
      }
      System.out.println("Entrando a recibir en tcp");
      // Creamos un bucle do while en el que recibimos el mensaje del servidor
      System.out.println("varCompartida tcp: " + Protocolo.varCompartida);
      do {
        //in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        in = new DataInputStream (socket.getInputStream());
        mensaje = in.readLine();
        mensaje = mensaje + "\n";
        bw.write(mensaje);
        mensaje = "";
      } while (Protocolo.varCompartida == 1);
      System.out.println("varCompartida: " + Protocolo.varCompartida);
      System.out.println("acabe de recibir");
      bw.close();
      socket.close();
      System.out.println("escrito Archivo eeg");
    } catch (IOException e) {
      System.err.println(e.getMessage());
      bw.close();
      try {
        socket.close();
      } catch (IOException er) {
        System.err.println(er.getMessage());
        System.out.println("Error socket tcp");
      }
    }
  }
}
