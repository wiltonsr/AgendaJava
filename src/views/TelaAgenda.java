package views;

import controllers.ControleEventos;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import models.Evento;

public class TelaAgenda extends javax.swing.JFrame{
    static ControleEventos controleEvento;
    private Evento umEvento;
   
    public TelaAgenda() {
        initComponents();
        controleEvento = new ControleEventos();
        this.umEvento = null;
    }
     
    public void carregarListaEventos() {
        ArrayList<Evento> listaEventosDodia = dataSelecionada();
        DefaultTableModel model = (DefaultTableModel) jTableListaEventos.getModel();
        model.setRowCount(0);
        for (Evento e : listaEventosDodia) {
            model.addRow(new String[]{e.getNomeEvento(), e.getDescricao(), e.getLocalEvento(), e.dataInicioToString(), e.dataFimToString()});
        }
        jTableListaEventos.setModel(model);
    }
    
    public ArrayList<Evento> dataSelecionada(){
        ArrayList<Evento> listaCompleta = controleEvento.getListaEventos();
        ArrayList<Evento> listaEventosDoDia = new ArrayList<Evento>();
        
        String dataSelecionada = new SimpleDateFormat("dd/MM/yyyy").format(jCalendarAgenda.getDate()); 
        
        for (Evento e : listaCompleta){
            if (e.apenasDataInicioToString().equals(dataSelecionada)){
                listaEventosDoDia.add(e);
            }
        }
        if (listaEventosDoDia.isEmpty()){
            return listaCompleta;
        }else return listaEventosDoDia;
    }
    
    private void exibirInformacao(String info) {
        JOptionPane.showMessageDialog(this, info, "Atenção", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void pesquisarEvento(String nome) {
        Evento eventoPesquisado = controleEvento.pesquisar(nome);

        if (eventoPesquisado == null) {
            this.umEvento = null;
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
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

        jCalendarAgenda.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jCalendarAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalendarAgendaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCalendarAgendaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCalendarAgendaMousePressed(evt);
            }
        });
        jCalendarAgenda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCalendarAgendaMouseMoved(evt);
            }
        });
        jCalendarAgenda.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarAgendaPropertyChange(evt);
            }
        });

        jTableListaEventos.setModel(new javax.swing.table.DefaultTableModel
            (null, new String[]{"Nome do Evento","Descrição","Local","Data Inicio","Data Fim"}));
        jTableListaEventos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableListaEventos.setEditingColumn(0);
        jTableListaEventos.setEditingRow(0);
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

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Passe o mouse aqui para atualizar a lista de eventos");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCalendarAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonCriarEvento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditarEvento)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluirEvento))
                    .addComponent(jScrollPaneEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCriarEvento)
                    .addComponent(jButtonEditarEvento)
                    .addComponent(jButtonExcluirEvento)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
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
        if (this.umEvento != null){
            TelaCriarEvento umaTelaModificarEvento = new TelaCriarEvento(this.umEvento);
            umaTelaModificarEvento.setVisible(true);
            controleEvento.remover(umEvento);
        }else exibirInformacao("Selecione um evento");
    }//GEN-LAST:event_jButtonEditarEventoActionPerformed

    private void formHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formHierarchyChanged

    }//GEN-LAST:event_formHierarchyChanged

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        //jTableListaEventos.setEnabled(true);
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButtonExcluirEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirEventoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir o evento?", "Excluir Evento", WIDTH);
        if (resposta == 0){
            controleEvento.remover(this.umEvento);
            carregarListaEventos();
        }
    }//GEN-LAST:event_jButtonExcluirEventoActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        //jTableListaEventos.setEnabled(false);
    }//GEN-LAST:event_formWindowLostFocus

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    }//GEN-LAST:event_formMouseMoved

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
   
    }//GEN-LAST:event_formMousePressed

    private void jCalendarAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendarAgendaMouseClicked

    }//GEN-LAST:event_jCalendarAgendaMouseClicked

    private void jCalendarAgendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendarAgendaMousePressed

    }//GEN-LAST:event_jCalendarAgendaMousePressed

    private void jCalendarAgendaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendarAgendaMouseMoved
    
    }//GEN-LAST:event_jCalendarAgendaMouseMoved

    private void jCalendarAgendaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarAgendaPropertyChange

    }//GEN-LAST:event_jCalendarAgendaPropertyChange

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained

    }//GEN-LAST:event_jLabel1FocusGained

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered

    }//GEN-LAST:event_jLabel1MouseEntered

    private void jCalendarAgendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendarAgendaMouseEntered
        carregarListaEventos();
    }//GEN-LAST:event_jCalendarAgendaMouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        carregarListaEventos();
    }//GEN-LAST:event_jLabel1MouseExited

    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPaneEventos;
    private javax.swing.JTable jTableListaEventos;
    // End of variables declaration//GEN-END:variables

}
