// Victor Dos Santos Araujo, 2475553

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ghxstyzim
 */
public class FormFuncionario extends javax.swing.JFrame {
    private BDFuncionario comandos = BDFuncionario.getInstanciaComandoHome();
    //Metodo Singleton 
    private static FormFuncionario UnicFunc;

    public static FormFuncionario geraFunc() {
        if (UnicFunc == null) {
            UnicFunc = new FormFuncionario();
        }
        return UnicFunc;
    }

    public FormFuncionario() {
        initComponents();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text_SubtTitlle1 = new javax.swing.JLabel();
        textCPF = new javax.swing.JTextField();
        Text_SubTitlle2 = new javax.swing.JLabel();
        textSalario = new javax.swing.JTextField();
        Text_Titlle = new javax.swing.JLabel();
        Text_SubtTitlle = new javax.swing.JLabel();
        textNome2 = new javax.swing.JTextField();
        Text_SubTitlle = new javax.swing.JLabel();
        textIdade = new javax.swing.JTextField();
        BtVoltar = new javax.swing.JButton();
        BtCadastrar = new javax.swing.JButton();
        BtTabelaClt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Text_SubtTitlle1.setText("Idade:");

        textCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCPFActionPerformed(evt);
            }
        });

        Text_SubTitlle2.setText("Salário:");

        Text_Titlle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text_Titlle.setText("Preencha os Campos Abaixo:");

        Text_SubtTitlle.setText("Nome:");

        textNome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNome2ActionPerformed(evt);
            }
        });

        Text_SubTitlle.setText("CPF:");

        textIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdadeActionPerformed(evt);
            }
        });

        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });

        BtCadastrar.setText("Cadastrar");
        BtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastrarActionPerformed(evt);
            }
        });

        BtTabelaClt.setText("Tabela de Funcionarios");
        BtTabelaClt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTabelaCltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Text_Titlle, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Text_SubTitlle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_SubtTitlle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_SubtTitlle1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_SubTitlle2)
                            .addComponent(textNome2)
                            .addComponent(textCPF)
                            .addComponent(textIdade)
                            .addComponent(textSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addComponent(BtCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtVoltar))
                            .addComponent(BtTabelaClt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_Titlle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_SubtTitlle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_SubTitlle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Text_SubtTitlle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtTabelaClt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Text_SubTitlle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtVoltar)
                    .addComponent(BtCadastrar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCPFActionPerformed

    private void textNome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNome2ActionPerformed

    private void textIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdadeActionPerformed

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        voltarHome();
    }//GEN-LAST:event_BtVoltarActionPerformed

    private void BtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastrarActionPerformed
    
    try {
        registrarFuncionario();
        int ret = JOptionPane.showConfirmDialog(
        null,
        "Funcionario CLT Registrado! Deseja cadastrar mais?",
        "Cadastro bem sucedido",
        JOptionPane.YES_NO_OPTION
    );
    if(ret == 0){
        limpar();
    } else {
            limpar();
            dispose();
    }
    } catch (CpfInvalidoException | IdadeInvalidoException | SalarioInvalidoException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Cadastro", JOptionPane.ERROR_MESSAGE);
    }   

    }//GEN-LAST:event_BtCadastrarActionPerformed

    private void BtTabelaCltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTabelaCltActionPerformed
        mostrarClt();
    }//GEN-LAST:event_BtTabelaCltActionPerformed
    
    public void limpar(){
        textNome2.setText("");
        textCPF.setText("");
        textSalario.setText("");
        textIdade.setText("");
    }
    
    public void mostrarClt(){
        FormTabFuncClt.geraTabClt().setVisible(true);
    }
    
    public void registrarFuncionario() throws CpfInvalidoException, IdadeInvalidoException,SalarioInvalidoException{

        Funcionario funcionario = new Funcionario();
        // Coleta os dados do funcionário
        funcionario.setNome(textNome2.getText());  
        String cpfStr = textCPF.getText();
        int cpf = Integer.parseInt(cpfStr);
        if (cpf < 0) {
            throw new CpfInvalidoException("CPF não pode ser negativo");
        }
        funcionario.setCpf(cpf);

        int idade = Integer.parseInt(textIdade.getText());  
        
        if (idade <= 0) {
            throw new IdadeInvalidoException("Idade inválida");
        }
        funcionario.setIdade(idade);  
    
        int salario = Integer.parseInt(textSalario.getText());
        
        if (salario < 0 ){
            throw new SalarioInvalidoException("Salario Invalido");
        }
        funcionario.setSalario(salario);
                
        comandos.registrarFuncionario(funcionario);  // Registra o funcionário no sistema
        
    }



     public void voltarHome(){
        int ret = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente voltar ao menu principal?",
                "Saida",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        if(ret == 0){
            dispose();
        }
    }
     
    /**
     * @param args the command line arguments
*   */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCadastrar;
    private javax.swing.JButton BtTabelaClt;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JLabel Text_SubTitlle;
    private javax.swing.JLabel Text_SubTitlle2;
    private javax.swing.JLabel Text_SubtTitlle;
    private javax.swing.JLabel Text_SubtTitlle1;
    private javax.swing.JLabel Text_Titlle;
    private javax.swing.JTextField textCPF;
    private javax.swing.JTextField textIdade;
    private javax.swing.JTextField textNome2;
    private javax.swing.JTextField textSalario;
    // End of variables declaration//GEN-END:variables
}
