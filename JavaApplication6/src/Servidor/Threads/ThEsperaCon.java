package Servidor.Threads;
import Servidor.Servidor;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;
/**
 * @author Adston
*/
public class ThEsperaCon extends Thread{
   private final Servidor server;
   
   public ThEsperaCon( Servidor servidor ){ this.server = servidor; }
   
   @Override
      public void run(){
         while( !Servidor.parar ){
            try {
               
               Socket socket = this.server.getSocketServidor().accept();
                  new ThLeSocket( socket, this.server ).start();
                  
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(null,ex);
               this.interrupt();
            }
         }
         
      }
   
   
}
