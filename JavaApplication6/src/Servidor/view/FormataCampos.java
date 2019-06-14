package Servidor.view;
import java.awt.Color;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
/**
 * @author Adston
 */
public final class FormataCampos {
   private final Visualizacao tela;
   public FormataCampos(Visualizacao tela){
      this.tela = tela;
   }
   
   public void conexaoAceita(){
      String iniciado = "Servidor Iniciado!!!";
      JOptionPane.showMessageDialog( this.tela, iniciado );
      
         try {
            this.tela.getCampoID().setText( java.net.InetAddress.getLocalHost().getCanonicalHostName());
            this.tela.setTitle("Nome do servidor: " + java.net.InetAddress.getLocalHost().getHostName());
         } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(tela, ex);
            this.tela.getCampoID().setText("Não identificado");
         }

      this.tela.getLabelStatus().setText(iniciado);
      this.tela.getLabelStatus().setForeground( Color.DARK_GRAY );
      
      this.tela.getPnStatus().setBackground( Color.GREEN );
      this.tela.getLabelParado().setText("Esperando Conexões");
      this.tela.getLabelParado().setForeground( Color.DARK_GRAY );

      this.tela.getBtIniciar().setEnabled( false );
   }
   
   public void conexaoNegada(){
      JOptionPane.showMessageDialog( this.tela, "Erro ao iniciar" );
      
      this.tela.getCampoID().setText( "Não iniciado" );
      this.tela.getLabelParado().setText( "Servidor não iniciado" );
      this.tela.getPnStatus().setBackground( Color.RED );
      this.tela.getLabelParado().setForeground( Color.black );
      
      this.tela.getLabelStatus().setText( "Servidor OFFLine" );
      this.tela.getLabelStatus().setForeground( Color.BLACK );
      
      this.tela.getBtIniciar().setEnabled( true );
   }

   public void formataFechamento(){
      this.tela.getCampoID().setText( "" );
      
      this.tela.getLabelParado().setText( "Servido não iniciado" );
      this.tela.getPnStatus().setBackground( Color.RED );
      this.tela.getLabelParado().setForeground( Color.BLACK );
      
      this.tela.getLabelStatus().setText("Servidor OffLine");
      this.tela.getLabelStatus().setForeground( Color.BLACK );
      this.tela.getConectados().setText("");
      this.tela.getBtIniciar().setEnabled( true );
   }

   public void addLista(){
      this.tela.limpaConn();
      
      for( String conectados : this.tela.getServidor().getLista().listaView() )
         this.tela.Conectados.append( conectados+"\n" );
   }
   
}
