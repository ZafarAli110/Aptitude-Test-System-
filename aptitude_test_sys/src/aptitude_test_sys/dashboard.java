/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aptitude_test_sys;

/**
 *
 * @author hp
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        btn_subject = new javax.swing.JButton();
        btn_question = new javax.swing.JButton();
        btn_result = new javax.swing.JButton();
        lbl_logout = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 315));
        jPanel1.setLayout(null);

        btn_subject.setBackground(new java.awt.Color(204, 204, 204));
        btn_subject.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_subject.setForeground(new java.awt.Color(255, 102, 0));
        btn_subject.setText("Topics");
        btn_subject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subjectActionPerformed(evt);
            }
        });
        jPanel1.add(btn_subject);
        btn_subject.setBounds(50, 140, 100, 30);

        btn_question.setBackground(new java.awt.Color(204, 204, 204));
        btn_question.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_question.setForeground(new java.awt.Color(255, 102, 0));
        btn_question.setText("Question");
        btn_question.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_questionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_question);
        btn_question.setBounds(180, 140, 100, 30);

        btn_result.setBackground(new java.awt.Color(204, 204, 204));
        btn_result.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_result.setForeground(new java.awt.Color(255, 102, 0));
        btn_result.setText("Results");
        btn_result.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resultActionPerformed(evt);
            }
        });
        jPanel1.add(btn_result);
        btn_result.setBounds(310, 140, 100, 30);

        lbl_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aptitude_test_sys/images/Logout.png"))); // NOI18N
        lbl_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logoutMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_logout);
        lbl_logout.setBounds(180, 250, 100, 35);

        lbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aptitude_test_sys/images/admin portal.jpg"))); // NOI18N
        jPanel1.add(lbl_image);
        lbl_image.setBounds(0, 0, 470, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subjectActionPerformed
        // TODO add your handling code here:
        subject s=new subject();
        s.show();
        dispose();
        
    }//GEN-LAST:event_btn_subjectActionPerformed

    private void btn_questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_questionActionPerformed
        // TODO add your handling code here:
        question q=new question();
        q.show();
        dispose();
        
    }//GEN-LAST:event_btn_questionActionPerformed

    private void lbl_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoutMouseClicked
        // TODO add your handling code here:
        
        admin_panel ap=new admin_panel();
        ap.show();
        dispose();
        
    }//GEN-LAST:event_lbl_logoutMouseClicked

    private void btn_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resultActionPerformed
      
        Results re= new Results();
        re.show();
        dispose();
        
    }//GEN-LAST:event_btn_resultActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_question;
    private javax.swing.JButton btn_result;
    private javax.swing.JButton btn_subject;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lbl_logout;
    // End of variables declaration//GEN-END:variables
}
