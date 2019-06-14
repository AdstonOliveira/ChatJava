package Servidor;
import Servidor.Threads.ThEsperaCon;
import Servidor.conectados.ListaConectados;
import Servidor.view.Visualizacao;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * @author Adston at self
*/
public class Servidor {

   private ServerSocket socketServidor;
   private int porta = 6666;
   public static volatile boolean parar = false;
   private final ListaConectados lista = new ListaConectados();
   private Funcao funcoes = new Funcao( this );
   private Visualizacao tela;
   
   
      public Servidor( int porta ){this.porta = porta;}
   
      public boolean iniciaServico(){
         try { 
            this.socketServidor = new ServerSocket( porta );
            this.socketServidor.setReuseAddress( true );
            
               ThEsperaCon th = new ThEsperaCon( this );
                  th.start();
               
         return true;
         } catch (IOException ex) {
            JOptionPane.showMessageDialog( null, ex );
         return false;
         }
      }
      
      public void fecha() throws IOException{ 
         this.funcoes.desconectarTodos();
         parar = true; // PARAR THREADS SERVIDOR
            try {
                sleep( 1000 );
            } catch (InterruptedException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }   
                this.socketServidor.close();
                Thread.interrupted();
                
      }
         
         
         
/*TESTE*/
  /*    public static void main(String[] args) throws IOException, InterruptedException {
         Servidor s = new Servidor( 6666 );
         s.iniciaServico();
      }      */
      
      
      // --- GETTER SETTER --- 
   public ServerSocket getSocketServidor() {
      return socketServidor;
   }

   public void setSocketServidor( ServerSocket socketServidor ) {
      this.socketServidor = socketServidor;
   }

   public int getPorta() {
      return porta;
   }

   public Funcao getFuncoes() {
      return funcoes;
   }

   public void setFuncoes(Funcao funcoes) {
      this.funcoes = funcoes;
   }

   public void setPorta(int porta) {
      this.porta = porta;
   }

   public static boolean isParar() {
      return parar;
   }

   public static void setParar(boolean parar) {
      Servidor.parar = parar;
   }

   public ListaConectados getLista() {
      return lista;
   }

   public Visualizacao getTela() {
      return tela;
   }

   public void setTela(Visualizacao tela) {
      this.tela = tela;
   }








   
}
