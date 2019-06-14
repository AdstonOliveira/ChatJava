package Cliente.view;
/**
 * @author Adston at self
*/
public class MontaMsgRecebida {
   
   public static String montaMsgRecebida( String msgRecebida ){
      //0 = funcao # 1 = origem # 2 = destinos # 3 = mensagem
      String[] divideFuncao = msgRecebida.split( ":" );
      String[] destinos;
      String montar = "'"+divideFuncao[1]+"'" + " enviou para ";
      
      if( !divideFuncao[2].equals("*") ){
         destinos = divideFuncao[2].split(";");
               for( int i = 0; i < destinos.length; i++ )
                  if(i < destinos.length - 1){
                     if(!destinos[i].equalsIgnoreCase(divideFuncao[1]))
                        montar += destinos[i] + ", ";
                  }else
                     montar += destinos[i] + "";
      }else
         montar += "Todos";
      
      montar += ":\n " + divideFuncao[3];
      
      return montar;
   }
   
   
   
   
   
   
   
   
   
   
   
}
