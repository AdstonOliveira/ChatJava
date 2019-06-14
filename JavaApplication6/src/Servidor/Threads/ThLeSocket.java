package Servidor.Threads;
import Servidor.Servidor;
import Servidor.conectados.ClienteServidor;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * @author Adston
*/
public class ThLeSocket extends Thread{
   private Socket socket;
   private Scanner scanner;
   private volatile boolean stop =  false;
   private final Servidor servidor;
   
   public ThLeSocket( Socket socket, Servidor servidor ){ this.socket = socket; this.servidor = servidor; }
   
   @Override
   public void run(){
      try {
         this.scanner = new Scanner( socket.getInputStream() );
      } catch (IOException ex) {
          JOptionPane.showMessageDialog( this.servidor.getTela(), ex );
          this.interrupt();
      }
      while( !Servidor.parar || !this.scanner.hasNext() )
          try {
              this.lerScanner();
          } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex); 
            this.interrupt(); 
          }
      this.interrupt();
   }
   
   public synchronized void lerScanner() throws IOException{
         while( scanner.hasNextLine() ){
             String valor = scanner.nextLine();
             this.encaminharFuncao( valor, this.socket );
            
            if( !scanner.hasNext() ){
               this.servidor.getLista().desconectar( this.socket );
               this.servidor.getTela().getFormatacao().addLista() ;
                  this.interrupt();
            }
         }
      this.interrupt();
   }
 
      private void encaminharFuncao( String recebida, Socket socketEnviou ) throws IOException{
         String[] identificaFuncao = recebida.split(":");
         if( this.checaTamanho(identificaFuncao) ){
            switch ( identificaFuncao[0] ){
               
               case "login" :
                   String[] erroLogin = { "login:false", "Nick em uso, utilize outro" };
                   ClienteServidor cliente;
                   
                     if( this.loginValido( identificaFuncao[1] ) ){
                        cliente = new ClienteServidor( this.socket, identificaFuncao[1] );
                        
                        if( this.servidor.getFuncoes().login( cliente ) ){
                           cliente.msgLogin( true );
                           this.servidor.getFuncoes().lista_usuario();
                           this.servidor.getTela().getFormatacao().addLista();
                        }else{
                            try {
                                this.enviarErro( this.socket, erroLogin );
                           } catch (IOException ex) {
                                JOptionPane.showMessageDialog(this.servidor.getTela(), ex,"Não foi possivel retornar erro",0);
                           }
                        }
                     }else{
                      erroLogin[1] = "Mensagem de Login não atende aos parametros";
                        try {
                            this.enviarErro( socket, erroLogin );
                        } catch (IOException ex) {
                            Logger.getLogger(ThLeSocket.class.getName()).log(Level.SEVERE, null, ex);
                        }
                  }
               break;
               case "mensagem" :
                  if( !identificaFuncao[2].trim().equalsIgnoreCase("") )
                     this.servidor.getFuncoes().transmitir( socketEnviou, identificaFuncao );
                  else{
                     String[] erroFuncao = { "Mensagem sem conteudo não sera enviada","Verifique o formato de seu envio\n" + recebida };// informar erro
                     this.enviarErro( socket, erroFuncao );
                  }
               break;
               case "sair":
                   this.servidor.getLista().desconectar( socket );
                   this.servidor.getTela().getFormatacao().addLista();
                   this.servidor.getLista().lista_usuarios();
               break;
               default :
                   String[] erroFuncao = { "comando não idenificado","Verifique o formato de seu envio\n" + recebida };// informar erro;
                   this.enviarErro( socket, erroFuncao );
            }
         }else{
            String[] erroFuncao = { "String recebida em formato invalido","Verifique o formato de seu envio\n" + recebida };// informar erro;
            this.enviarErro( socket, erroFuncao );
         }
      }
   
   char[] caracteresProibidos = new char[]{ '*', ',', ':' };
   public boolean loginValido( String nickAvaliar ){
       String avaliar = nickAvaliar.trim();
        if( avaliar.equals("") )
            return false;
       
          for( int i = 0; i < nickAvaliar.length(); i++ ) {
              for( char proibidos : caracteresProibidos )
                  if( proibidos ==  nickAvaliar.charAt(i)  )
                     return false;
                   
          }
           
       
       
       return true;
   }
   
   public boolean checaTamanho( String[] recebida ){
       switch ( recebida[0] ){
           case "login":
               if(recebida.length != 2)
                   return false;
           return true;
           case "mensagem" :
               if(recebida.length != 3)
                   return false;
           return true;
           default :
              
              return false; // alterado de true para false == Esta funcionando
       }
   }
   
   public void enviarErro( Socket socket, String[] erro ) throws IOException{
       PrintStream EnvioErro = new PrintStream( socket.getOutputStream() );
          EnvioErro.println( erro[0] );
          EnvioErro.println( erro[1] );
   }
   
}