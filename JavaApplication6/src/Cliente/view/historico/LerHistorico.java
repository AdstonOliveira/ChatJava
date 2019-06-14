package Cliente.view.historico;
import Cliente.Cliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * @author Adston at self
*/
public class LerHistorico extends Historico{
   private BufferedReader ler;
   private FileReader fr;
   private EscreverHistorico escrita;
   
      public LerHistorico( Cliente cliente, String IP ) {
         this.cliente = cliente;
         this.escrita = new EscreverHistorico();
         this.escrita.IP = IP;
            if( this.criarNovo() )
               this.criaArray();
      }
      
         public LerHistorico(){
            this.escrita = new EscreverHistorico();
            if( this.criarNovo() )
               this.criaArray();
         }
      
      
         public final boolean criarNovo(){
            File path = new File( this.path );
               if( !path.isDirectory() )
                  path.mkdir();
            
            this.classFile = new File( this.path + this.file );
            
            if( !classFile.exists() ){
               try {
                     this.classFile.createNewFile();
                     this.classFile.setWritable( true );
                     this.classFile.setReadable( true );
                     return true;
                  } catch ( IOException ex ) {
                     JOptionPane.showMessageDialog( this.cliente.getTela(), ex );
                     return false;
                  }
            }else
               return true;
         }
      
      public final boolean criaArray(){
         try {
            this.fr = new FileReader( this.classFile );
            this.ler = new BufferedReader( this.fr );
         
               while( this.ler.ready() ){
                  String linha = this.ler.readLine();
                  conteudo.add( linha );
               }
               
              this.escrita.setLeitura( this );
              
         return true;      
            } catch (FileNotFoundException ex) { // FileReader
               JOptionPane.showMessageDialog(this.cliente.getTela(), ex, "Arquivo nao encontrado",0);
               return false;
            } catch (IOException ex) {// ler
               JOptionPane.showMessageDialog( this.cliente.getTela(), ex, "Erro Leitura IO",0);
         return false;
            }
         
      }
   public ArrayList<String> getConteudo() {
      return conteudo;
   }

   public BufferedReader getLer() {
      return ler;
   }

   public void setLer(BufferedReader ler) {
      this.ler = ler;
   }

   public FileReader getFr() {
      return fr;
   }

   public void setFr(FileReader fr) {
      this.fr = fr;
   }

   public EscreverHistorico getEscrita() {
      return escrita;
   }

   public void setEscrita(EscreverHistorico escrita) {
      this.escrita = escrita;
   }
   
}
