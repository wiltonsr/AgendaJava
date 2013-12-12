package views;

import controllers.ControleUsuarios;
import javax.swing.JOptionPane;
import models.Usuario;
import models.Data;

public class TelaLogin extends javax.swing.JFrame {

    private static ControleUsuarios controleUsuarios;
    private Usuario umUsuario;
    private Usuario novoUsuario;

    public TelaLogin() {
        initComponents();
        this.controleUsuarios = new ControleUsuarios();
    }

    private void limparCampos(){
        jTextFieldCriarUsuario.setText(null);
        jTextFieldUsuario.setText(null);
        jTextFieldCriarEmail.setText(null);
        jTextFieldCriarNome.setText(null);
        jPasswordFieldCriarSenha.setText(null);
        jPasswordSenha.setText(null);
        jTextFieldCriarTelefone.setText(null);
        jComboBoxCriarDiaNascimento.setSelectedIndex(0);
        jComboBoxCriarMesNascimento.setSelectedIndex(0);
        jComboBoxCriarAnoNascimento.setSelectedIndex(0);
        buttonGroupCriarSexo.clearSelection(); 
    }
    
    private boolean validarCampos() {
        //TODO
        return true;
    }

    private void criarUsuario() {
        novoUsuario = new Usuario(jTextFieldCriarUsuario.getText());
        
        novoUsuario.setEmail(jTextFieldCriarEmail.getText());
        novoUsuario.setSenha(jPasswordFieldCriarSenha.getPassword());
        novoUsuario.setNome(jTextFieldCriarNome.getText());
        novoUsuario.setTelefone(jTextFieldCriarTelefone.getText());
        
        int umDia = Integer.parseInt(jComboBoxCriarDiaNascimento.getSelectedItem().toString());
        int umMes = jComboBoxCriarMesNascimento.getSelectedIndex();
        int umAno = Integer.parseInt(jComboBoxCriarAnoNascimento.getSelectedItem().toString());
        Data umaData = new Data(umDia, umMes, umAno);
        novoUsuario.setDataNascimento(umaData);
        
        if (jRadioButtonCriarSexoF.equals(buttonGroupCriarSexo.getSelection())){
            novoUsuario.setSexo('f');
        }else{
            novoUsuario.setSexo('m');
        }
        
        controleUsuarios.adicionar(novoUsuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCriarSexo = new javax.swing.ButtonGroup();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordSenha = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelCriarUsuario = new javax.swing.JLabel();
        jTextFieldCriarUsuario = new javax.swing.JTextField();
        jLabelCriarSenha = new javax.swing.JLabel();
        jPasswordFieldCriarSenha = new javax.swing.JPasswordField();
        jLabelCriarNome = new javax.swing.JLabel();
        jTextFieldCriarNome = new javax.swing.JTextField();
        jLabelCriarSexo = new javax.swing.JLabel();
        jTextFieldCriarEmail = new javax.swing.JTextField();
        jLabelCriarEmail = new javax.swing.JLabel();
        jRadioButtonCriarSexoF = new javax.swing.JRadioButton();
        jRadioButtonCriarSexoM = new javax.swing.JRadioButton();
        jLabelCriarDataNasc = new javax.swing.JLabel();
        jComboBoxCriarDiaNascimento = new javax.swing.JComboBox();
        jComboBoxCriarMesNascimento = new javax.swing.JComboBox();
        jComboBoxCriarAnoNascimento = new javax.swing.JComboBox();
        jLabelCriarTelefone = new javax.swing.JLabel();
        jTextFieldCriarTelefone = new javax.swing.JTextField();
        jLabelTitulo1 = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jButtonCriarConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelUsuario.setText("Usuario:");

        jLabelSenha.setText("Senha:");

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        jButton1.setText("Fazer Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelCriarUsuario.setText("Usuario:");

        jTextFieldCriarUsuario.setToolTipText(""); // NOI18N
        jTextFieldCriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCriarUsuarioActionPerformed(evt);
            }
        });

        jLabelCriarSenha.setText("Senha:");

        jLabelCriarNome.setText("Nome:");

        jTextFieldCriarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCriarNomeActionPerformed(evt);
            }
        });

        jLabelCriarSexo.setText("Sexo:");

        jTextFieldCriarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCriarEmailActionPerformed(evt);
            }
        });
        jTextFieldCriarEmail.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldCriarEmailInputMethodTextChanged(evt);
            }
        });

        jLabelCriarEmail.setText("Email:");

        buttonGroupCriarSexo.add(jRadioButtonCriarSexoF);
        jRadioButtonCriarSexoF.setText("Feminino");
        jRadioButtonCriarSexoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCriarSexoFActionPerformed(evt);
            }
        });

        buttonGroupCriarSexo.add(jRadioButtonCriarSexoM);
        jRadioButtonCriarSexoM.setText("Masculino");

        jLabelCriarDataNasc.setText("Data de nascimento:");

        jComboBoxCriarDiaNascimento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBoxCriarMesNascimento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        jComboBoxCriarAnoNascimento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ano", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900", "1899", "1898", "1897", "1896", "1895", "1894", "1893", "1892", "1891", "1890", "1889", "1888", "1887", "1886", "1885", "1884", "1883", "1882", "1881", "1880", "1879", "1878", "1877", "1876", "1875", "1874", "1873", "1872", "1871", "1870", "1869", "1868", "1867", "1866", "1865", "1864", "1863", "1862", "1861", "1860", "1859", "1858", "1857", "1856", "1855", "1854", "1853", "1852", "1851", "1850" }));

        jLabelCriarTelefone.setText("Telefone:");

        jTextFieldCriarTelefone.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldCriarTelefoneInputMethodTextChanged(evt);
            }
        });

        jLabelTitulo1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabelTitulo1.setText("Não tem uma Conta?");

        jLabelTitulo2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabelTitulo2.setText("Já tem uma Conta?");

        jButtonCriarConta.setText("Criar Conta");
        jButtonCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarContaActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCriarUsuario)
                            .addComponent(jLabelCriarSenha)
                            .addComponent(jLabelCriarEmail)
                            .addComponent(jLabelCriarSexo)
                            .addComponent(jLabelCriarNome)
                            .addComponent(jLabelCriarDataNasc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxCriarDiaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCriarMesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCriarAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(342, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonCriarConta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCriarTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldCriarEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                            .addComponent(jPasswordFieldCriarSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextFieldCriarUsuario)
                                            .addComponent(jTextFieldCriarNome, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButtonCriarSexoF)
                                                .addGap(29, 29, 29)
                                                .addComponent(jRadioButtonCriarSexoM))
                                            .addComponent(jLabelTitulo1))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelSenha))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPasswordSenha)
                                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelTitulo2))
                                .addGap(53, 53, 53))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCriarTelefone)
                        .addGap(0, 678, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo1)
                    .addComponent(jLabelTitulo2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCriarUsuario)
                            .addComponent(jTextFieldCriarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCriarSenha)
                            .addComponent(jPasswordFieldCriarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCriarEmail)
                            .addComponent(jTextFieldCriarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCriarNome)
                            .addComponent(jTextFieldCriarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUsuario)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSenha)
                            .addComponent(jPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonCriarSexoF)
                            .addComponent(jRadioButtonCriarSexoM))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCriarSexo)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCriarDataNasc)
                    .addComponent(jComboBoxCriarDiaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCriarMesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCriarAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCriarTelefone)
                    .addComponent(jTextFieldCriarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonCriarConta)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTextFieldCriarUsuario.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldCriarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCriarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCriarNomeActionPerformed

    private void jTextFieldCriarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCriarEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCriarEmailActionPerformed

    private void jRadioButtonCriarSexoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCriarSexoFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCriarSexoFActionPerformed

    private void jTextFieldCriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCriarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCriarUsuarioActionPerformed

private void jTextFieldCriarEmailInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldCriarEmailInputMethodTextChanged
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldCriarEmailInputMethodTextChanged

private void jTextFieldCriarTelefoneInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldCriarTelefoneInputMethodTextChanged
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldCriarTelefoneInputMethodTextChanged

    private void jButtonCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarContaActionPerformed
        this.criarUsuario();
        this.limparCampos();
        JOptionPane.showMessageDialog(null, "Usuario criado com sucesso!");
    }//GEN-LAST:event_jButtonCriarContaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupCriarSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCriarConta;
    private javax.swing.JComboBox jComboBoxCriarAnoNascimento;
    private javax.swing.JComboBox jComboBoxCriarDiaNascimento;
    private javax.swing.JComboBox jComboBoxCriarMesNascimento;
    private javax.swing.JLabel jLabelCriarDataNasc;
    private javax.swing.JLabel jLabelCriarEmail;
    private javax.swing.JLabel jLabelCriarNome;
    private javax.swing.JLabel jLabelCriarSenha;
    private javax.swing.JLabel jLabelCriarSexo;
    private javax.swing.JLabel jLabelCriarTelefone;
    private javax.swing.JLabel jLabelCriarUsuario;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldCriarSenha;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JRadioButton jRadioButtonCriarSexoF;
    private javax.swing.JRadioButton jRadioButtonCriarSexoM;
    private javax.swing.JTextField jTextFieldCriarEmail;
    private javax.swing.JTextField jTextFieldCriarNome;
    private javax.swing.JTextField jTextFieldCriarTelefone;
    private javax.swing.JTextField jTextFieldCriarUsuario;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
