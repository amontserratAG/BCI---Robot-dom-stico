import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.lang.Thread.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.io.IOException;

/**
 *
 * @author Audome
 */
public class Protocolo extends Thread {
  //ventana para mostrar las Imagenes
  JFrame frame;
  //contiene los paneles que se van intercambiando
  JPanel cardPanel;
  //paneles que muestran las distintas imagenes
  JPanel firstP, secondP, thirdP;
  //contenedor de los paneles
  //CardLayout ourLayout;
  static int varCompartida;

  //constructor de la clase
  public Protocolo() {
    varCompartida = 1;
    crear();
  }

  public void crear(){
    frame = new JFrame();
    cardPanel = new JPanel(new CardLayout());
    //ourLayout = new CardLayout();
    firstP = new JPanel();
    secondP = new JPanel();
    thirdP = new JPanel();
    cardPanel.add(firstP, "First");
    cardPanel.add(secondP, "Second");
    cardPanel.add(thirdP, "Third");
    cardPanel.setBounds(0,0,1300,750);
    frame.getContentPane().setLayout(new BorderLayout());
    frame.getContentPane().add(cardPanel,BorderLayout.CENTER);
    //frame.add(cardPanel);
    frame.setUndecorated(true);
    frame.setBounds(0, 0, 1700, 1400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void cargaImagen(JPanel panel, String img) {
    String ruta = "Imagenes/";
    //JPanelConFondo nel = new JPanelConFondo();
    ruta = ruta + img;
    ImageIcon imge = new ImageIcon(getClass().getResource(ruta));
    //Image imagenExterna = new ImageIcon(img).getImage();
    //nel.setImagen(imagenExterna);
    //System.out.println(ruta);
    JLabel lb = new JLabel();
    lb.setIcon(imge);
    //lb.setIcon(imagenExterna);
    panel.removeAll();
    //panel.add(nel);
    panel.add(lb);
  }

  //@Override
  public void ejecutar(){
    System.out.println("Entre a ejecutar en protocolo");
    CardLayout ourLayout = (CardLayout)(cardPanel.getLayout());
    String[] imagen = {"cereal", "bed", "ivan3", "television"};  //1,3,5,7
    int[] lab = {1, 3, 5, 7};  //1,3,5,7

    String[] dummy = {"gato", "gato1", "gato2", "gato3"}; //0,2,4,6
    int[] img = {0, 2, 4, 6}; //0,2,4,6
    int imaginery = 8;

    String[] grisB = {"cer1", "bed1", "Ivan1", "tv1"};
    String[] grisM = {"cue", "cue1", "cue2", "cue3"};
    Cliente cliente;
    int override = 0;
    int i = 0;
    long end1, start1;
    try{
      cliente = new Cliente("127.0.0.1", 1377, "prueba");
      System.out.println("Entre a ciclo con el cliente");
      while (i < 4) {
         int k = 0;
         while (k < 3) {
            start1 = System.currentTimeMillis();
            firstP.setBackground(Color.GRAY);
            //System.out.println("imagen cuadro");
            cargaImagen(firstP, "GrisB/base.png");
            //System.out.println("imagen cuadro en panel");
            ourLayout.show(cardPanel, "First");
            try {
              //System.out.println("base" + i);
              sleep(4000);
              end1 = System.currentTimeMillis();
              //System.out.println("cuadro blanco protocol ms:" + (end1-start1));
              start1 = System.currentTimeMillis();
            } catch (Exception ex) {
              Logger.getLogger(Protocolo.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (k == 0) {
              secondP.setBackground(Color.GRAY);
              cargaImagen(secondP, "Dummy/" + dummy[i] + ".png");
              ourLayout.show(cardPanel, "Second");
              //System.out.println("dummy" + k);
              cliente.excecute(1400, override, img[i]);
              override = 1;
            } else if (k == 1) {
              secondP.setBackground(Color.BLACK);
              cargaImagen(secondP, "Imagen/" + imagen[i] + ".png");
              ourLayout.show(cardPanel, "Second");
              //System.out.println("imagen" + k);
              cliente.excecute(1400, override, lab[i]);
            } else {
              secondP.setBackground(Color.GRAY);
              cargaImagen(secondP, "GrisB/gris.png");
              ourLayout.show(cardPanel, "Second");
              //System.out.println("gris" + k);
              cliente.excecute(1400, override, imaginery);
            }
            try {
              end1 = System.currentTimeMillis();
              //System.out.println("cuadro gatos protocol ms:" + (end1-start1));
              start1 = System.currentTimeMillis();
            } catch (Exception ex) {
               Logger.getLogger(Protocolo.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (k == 0) {
               thirdP.setBackground(Color.GRAY);
               cargaImagen(thirdP, "GrisM/" + grisM[i] + ".png");
               ourLayout.show(cardPanel, "Third");
               //System.out.println("grisM" + i);
            } else {
               thirdP.setBackground(Color.GRAY);
               cargaImagen(thirdP, "GrisB/" + grisB[i] + ".png");
               ourLayout.show(cardPanel, "Third");
               //System.out.println("grisB" + i);
            }
            try {
               sleep(600);
               end1 = System.currentTimeMillis();
               //System.out.println("letras protocol ms:" + (end1-start1));
            } catch (Exception ex) {
               Logger.getLogger(Protocolo.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println("Fallo conexión");
            }
            k++;
         }
         i++;
      }
      varCompartida = 0;
      System.out.println("varCompartida: " + varCompartida);
      frame.dispose();
      cliente.close();
    }catch (Exception e) {
      System.err.println(e.getMessage());
      //cliente.close();
    }
  }

  public static void main(String[] args) throws Exception {
    //Thread th;
    Protocolo prt;
    //Integer varCompartida = new Integer(1);
    try{
      /*nom = args[1];
      puerto = args[2];
      ruta = args[3];
      puerto = args[4];*/
      prt = new Protocolo();
      System.out.println("Cree protocolo");
      Thread th = new ClienteTCP("127.0.0.1", 1377, "prueba");
      System.out.println("cree hilo");
      th.start();
      prt.ejecutar();
      //varCompartida = 0;
      th.join();
    } catch (IOException | InterruptedException | NumberFormatException ex) {
      ex.printStackTrace();
    }
    System.exit(0);
  }
}
