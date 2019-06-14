package Cliente.view;
import Cliente.Cliente;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 * @author Adston
*/
public class BatePapo extends javax.swing.JFrame {
   private Cliente conectado;
   private String[] lista;
   
   public BatePapo() { initComponents(); 
      this.campoMensagem.requestFocus(); 
      this.getRootPane().setDefaultButton( this.btEnviar );
   }
   
      ArrayList<JCheckBox> conectados;
      
   public void setLista( String[] lista ){
      this.lista = lista;
      this.listaConectados.removeAll();
      this.conectados = new ArrayList();
      
        for ( int i = 0; i < lista.length; i++ ) {
            JCheckBox box = new JCheckBox( lista[i] );
                if( box.getText().equalsIgnoreCase( this.conectado.getNick() ) )
                    box.setEnabled(false);
         
                conectados.add( box );
        }
        
      this.listaConectados.setSize( this.painelFundo.getSize() );
      this.listaConectados.setLayout( new GridLayout(9,1) );
      
      for( int i = 0; i < conectados.size(); i++ )
         this.listaConectados.add( conectados.get(i) );
      
      this.listaConectados.updateUI();
   }

   public void escreveMensagem( String msg ){
       
       this.areaBP.append( msg+"\n" );
   }
   
   
   
    public void setConectado( Cliente conectado ){
         this.conectado = conectado;
    }
   
   
   
   
   
   
   
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      grupoConectados = new javax.swing.ButtonGroup();
      jPanel1 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jPanel3 = new javax.swing.JPanel();
      painelFundo = new javax.swing.JPanel();
      listaConectados = new javax.swing.JPanel();
      jPanel5 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      areaBP = new javax.swing.JTextArea();
      jPanel6 = new javax.swing.JPanel();
      campoMensagem = new javax.swing.JTextField();
      btEnviar = new javax.swing.JButton();
      jLabel2 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setLocationByPlatform(true);
      addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyTyped(java.awt.event.KeyEvent evt) {
            formKeyTyped(evt);
         }
      });

      jPanel1.setBackground(new java.awt.Color(102, 102, 102));
      jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

      jPanel2.setBackground(new java.awt.Color(153, 153, 153));
      jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("BATE PAPO ADS 2018");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      jPanel3.setBackground(new java.awt.Color(153, 153, 153));
      jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      painelFundo.setBackground(new java.awt.Color(235, 235, 235));
      painelFundo.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null), javax.swing.BorderFactory.createTitledBorder(null, "Contatos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Times New Roman", 0, 12)))); // NOI18N
      painelFundo.setLayout(new java.awt.GridLayout(1, 0));

      javax.swing.GroupLayout listaConectadosLayout = new javax.swing.GroupLayout(listaConectados);
      listaConectados.setLayout(listaConectadosLayout);
      listaConectadosLayout.setHorizontalGroup(
         listaConectadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 170, Short.MAX_VALUE)
      );
      listaConectadosLayout.setVerticalGroup(
         listaConectadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      painelFundo.add(listaConectados);

      jPanel5.setBackground(new java.awt.Color(235, 235, 235));
      jPanel5.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null), javax.swing.BorderFactory.createTitledBorder(null, "Troca de Mensagens", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Times New Roman", 0, 12)))); // NOI18N

      areaBP.setEditable(false);
      areaBP.setColumns(20);
      areaBP.setForeground(new java.awt.Color(204, 204, 0));
      areaBP.setRows(5);
      jScrollPane1.setViewportView(areaBP);

      javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
      jPanel5.setLayout(jPanel5Layout);
      jPanel5Layout.setHorizontalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel5Layout.setVerticalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
            .addContainerGap())
      );

      jPanel6.setBackground(new java.awt.Color(235, 235, 235));
      jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

      campoMensagem.setFocusCycleRoot(true);

      btEnviar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
      btEnviar.setMnemonic('E');
      btEnviar.setText("Enviar");
      btEnviar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btEnviarActionPerformed(evt);
         }
      });

      jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
      jLabel2.setText("Mensagem aqui: ");

      javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
      jPanel6.setLayout(jPanel6Layout);
      jPanel6Layout.setHorizontalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel6Layout.createSequentialGroup()
                  .addComponent(campoMensagem)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btEnviar))
               .addGroup(jPanel6Layout.createSequentialGroup()
                  .addComponent(jLabel2)
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );
      jPanel6Layout.setVerticalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(campoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btEnviar))
            .addContainerGap())
      );

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap())
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed

       if( this.campoMensagem.getText().trim().equals("") )
          JOptionPane.showMessageDialog(this, "Não é permitida mensagem em branco", "Mensagem vazia",1);
       else{
            boolean todos = true;
            
            if( this.conectados.size() > 1 ) {
                String listados = ": ";
       
                for( JCheckBox listado : this.conectados )
                    if( listado.isSelected() ){
                       todos = false;
                       listados += listado.getText() + ", ";
                }
       
           if( !todos ){
              this.conectado.enviarMsg( this.msgMontada() );
              this.areaBP.append("Eu enviei para" + listados + "\n" + this.campoMensagem.getText() + "\n");
              this.campoMensagem.setText( "" );
           }else{
               this.conectado.enviarMsg( "mensagem:*:"+this.campoMensagem.getText() );
               this.areaBP.append("Eu enviei para todos:\n" + this.campoMensagem.getText() + "\n");
               this.campoMensagem.setText("");
           }
      }else
         JOptionPane.showMessageDialog(this, "Não existem destinatários disponiveis", "TelaBP", 0);
      
      
       }
   }//GEN-LAST:event_btEnviarActionPerformed

   private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
      // TODO add your handling code here:
   }//GEN-LAST:event_formKeyTyped

   public String msgMontada(){
       String mensagem = "mensagem:";
       
       for( JCheckBox listado : this.conectados ){
           if( listado.isSelected() )
               mensagem += listado.getText() + ";";
     
       }   
       mensagem += ":" + this.campoMensagem.getText();
       
       return mensagem;
   }
   
   
   
   public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(BatePapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(BatePapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(BatePapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(BatePapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new BatePapo().setVisible(true);
         }
      });
   }

    public Cliente getConectado() {
        return conectado;
    }

    public String[] getLista() {
        return lista;
    }

    public JTextArea getAreaBP() {
        return areaBP;
    }

    public JButton getBtEnviar() {
        return btEnviar;
    }

    public JTextField getCampoMensagem() {
        return campoMensagem;
    }

    public ButtonGroup getGrupoConectados() {
        return grupoConectados;
    }

    public JPanel getListaConectados() {
        return listaConectados;
    }

    public JPanel getPainelFundo() {
        return painelFundo;
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTextArea areaBP;
   private javax.swing.JButton btEnviar;
   private javax.swing.JTextField campoMensagem;
   private javax.swing.ButtonGroup grupoConectados;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel5;
   private javax.swing.JPanel jPanel6;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JPanel listaConectados;
   private javax.swing.JPanel painelFundo;
   // End of variables declaration//GEN-END:variables



}
