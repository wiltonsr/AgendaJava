
package views;

import models.Evento;

public class TelaCriarEvento extends javax.swing.JFrame {
    private Evento umEvento;
    
    public TelaCriarEvento() {
        initComponents();
        this.labelCampoInvalidoInvisivel();
    }
    
    public TelaCriarEvento(Evento umEvento){
        initComponents();
        this.labelCampoInvalidoInvisivel();
        this.umEvento = umEvento;
        preencherCampos();
    }
    
    private void preencherCampos(){
        jTextFieldNomeEvento.setText(this.umEvento.getNomeEvento());
        
        jDateChooserDataInicio.setDate(this.umEvento.getDataInicio());
        jComboBoxHoraInicio.setSelectedIndex(this.umEvento.getHoraInicio());
        jComboBoxMinInicio.setSelectedIndex(this.umEvento.getMinInicio());
        
        jDateChooserDataFim.setDate(this.umEvento.getDataFim());
        jComboBoxHoraFim.setSelectedIndex(this.umEvento.getHoraFim());
        jComboBoxMinFim.setSelectedIndex(this.umEvento.getMinFim());
        
        jTextFieldLocalEvento.setText(this.umEvento.getLocalEvento());
        jTextAreaDescricao.setText(this.umEvento.getDescricao());
    }
     
    private void limparCampos() {
        jTextFieldNomeEvento.setText(null);
        jTextFieldLocalEvento.setText(null);
        jTextAreaDescricao.setText(null);
        jDateChooserDataInicio.setDate(null);
        jDateChooserDataFim.setDate(null);
    }
    
    private void labelCampoInvalidoInvisivel(){
        jLabelNomeEventoInvalido.setVisible(false);
        jLabelLocalEventoInvalido.setVisible(false);
        jLabelDataslEventoInvalido.setVisible(false);
    }
    
    private boolean validarCampos() {
        boolean todosCamposSaoValidos = true;
        if (jTextFieldNomeEvento.getText().isEmpty()) {
            jLabelNomeEventoInvalido.setVisible(true);
            jTextFieldNomeEvento.requestFocus();
            todosCamposSaoValidos = false;
        }else  jLabelNomeEventoInvalido.setVisible(false);
        if (jTextFieldLocalEvento.getText().isEmpty()) {
            jLabelLocalEventoInvalido.setVisible(true);
            jTextFieldLocalEvento.requestFocus();
            todosCamposSaoValidos = false;
        }else  jLabelLocalEventoInvalido.setVisible(false);
        
        if (jDateChooserDataInicio.getDate()== null || jDateChooserDataFim.getDate() == null){
            jLabelDataslEventoInvalido.setVisible(true);
            todosCamposSaoValidos = false;
        }else jLabelDataslEventoInvalido.setVisible(false);
        
        return (todosCamposSaoValidos);
    }
    
    private void criarEvento(){
        umEvento = new Evento(jTextFieldNomeEvento.getText());
    
        umEvento.setDataInicio(jDateChooserDataInicio.getDate());
        umEvento.setHoraInicio(jComboBoxHoraInicio.getSelectedIndex());
        umEvento.setMinInicio(jComboBoxMinInicio.getSelectedIndex());
        
        umEvento.setDataFim(jDateChooserDataFim.getDate());
        umEvento.setHoraFim(jComboBoxHoraFim.getSelectedIndex());
        umEvento.setMinFim(jComboBoxMinFim.getSelectedIndex());
        
        umEvento.setLocalEvento(jTextFieldLocalEvento.getText());
        umEvento.setDescricao(jTextAreaDescricao.getText());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNomeEvento = new javax.swing.JLabel();
        jTextFieldNomeEvento = new javax.swing.JTextField();
        jLabelDataInicio = new javax.swing.JLabel();
        jLabelDataFim = new javax.swing.JLabel();
        jLabelLocalEvento = new javax.swing.JLabel();
        jTextFieldLocalEvento = new javax.swing.JTextField();
        jButtonOK = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelHorarioInicio = new javax.swing.JLabel();
        jLabelHorarioFim = new javax.swing.JLabel();
        jComboBoxMinInicio = new javax.swing.JComboBox();
        jComboBoxHoraFim = new javax.swing.JComboBox();
        jComboBoxHoraInicio = new javax.swing.JComboBox();
        jComboBoxMinFim = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooserDataInicio = new com.toedter.calendar.JDateChooser();
        jDateChooserDataFim = new com.toedter.calendar.JDateChooser();
        jLabelNomeEventoInvalido = new javax.swing.JLabel();
        jLabelLocalEventoInvalido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelDataslEventoInvalido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNomeEvento.setText("Nome do Evento:");

        jLabelDataInicio.setText("Data de Início:");

        jLabelDataFim.setText("Data de Fim:");

        jLabelLocalEvento.setText("Local do Evento:");

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelHorarioInicio.setText("Horário:");

        jLabelHorarioFim.setText("Horário:");

        jComboBoxMinInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jComboBoxHoraFim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jComboBoxHoraFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHoraFimActionPerformed(evt);
            }
        });

        jComboBoxHoraInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jComboBoxHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHoraInicioActionPerformed(evt);
            }
        });

        jComboBoxMinFim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel1.setText("h");

        jLabel2.setText("h");

        jLabel3.setText("min");

        jLabel4.setText("min");

        jDateChooserDataInicio.setDateFormatString("dd/MM/yyyy");
        jDateChooserDataInicio.setMaxSelectableDate(new java.util.Date(253370858399000L));
        jDateChooserDataInicio.setMinSelectableDate(new java.util.Date(-62135758800000L));

        jDateChooserDataFim.setDateFormatString("dd/MM/yyyy");

        jLabelNomeEventoInvalido.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelNomeEventoInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNomeEventoInvalido.setText("O Nome do Evento deve conter ao menos 1 caractere.");

        jLabelLocalEventoInvalido.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelLocalEventoInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jLabelLocalEventoInvalido.setText("O Local do Evento deve conter ao menos 1 caractere.");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        jLabelDescricao.setText("Descrição:");

        jLabelDataslEventoInvalido.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDataslEventoInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jLabelDataslEventoInvalido.setText("O evento deve ter uma data de inicio e fim.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelDataInicio))
                            .addComponent(jLabelNomeEvento, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(jLabelLocalEvento, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabelDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOK)
                        .addGap(4, 4, 4))
                    .addComponent(jLabelNomeEventoInvalido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldLocalEvento)
                    .addComponent(jTextFieldNomeEvento)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLocalEventoInvalido)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooserDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(jDateChooserDataFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelHorarioInicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxMinInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelHorarioFim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxMinFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelDataslEventoInvalido)
                                .addGap(95, 95, 95)))
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeEvento)
                    .addComponent(jTextFieldNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNomeEventoInvalido)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLocalEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLocalEvento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLocalEventoInvalido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelHorarioInicio)
                                    .addComponent(jComboBoxHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jComboBoxMinInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addComponent(jLabelDataInicio, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jDateChooserDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelHorarioFim)
                                .addComponent(jComboBoxHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jComboBoxMinFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(jDateChooserDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataFim))
                        .addGap(9, 9, 9)
                        .addComponent(jLabelDataslEventoInvalido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCancelar)
                            .addComponent(jButtonOK)))
                    .addComponent(jLabelDescricao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDateChooserDataInicio.getAccessibleContext().setAccessibleDescription("");
        jDateChooserDataFim.getAccessibleContext().setAccessibleName("");
        jDateChooserDataFim.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.limparCampos();
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxHoraFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHoraFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHoraFimActionPerformed

    private void jComboBoxHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHoraInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHoraInicioActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        if(this.validarCampos()){
            this.criarEvento();
            TelaAgenda.controleEvento.adicionar(umEvento);
            this.setVisible(false);
        }  
    }//GEN-LAST:event_jButtonOKActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCriarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCriarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox jComboBoxHoraFim;
    private javax.swing.JComboBox jComboBoxHoraInicio;
    private javax.swing.JComboBox jComboBoxMinFim;
    private javax.swing.JComboBox jComboBoxMinInicio;
    private com.toedter.calendar.JDateChooser jDateChooserDataFim;
    private com.toedter.calendar.JDateChooser jDateChooserDataInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDataFim;
    private javax.swing.JLabel jLabelDataInicio;
    private javax.swing.JLabel jLabelDataslEventoInvalido;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelHorarioFim;
    private javax.swing.JLabel jLabelHorarioInicio;
    private javax.swing.JLabel jLabelLocalEvento;
    private javax.swing.JLabel jLabelLocalEventoInvalido;
    private javax.swing.JLabel jLabelNomeEvento;
    private javax.swing.JLabel jLabelNomeEventoInvalido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldLocalEvento;
    private javax.swing.JTextField jTextFieldNomeEvento;
    // End of variables declaration//GEN-END:variables
}
