import java.net.*;
import java.io.*;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;

public class Cliente{

  Socket socket;
  String nombre;

  public Cliente(String host, int puerto, String nom) throws IOException {
   boolean flag = false;
    while(!flag){
      try {
        // Instanciamos un socket con la dirección del destino y el
        // puerto que vamos a utilizar para la comunicación
        socket = new Socket(host, puerto);
        nombre = nom;
        flag = true;
      } catch (IOException e) {
        System.err.println(e.getMessage());
        System.out.println("Fallo conexión con cliente en protocolo");
      }
    }
  }

  public void excecute(int time, int override, int label) {
    File labels = null;
    File eeg = null;
    PrintWriter lab = null;
    PrintWriter eg = null;
    // Declaramos e instanciamos el objeto DataInputStream
    // que nos valdrá para recibir datos del servidor
    DataInputStream in = null;
    //BufferedReader in = null;

    // declaramos una variable de tipo string
    // Declaramos un bloque try y catch para controlar la ejecución del subprograma
    try {
      labels = new File("labels.txt");
      eeg = new File("signal.txt");
      if (override == 0) {
        System.out.println("Creando Archivos");
        lab = new PrintWriter(new FileWriter(labels));
        eg = new PrintWriter(new FileWriter(eeg));
      } else {
        System.out.println("Completando Archivos");
        lab = new PrintWriter(new FileWriter(labels,true));
        eg = new PrintWriter(new FileWriter(eeg,true));
      }

      long start = 0;
      long end = 0;
      long dif = 0;
      /*ArrayList<ArrayList<String>> buffer = new ArrayList<>(8);
      for(int i=0; i < buffer; i++) {
        buffer.add(new ArrayList<>());
      }*/
      // Creamos un bucle do while en el que recibimos el mensaje del servidor
      String mensaje = "";
      String señal = "";
      start = System.currentTimeMillis();
      while (time > dif) {
        //in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        in = new DataInputStream (socket.getInputStream());
        mensaje = in.readLine();
        String[] partes = mensaje.split(";");
        int i = 1;
        for (; i < partes.length - 1; i++ ) {
          señal =  señal + partes[i] + ";";
        }
        señal = señal + "\n";
        eg.write(señal);
        //System.out.println(mensaje);
        lab.write(label + "\n");
        //System.out.println(label);
        mensaje = "";
        señal = "";
        end = System.currentTimeMillis();
        dif = end - start;
      }
      //System.out.println("acabe de recibir");
      lab.close();
      eg.close();
      System.out.println("Archivo Guardado signal y label");
    } catch (IOException e) {
        System.err.println(e.getMessage());
        lab.close();
        eg.close();
    }
  }

  public void close() throws IOException{
    try{
      socket.close();
    }catch (IOException e){
      System.err.println(e.getMessage());
    }
  }
}
