/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package catSchool.view;

/**
 *
 * @author junior
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCadastrarAluno = new javax.swing.JMenuItem();
        jMenuItemCadastrarProfessor = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemConsultarAluno = new javax.swing.JMenuItem();
        jMenuItemConsultarProfessor = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem2.setText("jMenuItem2");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem7.setText("jMenuItem7");

        jMenuItem9.setText("jMenuItem9");

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharTelaMenu(evt);
            }
        });

        jButton1.setText("jButton1");

        jLabel1.setText(" Cadastrar, listar e excluir alunos e professores da sua instituição ;)");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Bem vindo ao CatSchool!");

        jLabel3.setText("Aqui você poderá:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catSchool/images/gato (1).png"))); // NOI18N

        jMenu1.setText("Cadastrar");

        jMenuItemCadastrarAluno.setText("Aluno");
        jMenuItemCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirTelDeCadastrarAlun(evt);
            }
        });
        jMenu1.add(jMenuItemCadastrarAluno);

        jMenuItemCadastrarProfessor.setText("Professor");
        jMenuItemCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirTelaCadastrarProfessor(evt);
            }
        });
        jMenu1.add(jMenuItemCadastrarProfessor);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Consultar");

        jMenuItemConsultarAluno.setText("Aluno");
        jMenuItemConsultarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirTelaConsultarAluno(evt);
            }
        });
        jMenu3.add(jMenuItemConsultarAluno);

        jMenuItemConsultarProfessor.setText("Professor");
        jMenuItemConsultarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirTelaConsultaProfessor(evt);
            }
        });
        jMenu3.add(jMenuItemConsultarProfessor);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel4)))
                .addGap(0, 83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharTelaMenu(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharTelaMenu
        this.dispose();
    }//GEN-LAST:event_fecharTelaMenu

    private void abrirTelDeCadastrarAlun(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirTelDeCadastrarAlun
        TelaCadastroAluno telaCadastroAluno = new TelaCadastroAluno(this);
        telaCadastroAluno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_abrirTelDeCadastrarAlun

    private void abrirTelaConsultarAluno(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirTelaConsultarAluno
        this.dispose();
        TelaConsultaAluno telaConsultaAluno = new TelaConsultaAluno(this);
        telaConsultaAluno.setVisible(true);
    }//GEN-LAST:event_abrirTelaConsultarAluno

    private void abrirTelaCadastrarProfessor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirTelaCadastrarProfessor
        this.dispose();
        TelaCadastroProfessor telaCadastroProfessor = new TelaCadastroProfessor(this);
        telaCadastroProfessor.setVisible(true);
    }//GEN-LAST:event_abrirTelaCadastrarProfessor

    private void abrirTelaConsultaProfessor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirTelaConsultaProfessor
        this.dispose();
        TelaConsultaProfessor telaConsultaProfessor = new TelaConsultaProfessor(this);
        telaConsultaProfessor.setVisible(true);
    }//GEN-LAST:event_abrirTelaConsultaProfessor

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemCadastrarAluno;
    private javax.swing.JMenuItem jMenuItemCadastrarProfessor;
    private javax.swing.JMenuItem jMenuItemConsultarAluno;
    private javax.swing.JMenuItem jMenuItemConsultarProfessor;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}