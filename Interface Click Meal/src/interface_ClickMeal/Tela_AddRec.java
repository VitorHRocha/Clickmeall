/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_ClickMeal;

/**
 *
 * @author IFMG
 */
public class Tela_AddRec extends javax.swing.JFrame {

    /**
     * Creates new form Tela_AddIng
     */
    public Tela_AddRec() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_receita = new javax.swing.JLabel();
        jLabel_ing = new javax.swing.JLabel();
        jLabel_preparo = new javax.swing.JLabel();
        jTextField_nomeRec = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_preparo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_ing = new javax.swing.JTextArea();
        jButton_cadastrar = new javax.swing.JButton();
        jButton1_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(120, 20, 120, 120);

        jLabel_receita.setFont(new java.awt.Font("Albertus Medium", 1, 12)); // NOI18N
        jLabel_receita.setText("Nome Receita");
        jPanel1.add(jLabel_receita);
        jLabel_receita.setBounds(20, 130, 100, 15);

        jLabel_ing.setFont(new java.awt.Font("Albertus Medium", 1, 12)); // NOI18N
        jLabel_ing.setText("Ingredientes");
        jPanel1.add(jLabel_ing);
        jLabel_ing.setBounds(20, 190, 74, 15);

        jLabel_preparo.setFont(new java.awt.Font("Albertus Medium", 1, 12)); // NOI18N
        jLabel_preparo.setText("Preparo");
        jPanel1.add(jLabel_preparo);
        jLabel_preparo.setBounds(20, 290, 60, 15);

        jTextField_nomeRec.setFont(new java.awt.Font("Albertus Medium", 1, 12)); // NOI18N
        jPanel1.add(jTextField_nomeRec);
        jTextField_nomeRec.setBounds(20, 150, 320, 30);

        jTextArea_preparo.setColumns(20);
        jTextArea_preparo.setFont(new java.awt.Font("Albertus Medium", 1, 12)); // NOI18N
        jTextArea_preparo.setLineWrap(true);
        jTextArea_preparo.setRows(5);
        jScrollPane1.setViewportView(jTextArea_preparo);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 310, 320, 80);

        jTextArea_ing.setColumns(20);
        jTextArea_ing.setFont(new java.awt.Font("Albertus Medium", 1, 12)); // NOI18N
        jTextArea_ing.setLineWrap(true);
        jTextArea_ing.setRows(5);
        jScrollPane2.setViewportView(jTextArea_ing);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 208, 320, 70);

        jButton_cadastrar.setFont(new java.awt.Font("Albertus Medium", 1, 18)); // NOI18N
        jButton_cadastrar.setText("Cadastrar");
        jPanel1.add(jButton_cadastrar);
        jButton_cadastrar.setBounds(110, 410, 140, 60);

        jButton1_back.setFont(new java.awt.Font("Albertus Medium", 1, 12)); // NOI18N
        jButton1_back.setText("Voltar");
        jButton1_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_backActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_back);
        jButton1_back.setBounds(260, 440, 73, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 360, 490);

        setSize(new java.awt.Dimension(372, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_backActionPerformed
        Tela_MenuAdm tela = new Tela_MenuAdm();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1_backActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_AddRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_AddRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_AddRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_AddRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_AddRec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_back;
    private javax.swing.JButton jButton_cadastrar;
    private javax.swing.JLabel jLabel_ing;
    private javax.swing.JLabel jLabel_preparo;
    private javax.swing.JLabel jLabel_receita;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_ing;
    private javax.swing.JTextArea jTextArea_preparo;
    private javax.swing.JTextField jTextField_nomeRec;
    // End of variables declaration//GEN-END:variables
}
