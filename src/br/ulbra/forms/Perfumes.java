/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.forms;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class Perfumes extends javax.swing.JFrame {

    /**
     * Creates new form Perfumes
     */
    public Perfumes() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        edLista = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btListar = new javax.swing.JButton();
        btOrdenar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("SISTEMA GERENCIADOR DE COMPRAS - SGC");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(null);
        jLabel2.setText("NOME DO PERFUME");

        edNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        edNome.setForeground(null);

        btSalvar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btSalvar.setForeground(null);
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(null);

        edLista.setColumns(20);
        edLista.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        edLista.setForeground(new java.awt.Color(255, 153, 0));
        edLista.setRows(5);
        jScrollPane1.setViewportView(edLista);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(null);
        jLabel4.setText("LISTAGEM DE COMPRAS CADASTRADAS");

        btListar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btListar.setForeground(null);
        btListar.setText("LISTAR");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        btOrdenar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btOrdenar.setForeground(null);
        btOrdenar.setText("ORDENAR");
        btOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btExcluir.setForeground(null);
        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btLimpar.setForeground(null);
        btLimpar.setText("ELIMINAR LISTA");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btEditar.setForeground(null);
        btEditar.setText("EDITAR");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btEditar)
                                .addGap(28, 28, 28)
                                .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btOrdenar)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGap(0, 78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btEditar)
                    .addComponent(btListar)
                    .addComponent(btOrdenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpar)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //declaração do ArrayList
    ArrayList<String> listaPerfumes = new ArrayList<String>();
    
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       if(!(edNome.getText().equals(""))){
        listaPerfumes.add(edNome.getText());
        JOptionPane.showMessageDialog(null, "O perfume "
                + edNome.getText() + " Salvo com sucesso");
        edNome.setText(null);
        edNome.requestFocus();
       }else{
           JOptionPane.showMessageDialog(null,"Cadastre o perfume! Xiruzão");
       }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        String perf = "";
        if (!listaPerfumes.isEmpty()) {
            for (int i = 0; i < listaPerfumes.size(); i++) {
                perf = perf +(i+1)+"º :"+listaPerfumes.get(i) + "\n";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Aviso: Não existe "
                    + "perfumes cadastrados!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        edLista.setText(perf);
    }//GEN-LAST:event_btListarActionPerformed

    private void btOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarActionPerformed
        if (!listaPerfumes.isEmpty() && listaPerfumes.size() >= 2) {
            Collections.sort(listaPerfumes);
            JOptionPane.showMessageDialog(null, "Lista Ordenada!");
        } else if (listaPerfumes.size() == 1) {
            JOptionPane.showMessageDialog(null, "Impossível ordenar apenas 1 único perfume");
        } else {
            JOptionPane.showMessageDialog(null, "Lista Vazia!!");
        }
    }//GEN-LAST:event_btOrdenarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (listaPerfumes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Impossivel Excluir, "
                    + "Não existe perfumes cadastrados!", "Atenção", 
                    JOptionPane.WARNING_MESSAGE);
        }else{
            int i = Integer.parseInt(
                    JOptionPane.showInputDialog("Qual item deseja excluir?"));
            if(i>0 && i<=listaPerfumes.size()){
              if(JOptionPane.showConfirmDialog(null,
                      "Tem certeza que deseja excluir o perfume "+listaPerfumes.get(i-1),"Confirme", 
                      JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                listaPerfumes.remove(i-1);
                JOptionPane.showMessageDialog(null,"Perfume excluido com sucesso!");
              }else{ JOptionPane.showMessageDialog(null, "Exclusão cancelada!! Ufaaa");
            }}else{
                JOptionPane.showMessageDialog(null, "Não existe este perfume!");
                    
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
     if(listaPerfumes.isEmpty()){
         JOptionPane.showMessageDialog(null, "Sr(a). a sua lista já se encontra limpa!");
     }else{
          if(JOptionPane.showConfirmDialog(null,
                      "Tem certeza que deseja limpar a sua lista de perfumes? Essa ação é irreversível?\n"
                      +"Faça o devido backup antes de executar essa tarefa! ","Confirme", 
                      JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                 listaPerfumes.clear();
                 JOptionPane.showMessageDialog(null,"Ação CONCLUÍDA com sucesso!!");
          }
          else{
              JOptionPane.showMessageDialog(null,"Opção CANCELADA com sucesso!!");
          }
     }
    }//GEN-LAST:event_btLimparActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
         if (listaPerfumes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Impossivel Editar , "
                    + "Não existe este perfume cadastrado!", "Atenção", 
                    JOptionPane.WARNING_MESSAGE);
        }else{
            int i = Integer.parseInt(
                    JOptionPane.showInputDialog("Qual item deseja editar?"));
            if(i>0 && i<=listaPerfumes.size()){
              if(JOptionPane.showConfirmDialog(null,
                      "Tem certeza que deseja editar o perfume "+listaPerfumes.get(i-1),"Confirme", 
                      JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                    String novoNome = JOptionPane.showInputDialog("Informe o novo nome:");
                    listaPerfumes.set(i-1, novoNome);
              }else{
                   JOptionPane.showMessageDialog(null, "Cancelado com sucesso! ");
              }
            }else{
                 JOptionPane.showMessageDialog(null, "Não existe este perfume! ");
            }
         }
    }//GEN-LAST:event_btEditarActionPerformed

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
            java.util.logging.Logger.getLogger(Perfumes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfumes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfumes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfumes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfumes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btOrdenar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextArea edLista;
    private javax.swing.JTextField edNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
