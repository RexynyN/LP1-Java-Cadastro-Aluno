
 
package leralunoreverso.telas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import leralunoreverso.*;



public class GraphicInterfaceBD extends javax.swing.JFrame {
    JDBc bd = new JDBc();
    int indexShow;
   
    public GraphicInterfaceBD() {
        initComponents();
        indexShow = 0;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
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
        DeleteAll = new javax.swing.JButton();
        DeleteSingle = new javax.swing.JButton();
        RecuperarSingle = new javax.swing.JButton();
        LerBD = new javax.swing.JButton();
        AddTodos = new javax.swing.JButton();
        AttAluno = new javax.swing.JButton();
        AddAluno = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ficha de Alunos - Banco de Dados");

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
        jLabel8.setText("Ficha de Alunos - BD");
        jLabel8.setToolTipText("");

        DeleteAll.setText("Deletar todos Alunos");
        DeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAllActionPerformed(evt);
            }
        });

        DeleteSingle.setText("Deletar esse Aluno");
        DeleteSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSingleActionPerformed(evt);
            }
        });

        RecuperarSingle.setText("Recuperar Aluno");
        RecuperarSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecuperarSingleActionPerformed(evt);
            }
        });

        LerBD.setText("Recuperar BD");
        LerBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LerBDActionPerformed(evt);
            }
        });

        AddTodos.setText("Adicionar todos Alunos");
        AddTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTodosActionPerformed(evt);
            }
        });

        AttAluno.setText("Atualizar Aluno");
        AttAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttAlunoActionPerformed(evt);
            }
        });

        AddAluno.setText("Adicionar Aluno ");
        AddAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LerBD)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DeleteSingle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RecuperarSingle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DeleteAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AttAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(LerBD))
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
                    .addComponent(RecuperarSingle)
                    .addComponent(AttAluno)
                    .addComponent(AddAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextAluno)
                    .addComponent(previousAluno)
                    .addComponent(DeleteAll)
                    .addComponent(DeleteSingle)
                    .addComponent(AddTodos))
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
        if(indexShow < bd.bdA.size() - 1)
        this.indexShow++;
        
        Matricula.setText(bd.bdA.get(indexShow).matricula);
        Nome.setText(bd.bdA.get(indexShow).nome);
        Disciplina.setText(bd.bdA.get(indexShow).disciplina);
        Nota1.setText(bd.bdA.get(indexShow).nota1);
        Nota2.setText(bd.bdA.get(indexShow).nota2);
        String mediaShow = String.valueOf(bd.bdA.get(indexShow).media);
        Media.setText(mediaShow);
        Situacao.setText(bd.bdA.get(indexShow).situacao);
    }//GEN-LAST:event_NextAlunoActionPerformed

    private void previousAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousAlunoActionPerformed
        if(indexShow != 0)
        this.indexShow--;
        
        Matricula.setText(bd.bdA.get(indexShow).matricula);
        Nome.setText(bd.bdA.get(indexShow).nome);
        Disciplina.setText(bd.bdA.get(indexShow).disciplina);
        Nota1.setText(bd.bdA.get(indexShow).nota1);
        Nota2.setText(bd.bdA.get(indexShow).nota2);
        String mediaShow = String.valueOf(bd.bdA.get(indexShow).media);
        Media.setText(mediaShow);
        Situacao.setText(bd.bdA.get(indexShow).situacao);
    }//GEN-LAST:event_previousAlunoActionPerformed

    private void LerBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LerBDActionPerformed
        try{
        bd.selectAll();
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "Conexão não foi feita com êxito");
        }
        
        Matricula.setText(bd.bdA.get(indexShow).matricula);
        Nome.setText(bd.bdA.get(indexShow).nome);
        Disciplina.setText(bd.bdA.get(indexShow).disciplina);
        Nota1.setText(bd.bdA.get(indexShow).nota1);
        Nota2.setText(bd.bdA.get(indexShow).nota2);
        String mediaShow = String.valueOf(bd.bdA.get(indexShow).media);
        Media.setText(mediaShow);
        Situacao.setText(bd.bdA.get(indexShow).situacao);

    }//GEN-LAST:event_LerBDActionPerformed

    private void DeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAllActionPerformed
        try{
        bd.deleteAll();
        JOptionPane.showMessageDialog(null, "Todas as Informações do BD foram deletadas");
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "Conexão não foi feita com êxito");
        } 
        
        
        
    }//GEN-LAST:event_DeleteAllActionPerformed

    private void RecuperarSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecuperarSingleActionPerformed
        try{
        Aluno show;
        String mat = JOptionPane.showInputDialog("Digite a matricula do Aluno que deseja recuperar: ");
        
        bd.select(mat);
           
        Matricula.setText(bd.show.matricula);
        Nome.setText(bd.show.nome);
        Disciplina.setText(bd.show.disciplina);
        Nota1.setText(bd.show.nota1);
        Nota2.setText(bd.show.nota2);
        String mediaShow = String.valueOf(bd.show.media);
        Media.setText(mediaShow);
        Situacao.setText(bd.show.situacao);
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "Conexão não foi feita com êxito");
        } 
    }//GEN-LAST:event_RecuperarSingleActionPerformed

    private void DeleteSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSingleActionPerformed
         try{  
        bd.delete(JOptionPane.showInputDialog("Digite a matricula do Aluno que deseja deletar: "));
         JOptionPane.showMessageDialog(null, "Aluno deletado");        
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "Conexão não foi feita com êxito");
           new GraphicInterfaceBD().setVisible(false);
        } 
    }//GEN-LAST:event_DeleteSingleActionPerformed

    private void AttAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttAlunoActionPerformed
        Aluno a = new Aluno();
        a.matricula = Matricula.getText();
        a.nome = Nome.getText();
        a.disciplina = Disciplina.getText();
        a.nota1 = Nota1.getText();
        a.nota2 = Nota2.getText();
        a.fazerFicha();
        
        bd.atualizar(a, indexShow);
        JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso");
        Matricula.setText(bd.show.matricula);
        Nome.setText(bd.show.nome);
        Disciplina.setText(bd.show.disciplina);
        Nota1.setText(bd.show.nota1);
        Nota2.setText(bd.show.nota2);
        String mediaShow = String.valueOf(bd.show.media);
        Media.setText(mediaShow);
        Situacao.setText(bd.show.situacao);
        
        
    }//GEN-LAST:event_AttAlunoActionPerformed

    private void AddTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTodosActionPerformed
        LerEscreverAluno loop = new LerEscreverAluno();
        int indexShow = 0;
        
        try{
        loop.lerAluno();
        bd.insereAll(loop.listaA);
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "Arquivo não encontrado!");
        }
    
        
    }//GEN-LAST:event_AddTodosActionPerformed

    private void AddAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAlunoActionPerformed
        Aluno a = new Aluno();
        a.matricula = Matricula.getText();
        a.nome = Nome.getText();
        a.disciplina = Disciplina.getText();
        a.nota1 = Nota1.getText();
        a.nota2 = Nota2.getText();
        a.fazerFicha();
        
        bd.insere(a);        
        JOptionPane.showMessageDialog(null, "Aluno inserido com sucesso");
       
        Matricula.setText(bd.show.matricula);
        Nome.setText(bd.show.nome);
        Disciplina.setText(bd.show.disciplina);
        Nota1.setText(bd.show.nota1);
        Nota2.setText(bd.show.nota2);
        String mediaShow = String.valueOf(bd.show.media);
        Media.setText(mediaShow);
        Situacao.setText(bd.show.situacao);
    }//GEN-LAST:event_AddAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(GraphicInterfaceBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicInterfaceBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicInterfaceBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicInterfaceBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
      
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphicInterfaceBD().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAluno;
    private javax.swing.JButton AddTodos;
    private javax.swing.JButton AttAluno;
    private javax.swing.JButton DeleteAll;
    private javax.swing.JButton DeleteSingle;
    private javax.swing.JTextField Disciplina;
    private javax.swing.JButton LerBD;
    private javax.swing.JTextField Matricula;
    private javax.swing.JTextField Media;
    private javax.swing.JButton NextAluno;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Nota1;
    private javax.swing.JTextField Nota2;
    private javax.swing.JButton RecuperarSingle;
    private javax.swing.JTextField Situacao;
    private javax.swing.JButton jButton2;
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
