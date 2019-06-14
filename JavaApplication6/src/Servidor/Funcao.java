package Servidor;
import Servidor.conectados.ClienteServidor;
import java.io.IOException;
import java.net.Socket;
/**
 * @author Adston at self
*/
public class Funcao {
    
   private final Servidor server;
   public Funcao( Servidor servidor ){ this.server = servidor;}

   public boolean login( ClienteServidor cliente ){
      return this.server.getLista().adicionarCliente( cliente );
   }

   public boolean lista_usuario(){
        for( ClienteServidor conectado : this.server.getLista().getLista() )
            conectado.enviarMensagem( this.server.getLista().lista_usuarios() );
       return true;
   }

   public boolean transmitir( Socket cliente, String[] msg ){ 
       String transmitir = "transmitir:"; 
       transmitir +=  this.server.getLista().identificaSocket( cliente ).getNick()+":"; 
       String[] destinatarios = this.pegaDestinatarios( msg[1] );
       
       if( destinatarios[0].equalsIgnoreCase("*") ){
           
           transmitir += "*:" + msg[2];
           //this.enviarMsgTodos( transmitir );
           this.enviarMsgTodos( cliente, transmitir );
         return true;
       }
            transmitir += msg[1];
            transmitir += ":" + msg[2];
            
               for( int i = 0; i < destinatarios.length; i++ )
                   if( this.server.getLista().identificaNick( destinatarios[i]) != null )
                      this.server.getLista().identificaNick( destinatarios[i]).enviarMensagem( transmitir );
                    
      return true;
   }
   //AUXILIARES
   public void enviarMsgTodos( Socket cliente, String enviar ){ 
       this.server.getLista().enviaTodos( cliente, enviar ); 
   }
   public String[] pegaDestinatarios( String posi1 ){
       String[] destinos;
       if( posi1.equalsIgnoreCase("*") ){
           destinos = new String[1];
           destinos[0] = "*";
       }else
           destinos = posi1.split(";");
       
       return destinos;
   }

   public void desconectarTodos() throws IOException{
      for( ClienteServidor desconectar : this.server.getLista().getLista() ){
         desconectar.getSocket().close();
      }
   }

   
}
