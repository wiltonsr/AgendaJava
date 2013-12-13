package views;

import controllers.ControleEventos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Evento;

public class TelaAgenda extends javax.swing.JFrame {
    static ControleEventos controleEvento;
    private Evento umEvento;
   
    public TelaAgenda() {
        initComponents();
        controleEvento = new ControleEventos();
    }
    
    public void carregarListaEventos() {
        ArrayList<Evento> listaEventos = controleEvento.getListaEventos();
        DefaultTableModel model = (DefaultTableModel) jTableListaEventos.getModel();
        model.setRowCount(0);
        for (Evento e : listaEventos) {
            model.addRow(new String[]{e.getNomeEvento(), e.toString()});
        }
        jTableListaEventos.setModel(model);
    }
    
    private void exibirInformacao(String info) {
        JOptionPane.showMessageDialog(this, info, "Atenção", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void pesquisarEvento(String nome) {
        Evento eventoPesquisado = controleEvento.pesquisar(nome);

        if (eventoPesquisado == null) {
            exibirInformacao("Evento não encontrado.");
        } else {
            this.umEvento = eventoPesquisado;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendarAgenda = new com.toedter.calendar.JCalendar();
        jScrollPaneEventos = new javax.swing.JScrollPane();
        jTableListaEventos = new javax.swing.JTable();
        jButtonCriarEvento = new javax.swing.JButton();
        jButtonEditarEvento = new javax.swing.JButton();
        jButtonExcluirEvento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                formHierarchyChanged(evt);
            }
        });

        jTableListaEventos.setModel(new javax.swing.table.DefaultTableModel(null, new String[]{"Nome Evento","Descrição"}));
        jTableListaEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaEventosMouseClicked(evt);
            }
        });
        jScrollPaneEventos.setViewportView(jTableListaEventos);

        jButtonCriarEvento.setText("Criar Evento");
        jButtonCriarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarEventoActionPerformed(evt);
            }
        });

        jButtonEditarEvento.setText("Editar Evento");
        jButtonEditarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarEventoActionPerformed(evt);
            }
        });

        jButtonExcluirEvento.setText("Excluir Evento");
        jButtonExcluirEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCriarEvento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditarEvento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluirEvento))
                    .addComponent(jScrollPaneEventos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jCalendarAgenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCriarEvento)
                    .addComponent(jButtonEditarEvento)
                    .addComponent(jButtonExcluirEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCriarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarEventoActionPerformed
        TelaCriarEvento novoEvento = new TelaCriarEvento();
        novoEvento.setVisible(true);
    }//GEN-LAST:event_jButtonCriarEventoActionPerformed

    private void jTableListaEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaEventosMouseClicked
        if (jTableListaEventos.isEnabled()) {
            DefaultTableModel model = (DefaultTableModel) jTableListaEventos.getModel();
            String nome = (String) model.getValueAt(jTableListaEventos.getSelectedRow(), 0);
            this.pesquisarEvento(nome);
        }
    }//GEN-LAST:event_jTableListaEventosMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void jButtonEditarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarEventoActionPerformed
        TelaCriarEvento umaTelaModificarEvento = new TelaCriarEvento(this.umEvento);
        umaTelaModificarEvento.setVisible(true);
    }//GEN-LAST:event_jButtonEditarEventoActionPerformed

    private void formHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formHierarchyChanged

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.carregarListaEventos();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButtonExcluirEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirEventoActionPerformed
        controleEvento.remover(this.umEvento);
        carregarListaEventos();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirEventoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCriarEvento;
    private javax.swing.JButton jButtonEditarEvento;
    private javax.swing.JButton jButtonExcluirEvento;
    private com.toedter.calendar.JCalendar jCalendarAgenda;
    private javax.swing.JScrollPane jScrollPaneEventos;
    private javax.swing.JTable jTableListaEventos;
    // End of variables declaration//GEN-END:variables
}
