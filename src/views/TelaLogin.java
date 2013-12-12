package views;

import controllers.ControleUsuarios;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import models.Usuario;
import models.Data;

public class TelaLogin extends javax.swing.JFrame {

    private static ControleUsuarios controleUsuarios;
    private Usuario umUsuario;
    private Usuario novoUsuario;

    public TelaLogin() {
        initComponents();
        TelaLogin.controleUsuarios = new ControleUsuarios();
        this.labelCampoInvalidoInvisivel();
    }

    private void limparCampos() {
        jTextFieldCriarUsuario.setText(null);
        jTextFieldUsuario.setText(null);
        jTextFieldCriarEmail.setText(null);
        jTextFieldCriarNome.setText(null);
        jPasswordFieldCriarSenha.setText(null);
        jPasswordSenha.setText(null);
        jComboBoxCriarDiaNascimento.setSelectedIndex(0);
        jComboBoxCriarMesNascimento.setSelectedIndex(0);
        jComboBoxCriarAnoNascimento.setSelectedIndex(0);
        buttonGroupCriarSexo.clearSelection();
    }

    private void labelCampoInvalidoInvisivel(){
        jLabelCriarEmaiIInvalido.setVisible(false);
        jLabelCriarNomeInvalido.setVisible(false);
        jLabelCriarSenhaInvalido.setVisible(false);
        jLabelCriarSexoInvalido.setVisible(false);
        jLabelCriarUsuarioInvalido.setVisible(false);
        jLabelCriarAniversarioInvalido.setVisible(false);
        jLabelConfirmarSenhaInvalido.setVisible(false);
    }
    
    public boolean validarFormatacaoEmail(String email) {
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"); 
        Matcher m = p.matcher(email); 
        return m.find();  
    }
    
    private boolean validarCampos() {
        boolean todosCamposSaoValidos = true;
        if (jTextFieldCriarUsuario.getText().length() < 5 || jTextFieldCriarUsuario.getText().length() > 32) {
            jLabelCriarUsuarioInvalido.setVisible(true);
            todosCamposSaoValidos = false;
        }else  jLabelCriarUsuarioInvalido.setVisible(false);
        if (jPasswordFieldCriarSenha.getPassword().length < 8 || jPasswordFieldCriarSenha.getPassword().length > 32) {
            jLabelCriarSenhaInvalido.setVisible(true);
            todosCamposSaoValidos = false;
        }else jLabelCriarSenhaInvalido.setVisible(false);
        if (Arrays.equals(jPasswordFieldCriarSenha.getPassword(),(jPasswordFieldConfirmarSenha.getPassword()))){
            jLabelConfirmarSenhaInvalido.setVisible(false);        
        }else{
            jLabelConfirmarSenhaInvalido.setVisible(true);
            todosCamposSaoValidos = false;
        }
        if (jTextFieldCriarNome.getText().isEmpty()) {
            jLabelCriarNomeInvalido.setVisible(true);
            todosCamposSaoValidos = false;
        }else jLabelCriarNomeInvalido.setVisible(false);
        if(buttonGroupCriarSexo.isSelected(null)){
            jLabelCriarSexoInvalido.setVisible(true);
            todosCamposSaoValidos = false;
        }else jLabelCriarSexoInvalido.setVisible(false); 
        if(jComboBoxCriarDiaNascimento.getSelectedIndex() == 0
                || jComboBoxCriarMesNascimento.getSelectedIndex() == 0
                || jComboBoxCriarAnoNascimento.getSelectedIndex() == 0) {
            jLabelCriarAniversarioInvalido.setVisible(true); 
            todosCamposSaoValidos = false;  
        }else jLabelCriarAniversarioInvalido.setVisible(false);    
        if(validarFormatacaoEmail(jTextFieldCriarEmail.getText())){
            jLabelCriarEmaiIInvalido.setVisible(false);
        }else{
            jLabelCriarEmaiIInvalido.setVisible(true);
            todosCamposSaoValidos = false;
        }
        return (todosCamposSaoValidos);
    }
    
    private void criarConta() {
        novoUsuario = new Usuario(jTextFieldCriarUsuario.getText());

        novoUsuario.setEmail(jTextFieldCriarEmail.getText());
        novoUsuario.setSenha(jPasswordFieldCriarSenha.getPassword());
        novoUsuario.setNome(jTextFieldCriarNome.getText());

        int umDia = Integer.parseInt(jComboBoxCriarDiaNascimento.getSelectedItem().toString());
        int umMes = jComboBoxCriarMesNascimento.getSelectedIndex();
        int umAno = Integer.parseInt(jComboBoxCriarAnoNascimento.getSelectedItem().toString());
        Data umaData = new Data(umDia, umMes, umAno);
        novoUsuario.setDataNascimento(umaData);

        if (jRadioButtonCriarSexoF.equals(buttonGroupCriarSexo.getSelection())) {
            novoUsuario.setSexo('f');
        } else {
            novoUsuario.setSexo('m');
        }

        controleUsuarios.adicionar(novoUsuario);
    }

    private boolean validarAcesso() {
        if (controleUsuarios.pesquisar(jTextFieldUsuario.getText()) == null) {
            return false;
        } else {
            umUsuario = controleUsuarios.pesquisar(jTextFieldUsuario.getText());
            return Arrays.equals(umUsuario.getSenha(), jPasswordSenha.getPassword());
        }
    }

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
        jLabelTitulo1 = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jButtonCriarConta = new javax.swing.JButton();
        jLabelCriarUsuarioInvalido = new javax.swing.JLabel();
        jLabelCriarEmaiIInvalido = new javax.swing.JLabel();
        jLabelCriarNomeInvalido = new javax.swing.JLabel();
        jLabelCriarSenhaInvalido = new javax.swing.JLabel();
        jLabelCriarSexoInvalido = new javax.swing.JLabel();
        jLabelCriarAniversarioInvalido = new javax.swing.JLabel();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jLabelConfirmarSenhaInvalido = new javax.swing.JLabel();
        jLabelConfirmarSenha = new javax.swing.JLabel();

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
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldCriarEmailInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
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

        jLabelTitulo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo1.setText("Não tem uma Conta?");

        jLabelTitulo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo2.setText("Já tem uma Conta?");

        jButtonCriarConta.setText("Criar Conta");
        jButtonCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarContaActionPerformed(evt);
            }
        });

        jLabelCriarUsuarioInvalido.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabelCriarUsuarioInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCriarUsuarioInvalido.setText("O nome de usuáriio deve ter entre 8 e 32 caracteres.");

        jLabelCriarEmaiIInvalido.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabelCriarEmaiIInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCriarEmaiIInvalido.setText("Digite um email válido");

        jLabelCriarNomeInvalido.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabelCriarNomeInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCriarNomeInvalido.setText("Preencha o campo nome.");

        jLabelCriarSenhaInvalido.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabelCriarSenhaInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCriarSenhaInvalido.setText("A senha deve ter entre 8 e 32 caracteres.");

        jLabelCriarSexoInvalido.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabelCriarSexoInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCriarSexoInvalido.setText("Selecione seu sexo.");

        jLabelCriarAniversarioInvalido.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabelCriarAniversarioInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCriarAniversarioInvalido.setText("Selecione o dia, mês e ano do seu nascimento.");

        jLabelConfirmarSenhaInvalido.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabelConfirmarSenhaInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jLabelConfirmarSenhaInvalido.setText("As senhas não coincidem.");

        jLabelConfirmarSenha.setText("Confirmar senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonCriarConta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelCriarEmaiIInvalido)
                                        .addComponent(jLabelCriarUsuarioInvalido)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jRadioButtonCriarSexoF)
                                            .addGap(29, 29, 29)
                                            .addComponent(jRadioButtonCriarSexoM)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabelCriarSexoInvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextFieldCriarEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                                .addComponent(jPasswordFieldCriarSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextFieldCriarUsuario)
                                                .addComponent(jLabelTitulo1)
                                                .addComponent(jTextFieldCriarNome))
                                            .addComponent(jLabelCriarSenhaInvalido, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelConfirmarSenhaInvalido, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelCriarNomeInvalido, javax.swing.GroupLayout.Alignment.LEADING)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxCriarDiaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCriarMesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCriarAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCriarAniversarioInvalido)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelConfirmarSenha)
                        .addGap(141, 141, 141)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordSenha)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabelTitulo2)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo1)
                    .addComponent(jLabelTitulo2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCriarUsuario)
                            .addComponent(jTextFieldCriarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCriarUsuarioInvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCriarSenha)
                            .addComponent(jPasswordFieldCriarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCriarSenhaInvalido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelConfirmarSenha)
                            .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelConfirmarSenhaInvalido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCriarEmail)
                            .addComponent(jTextFieldCriarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCriarEmaiIInvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCriarNomeInvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonCriarSexoF)
                            .addComponent(jRadioButtonCriarSexoM)
                            .addComponent(jLabelCriarSexoInvalido))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCriarSexo)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCriarDataNasc)
                    .addComponent(jComboBoxCriarDiaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCriarMesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCriarAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCriarAniversarioInvalido)
                .addGap(18, 18, 18)
                .addComponent(jButtonCriarConta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.validarAcesso()) {
            TelaAgenda umaTelaAgenda = new TelaAgenda();
            umaTelaAgenda.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha inexistente.");
            this.limparCampos();
        }
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

    private void jButtonCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarContaActionPerformed
        if (this.validarCampos()){
            this.criarConta();
            this.limparCampos();
            JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!");
        }
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
    private javax.swing.JLabel jLabelConfirmarSenha;
    private javax.swing.JLabel jLabelConfirmarSenhaInvalido;
    private javax.swing.JLabel jLabelCriarAniversarioInvalido;
    private javax.swing.JLabel jLabelCriarDataNasc;
    private javax.swing.JLabel jLabelCriarEmaiIInvalido;
    private javax.swing.JLabel jLabelCriarEmail;
    private javax.swing.JLabel jLabelCriarNome;
    private javax.swing.JLabel jLabelCriarNomeInvalido;
    private javax.swing.JLabel jLabelCriarSenha;
    private javax.swing.JLabel jLabelCriarSenhaInvalido;
    private javax.swing.JLabel jLabelCriarSexo;
    private javax.swing.JLabel jLabelCriarSexoInvalido;
    private javax.swing.JLabel jLabelCriarUsuario;
    private javax.swing.JLabel jLabelCriarUsuarioInvalido;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldCriarSenha;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JRadioButton jRadioButtonCriarSexoF;
    private javax.swing.JRadioButton jRadioButtonCriarSexoM;
    private javax.swing.JTextField jTextFieldCriarEmail;
    private javax.swing.JTextField jTextFieldCriarNome;
    private javax.swing.JTextField jTextFieldCriarUsuario;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
