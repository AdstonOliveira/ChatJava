package Cliente.view.historico;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * @author Adston at self
*/
public class EscreverHistorico extends Historico{

 private FileWriter fw;
 private BufferedWriter bw;
 private LerHistorico leitura;
 public String IP;
 
   public void setLeitura( LerHistorico leitura ) throws IOException{
      this.leitura = leitura;

      if( conteudo.isEmpty() )
         this.addLocalHost();

   }
 
   public void addLocalHost() throws IOException{
      this.fw = new FileWriter( this.path + this.file, true );
      this.bw = new BufferedWriter( this.fw );
         bw.append("localhost");
         bw.newLine();
         
            bw.close();
            fw.close();
   }
   
   public boolean addEnd( ) throws IOException{
      this.fw = new FileWriter( this.path + this.file, true );
      this.bw = new BufferedWriter( this.fw );
      boolean gravar = true;
      
      for( String each : conteudo )
         if( each.equalsIgnoreCase(IP) )
            return true;
      
           if( gravar ) 
               try {
                  this.bw.append( this.IP );
                  this.bw.newLine();
                     bw.close();
                     fw.close();
               
               } catch (IOException ex) {
                  JOptionPane.showMessageDialog(this.cliente.getTela(), ex, "Erro gravar novo IP", 0);
                  return false;
               }
      return true;
   }
 
 
 
 
   
}
