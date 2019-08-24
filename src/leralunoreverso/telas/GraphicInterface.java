
 
package leralunoreverso.telas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import leralunoreverso.*;



public class GraphicInterface extends javax.swing.JFrame {
    
    GraphicInterfaceBD gibd  = new GraphicInterfaceBD();
    LerEscreverAluno lea = new LerEscreverAluno();
    int indexShow;
   
    public GraphicInterface() {
        initComponents();
        indexShow = 0;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NextAluno = new javax.swing.JButton();
        Nome = new javax.swing.JTextField();
        Nota1 = new javax.swing.JTextField();
        Nota2 = new javax.swing.JTextField();
        Media = new javax.swing.JTextField();
        Matricula = new javax.swing.JTextField();
        Disciplina = new javax.swing.JTextField();
        Situacao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        previousAluno = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Escrever = new javax.swing.JButton();
        BddActions = new javax.swing.JButton();
        DeleteAluno = new javax.swing.JButton();
        Att = new javax.swing.JButton();
        CreateAluno = new javax.swing.JButton();
        Ler = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ficha de Alunos - Arquivos");

        NextAluno.setText("Próximo Aluno");
        NextAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextAlunoActionPerformed(evt);
            }
        });

        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });

        Nota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nota1ActionPerformed(evt);
            }
        });

        Nota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nota2ActionPerformed(evt);
            }
        });

        Media.setEditable(false);
        Media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediaActionPerformed(evt);
            }
        });

        Matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatriculaActionPerformed(evt);
            }
        });

        Disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisciplinaActionPerformed(evt);
            }
        });

        Situacao.setEditable(false);
        Situacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SituacaoActionPerformed(evt);
            }
        });

        jLabel1.setText("Matricula");

        jLabel2.setText("Nome");

        jLabel3.setText("Disciplina");
        jLabel3.setToolTipText("");

        jLabel4.setText("Nota 1");

        jLabel5.setText("Nota 2");

        jLabel6.setText("Média");

        jLabel7.setText("Situação");

        previousAluno.setText("Aluno Anterior");
        previousAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousAlunoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("Ficha de Alunos");
        jLabel8.setToolTipText("");

        Escrever.setText("Criar Arquivo");
        Escrever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscreverActionPerformed(evt);
            }
        });

        BddActions.setText("Ações do BD");
        BddActions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BddActionsActionPerformed(evt);
            }
        });

        DeleteAluno.setText("Deletar Aluno ");
        DeleteAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAlunoActionPerformed(evt);
            }
        });

        Att.setText("Atualizar Aluno");
        Att.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttActionPerformed(evt);
            }
        });

        CreateAluno.setText("Criar novo Aluno c/ essas Informações");
        CreateAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAlunoActionPerformed(evt);
            }
        });

        Ler.setText("Ler Arquivo");
        Ler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LerActionPerformed(evt);
            }
        });

        jButton1.setText("Mudar Diretório");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Att, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BddActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Escrever, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CreateAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(previousAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NextAluno)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Situacao, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addComponent(Media, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nota2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nota1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Disciplina, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Matricula, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Ler)
                .addGap(104, 104, 104)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Ler)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Att)
                    .addComponent(CreateAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextAluno)
                    .addComponent(previousAluno)
                    .addComponent(Escrever)
                    .addComponent(BddActions)
                    .addComponent(DeleteAluno))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatriculaActionPerformed

    }//GEN-LAST:event_MatriculaActionPerformed

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed

    }//GEN-LAST:event_NomeActionPerformed

    private void DisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisciplinaActionPerformed
     
    }//GEN-LAST:event_DisciplinaActionPerformed

    private void Nota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nota1ActionPerformed
     
    }//GEN-LAST:event_Nota1ActionPerformed

    private void Nota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nota2ActionPerformed

    }//GEN-LAST:event_Nota2ActionPerformed

    private void MediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediaActionPerformed
       
    }//GEN-LAST:event_MediaActionPerformed

    private void SituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SituacaoActionPerformed

    }//GEN-LAST:event_SituacaoActionPerformed

    private void NextAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextAlunoActionPerformed
        if(indexShow < lea.listaA.size() - 1)
        this.indexShow++;
        
        Matricula.setText(lea.listaA.get(indexShow).matricula);
        Nome.setText(lea.listaA.get(indexShow).nome);
        Disciplina.setText(lea.listaA.get(indexShow).disciplina);
        Nota1.setText(lea.listaA.get(indexShow).nota1);
        Nota2.setText(lea.listaA.get(indexShow).nota2);
        String mediaShow = String.valueOf(lea.listaA.get(indexShow).media);
        Media.setText(mediaShow);
        Situacao.setText(lea.listaA.get(indexShow).situacao);
    }//GEN-LAST:event_NextAlunoActionPerformed

    private void previousAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousAlunoActionPerformed
        if(indexShow != 0)
        this.indexShow--;
        
        Matricula.setText(lea.listaA.get(indexShow).matricula);
        Nome.setText(lea.listaA.get(indexShow).nome);
        Disciplina.setText(lea.listaA.get(indexShow).disciplina);
        Nota1.setText(lea.listaA.get(indexShow).nota1);
        Nota2.setText(lea.listaA.get(indexShow).nota2);
        String mediaShow = String.valueOf(lea.listaA.get(indexShow).media);
        Media.setText(mediaShow);
        Situacao.setText(lea.listaA.get(indexShow).situacao);
    }//GEN-LAST:event_previousAlunoActionPerformed

    private void LerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LerActionPerformed
        try{
        lea.lerAluno();
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "Arquivo não encontrado!");
           new GraphicInterface().setVisible(false);
        }
        
        Matricula.setText(lea.listaA.get(0).matricula);
        Nome.setText(lea.listaA.get(0).nome);
        Disciplina.setText(lea.listaA.get(0).disciplina);
        Nota1.setText(lea.listaA.get(0).nota1);
        Nota2.setText(lea.listaA.get(0).nota2);
        String mediaShow = String.valueOf(lea.listaA.get(0).media);
        Media.setText(mediaShow);
        Situacao.setText(lea.listaA.get(0).situacao);

    }//GEN-LAST:event_LerActionPerformed

    private void EscreverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscreverActionPerformed
        try{
        String url = JOptionPane.showInputDialog("Insira o diretório para salvar. Se quiser usar o padrão, desconsidere. (Coloque dois '\\'): ");
        if(url != null){
        url = url + "\\AlunosResultado.txt";
        lea.diretorioE = url;}    
        lea.escreverAluno();
        JOptionPane.showMessageDialog(null, "Arquivo criado! Cheque o diretório usado");
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "Arquivo para escrita não encontrado!");
           new GraphicInterface().setVisible(false);
        } 
        
        
        
    }//GEN-LAST:event_EscreverActionPerformed

    private void AttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttActionPerformed
        lea.atualizaAluno(Matricula.getText(), Nome.getText(), Disciplina.getText(), Nota1.getText(), Nota2.getText(), indexShow);
        
        Matricula.setText(lea.listaA.get(indexShow).matricula);
        Nome.setText(lea.listaA.get(indexShow).nome);
        Disciplina.setText(lea.listaA.get(indexShow).disciplina);
        Nota1.setText(lea.listaA.get(indexShow).nota1);
        Nota2.setText(lea.listaA.get(indexShow).nota2);
        String mediaShow = String.valueOf(lea.listaA.get(indexShow).media);
        Media.setText(mediaShow);
        Situacao.setText(lea.listaA.get(indexShow).situacao);
        JOptionPane.showMessageDialog(null, "Aluno Atualizado com sucesso");
    }//GEN-LAST:event_AttActionPerformed

    private void DeleteAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAlunoActionPerformed
        lea.listaA.remove(indexShow);
        if(indexShow != 0)
        this.indexShow--;
        Matricula.setText(lea.listaA.get(indexShow).matricula);
        Nome.setText(lea.listaA.get(indexShow).nome);
        Disciplina.setText(lea.listaA.get(indexShow).disciplina);
        Nota1.setText(lea.listaA.get(indexShow).nota1);
        Nota2.setText(lea.listaA.get(indexShow).nota2);
        String mediaShow = String.valueOf(lea.listaA.get(indexShow).media);
        Media.setText(mediaShow);
        Situacao.setText(lea.listaA.get(indexShow).situacao);
        
        JOptionPane.showMessageDialog(null, "Aluno deletado");
    }//GEN-LAST:event_DeleteAlunoActionPerformed

    private void CreateAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAlunoActionPerformed
        lea.criarAluno(Matricula.getText(), Nome.getText(), Disciplina.getText(), Nota1.getText(), Nota2.getText());
        JOptionPane.showMessageDialog(null, "Novo aluno criado, e seu registro se encontra no final da lista");
    }//GEN-LAST:event_CreateAlunoActionPerformed

    private void BddActionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BddActionsActionPerformed
          new GraphicInterface().setVisible(false);
          new GraphicInterfaceBD().setVisible(true);
    }//GEN-LAST:event_BddActionsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String url = JOptionPane.showInputDialog("Insira o novo diretório (Coloque dois '\\'): ");
        url = url + "\\Alunos.txt";
        lea.diretorio = url;
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GraphicInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
      
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphicInterface().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Att;
    private javax.swing.JButton BddActions;
    private javax.swing.JButton CreateAluno;
    private javax.swing.JButton DeleteAluno;
    private javax.swing.JTextField Disciplina;
    private javax.swing.JButton Escrever;
    private javax.swing.JButton Ler;
    private javax.swing.JTextField Matricula;
    private javax.swing.JTextField Media;
    private javax.swing.JButton NextAluno;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Nota1;
    private javax.swing.JTextField Nota2;
    private javax.swing.JTextField Situacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton previousAluno;
    // End of variables declaration//GEN-END:variables
}
