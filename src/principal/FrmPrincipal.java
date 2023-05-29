package principal;

import heranca.Aluno;
import heranca.Funcionario;
import heranca.Pessoa;
import heranca.Professor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FrmPrincipal extends javax.swing.JFrame {

    private List<Pessoa> pessoas = new ArrayList<>();

    public FrmPrincipal() {
        initComponents();

        Aluno p1 = new Aluno("Chico", 16, "M", 1, "Informática");
        Professor p2 = new Professor("Informática", 100, "João Filho", 26, "M");
        Funcionario p3 = new Funcionario("Limpeza", true, "Zé", 50, "M");

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        initTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPessoas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPessoas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPessoas;
    // End of variables declaration//GEN-END:variables

    public void initTable() {
        String colunas[] = new String[]{"Nome", "idade", "Sexo", "Observações"};
        DefaultTableModel tbmModelo = new DefaultTableModel(colunas, 0);
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);

            String observacao = "";
            if (p instanceof Aluno) {
                observacao = "Matrícula: " + ((Aluno) p).getMatricula()
                        + "\nCurso: " + ((Aluno) p).getCurso();
            } else if (p instanceof Professor) {
                observacao = "Especialidade: " + ((Professor) p).getEspecialidade()
                        + "\nSalario: " + ((Professor) p).getSalario();
            } else if (p instanceof Funcionario) {
                observacao = "Trabalhando: " + ((Funcionario) p).isTrabalhando()
                        + "\nSetor: " + ((Funcionario) p).getSetor();
            }

            tbmModelo.addRow(new Object[]{p.getNome(), p.getIdade(), p.getSexo(), observacao});

        }

        tblPessoas.setModel(tbmModelo);

    }
}
