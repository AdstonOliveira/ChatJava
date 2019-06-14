package Servidor.conectados;
import Servidor.Servidor;
import java.net.Socket;
import java.util.ArrayList;
/**
 * @author Adston at self
*/
public class ListaConectados {

   private ArrayList<ClienteServidor> lista = new ArrayList();
   private Servidor servidor;
   //FUNCOES DA LISTA

   public boolean adicionarCliente( ClienteServidor cliente ){
      if( this.nomeDuplicado( cliente.getNick() ) )
         return false;
      
      this.lista.add( cliente );
      return true;
   }

   private boolean nomeDuplicado( String nome ){
      if(this.lista.size() > 0)
      for( ClienteServidor conectado : this.lista )
         if( nome.equalsIgnoreCase( conectado.getNick() ) )
            return true;
      
      return false;
   }
   
   public String lista_usuarios(){
      String lista_usuarios = "lista_usuarios:";
      if( this.lista.size() > 0 )
         for(ClienteServidor conectado : this.lista)
            lista_usuarios += conectado.getNick()+";";
      else
         lista_usuarios += "";
      
   return lista_usuarios;
   }

   public ClienteServidor identificaNick( String nick ){
       for( ClienteServidor cliente : this.getLista() )
           if( cliente.getNick().equalsIgnoreCase(nick) )
               return cliente;
       
       return null;
   }
   
   public void enviaTodos( Socket cliente, String msg ){
       if( this.lista.size() > 0 )
          for( ClienteServidor c : this.getLista() )
              if(c.getSocket() != cliente)
              c.enviarMensagem( msg );
   }
   
   public ClienteServidor identificaSocket( Socket socket ){
       if( this.getLista().size() > 0 )
           for( ClienteServidor cliente : this.getLista() )
               if(cliente.getSocket() == socket)
                   return cliente;
           
       return null;
   }
   
   public boolean desconectar( Socket desconectar ){
      for( int i = 0; i < lista.size(); i++ )
         if( lista.get(i).getSocket() == desconectar ){
            lista.remove(i);
            break;
         }
         if( this.lista.size() > 0 )
            this.enviaTodos( desconectar, this.lista_usuarios() );
      
      return false;
   }
   
   public String[] listaView(){
      String[] lista = null;
      if( this.lista.size() > 0 ){
         lista = new String[ this.lista.size() ];
      
         for( int i = 0; i < this.lista.size(); i++ )
            lista[i] = this.lista.get(i).getNick();
      
      }else{
         if( lista == null ){
            lista = new String[1];
            lista[0] = "Ninguem conectado";
         }
      }
      return lista;
   }

   public void setServidor(Servidor servidor) {
      this.servidor = servidor;
   }
   
   
   
   
   
   
   //######## Getter and Setter
   public ArrayList<ClienteServidor> getLista(){ return lista; }
   public void setLista(ArrayList<ClienteServidor> lista) { this.lista = lista; }



}