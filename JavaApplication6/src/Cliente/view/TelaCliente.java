package Cliente.view;

import Cliente.Cliente;
import Cliente.view.historico.MainHist;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaCliente extends javax.swing.JFrame {
   private Cliente cliente;
   private MainHist h;
   private BatePapo bp;
   
   public TelaCliente() {
      this.h = new MainHist();
      initComponents();
      this.montarIPs();
   }

   public final void montarIPs(){
      for( String each : h.getLer().getConteudo() )
         this.listCombo.addItem(each);
      
      this.listCombo.setSelectedIndex(0);
   }   
   
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jPanel3 = new javax.swing.JPanel();
      jPanel4 = new javax.swing.JPanel();
      jPanel7 = new javax.swing.JPanel();
      jLabel3 = new javax.swing.JLabel();
      campoPorta = new javax.swing.JTextField();
      jPanel5 = new javax.swing.JPanel();
      jPanel6 = new javax.swing.JPanel();
      campoDestino = new javax.swing.JTextField();
      btConectar = new javax.swing.JButton();
      listCombo = new javax.swing.JComboBox<>();
      btConLista = new javax.swing.JButton();
      jLabel5 = new javax.swing.JLabel();
      btCancelar = new javax.swing.JButton();
      jPanel2 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Conexao Inicial");
      setLocationByPlatform(true);

      jPanel1.setBackground(new java.awt.Color(102, 102, 102));
      jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), null, null, java.awt.Color.darkGray));

      jPanel3.setBackground(new java.awt.Color(122, 122, 122));
      jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      jPanel3.setToolTipText("");

      jPanel4.setBackground(new java.awt.Color(153, 153, 153));
      jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jPanel7.setBackground(new java.awt.Color(235, 235, 235));
      jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.black));

      jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
      jLabel3.setText("Porta:");

      campoPorta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
      campoPorta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      campoPorta.setText("6666");
      campoPorta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, null, null, java.awt.Color.darkGray));
      campoPorta.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            campoPortaActionPerformed(evt);
         }
      });
      campoPorta.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyTyped(java.awt.event.KeyEvent evt) {
            campoPortaKeyTyped(evt);
         }
      });

      javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
      jPanel7.setLayout(jPanel7Layout);
      jPanel7Layout.setHorizontalGroup(
         jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(campoPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel7Layout.setVerticalGroup(
         jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel3)
               .addComponent(campoPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jPanel5.setBackground(new java.awt.Color(153, 153, 153));
      jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jPanel6.setBackground(new java.awt.Color(235, 235, 235));
      jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      campoDestino.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
      campoDestino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      campoDestino.setText("192.168.0.220");
      campoDestino.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, null, null, java.awt.Color.darkGray));
      campoDestino.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyTyped(java.awt.event.KeyEvent evt) {
            campoDestinoKeyTyped(evt);
         }
      });

      btConectar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
      btConectar.setText("Conectar");
      btConectar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btConectarActionPerformed(evt);
         }
      });

      listCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      listCombo.setToolTipText("Salvos");
      listCombo.setAutoscrolls(true);
      listCombo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
      listCombo.setLightWeightPopupEnabled(false);
      listCombo.setNextFocusableComponent(btConLista);

      btConLista.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
      btConLista.setText("Conectar");
      btConLista.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btConListaActionPerformed(evt);
         }
      });

      jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
      jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel5.setText("IP Servidor:");

      btCancelar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
      btCancelar.setText("Cancelar");
      btCancelar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btCancelarActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
      jPanel6.setLayout(jPanel6Layout);
      jPanel6Layout.setHorizontalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(jPanel6Layout.createSequentialGroup()
                  .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(campoDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                     .addComponent(listCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(btConLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(btConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap())
      );
      jPanel6Layout.setVerticalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btConectar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(campoDestino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(listCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btConLista, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
      jPanel5.setLayout(jPanel5Layout);
      jPanel5Layout.setHorizontalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel5Layout.setVerticalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jPanel2.setBackground(new java.awt.Color(153, 153, 153));
      jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel1.setBackground(new java.awt.Color(255, 255, 255));
      jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("Conectar Servidor");
      jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
      );

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
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

public BatePapo getBP(){ return this.bp; }

   private void btConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConectarActionPerformed
      this.conectar( this.campoDestino.getText() );
   }//GEN-LAST:event_btConectarActionPerformed

   public void conectar( String destino ){
      //if( this.cliente == null ){
         
      this.cliente = new Cliente( destino, Integer.valueOf( this.campoPorta.getText() ) );
         
      if( this.cliente.conectaServidor() ){
            if( this.validaNick() ){
               this.cliente.setNick( this.nick );
               this.cliente.setTela( this );
               
               if( this.cliente.iniciaCliente() ){
                     this.h.getLer().getEscrita().IP = destino;
                        try {
                           this.h.getLer().getEscrita().addEnd();
                        } catch (IOException ex) {
                           JOptionPane.showMessageDialog( this, ex, "Erro ao escrever historicos --- 0 ",1 );
                           this.dispose();
                        }
                this.cliente.getFuncoes().solicitaLogin( nick );
               }else
                  this.abreNovo( "Erro Inicializar Cliente", "FuncConectar() --- 0" );
               
            }else
               this.abreNovo( "Login Não Realizado", "Login" );
            
         }else{
            this.abreNovo("Servidor Não Localizado", "Verificar dados Servidor");
            
         }
      //}
   }
   public void abreNovo( String erro, String local ){
      JOptionPane.showMessageDialog( this, erro, local, 0);
         new TelaCliente().setVisible(true);
            this.dispose();
   }
   
      public boolean abrirBP( ){
        this.bp = new BatePapo();
           this.bp.setConectado( this.cliente );
           this.bp.setTitle( this.cliente.getNick() + "conectado em: " + this.cliente.getConexao().getInetAddress());
           this.bp.setVisible( true );
        this.dispose();   
        return true;  
      }
   
   String nick = "";
   public boolean validaNick(){
      int i = 3;
      
         while( nick.trim().equals("") && i > 0){
            this.nick = JOptionPane.showInputDialog( this, "Insira um nick valido","LOGIN: Tentativas " + i, 1 );
               
               if( nick == null ){
                  nick = ""; 
                return false;
               }
                  i--;
                     if( i == 0 ) 
                        return false;
         }
            
   return true;
   }

   private void campoPortaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPortaKeyTyped
      if( evt.getKeyChar() < 47 && evt.getKeyChar() > 56 )
         evt.consume();
      
      if( this.campoPorta.getText().length() > 4 )
         evt.consume();
      
      
   }//GEN-LAST:event_campoPortaKeyTyped

   private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
         System.exit(0);
   }//GEN-LAST:event_btCancelarActionPerformed

   private void btConListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConListaActionPerformed
      this.conectar( this.listCombo.getSelectedItem().toString() );
   }//GEN-LAST:event_btConListaActionPerformed

    private void campoDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDestinoKeyTyped
        if( this.campoDestino.getText().length() >= 15 )
            evt.consume();
    }//GEN-LAST:event_campoDestinoKeyTyped

   private void campoPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPortaActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_campoPortaActionPerformed
   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Metal".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new TelaCliente().setVisible(true);
         }
      });
   }

   public Cliente getCliente() {
      return cliente;
   }

   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }

   public String getNick() {
      return nick;
   }

   public void setNick(String nick) {
      this.nick = nick;
   }

   public JButton getBtCancelar() {
      return btCancelar;
   }

   public void setBtCancelar(JButton btCancelar) {
      this.btCancelar = btCancelar;
   }

   public JButton getBtConectar() {
      return btConectar;
   }

   public void setBtConectar(JButton btConectar) {
      this.btConectar = btConectar;
   }

   public JTextField getCampoDestino() {
      return campoDestino;
   }

   public void setCampoDestino(JTextField campoDestino) {
      this.campoDestino = campoDestino;
   }

   public JTextField getCampoPorta() {
      return campoPorta;
   }

   public void setCampoPorta(JTextField campoPorta) {
      this.campoPorta = campoPorta;
   }
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btCancelar;
   private javax.swing.JButton btConLista;
   private javax.swing.JButton btConectar;
   private javax.swing.JTextField campoDestino;
   private javax.swing.JTextField campoPorta;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JPanel jPanel5;
   private javax.swing.JPanel jPanel6;
   private javax.swing.JPanel jPanel7;
   private javax.swing.JComboBox<String> listCombo;
   // End of variables declaration//GEN-END:variables
}
