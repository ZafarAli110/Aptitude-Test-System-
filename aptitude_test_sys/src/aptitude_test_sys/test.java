/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aptitude_test_sys;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class test extends javax.swing.JFrame {
DBConnect db=new DBConnect();
ResultSet rs,rs1;
ButtonGroup bg=new ButtonGroup();
    /**
     * Creates new form test
     */
    public test(String name,String age,String phone,String qualification,String topic,String date) {
        initComponents();
        this.setLocationRelativeTo(null);
        lbltopic.setText(topic);
        lblname.setText(name);
        lblage.setText(age);
        lblphone.setText(phone);
        lblqualification.setText(qualification);
        lblanswer.setVisible(false);
        btnSubmit.setVisible(false);
        lblqualification.setVisible(false);
        lblphone.setVisible(false);
        lblage.setVisible(false);
        lblgrade.setVisible(false);
        lbldate.setText(date);
        bg.add(Option1);
        bg.add(Option2);
        bg.add(Option3);
        bg.add(Option4);
        try 
        {   
            rs1 = db.s.executeQuery("select count(q_id)as total from question where subject_name = '"+topic+"' ");
            if(rs1.next())
            {  
                String TOTAL=rs1.getString("total");
                lbltque.setText(TOTAL);
            }
            rs = db.s.executeQuery("select * from question where subject_name = '"+topic+"' ");
            if(rs.next())
            {  
                lblquestion.setText(rs.getString("q_name") );               
                Option1.setText(rs.getString("option_1"));
                Option2.setText(rs.getString("option_2"));
                Option3.setText(rs.getString("option_3"));
                Option4.setText(rs.getString("option_4"));
                lblanswer.setText(rs.getString("answer"));
                lblqueno.setText("Question no: "+ q++);
            }
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e);
        }
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbltopic = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbltque = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblqueno = new javax.swing.JLabel();
        lblquestion = new javax.swing.JLabel();
        Option1 = new javax.swing.JRadioButton();
        Option2 = new javax.swing.JRadioButton();
        Option3 = new javax.swing.JRadioButton();
        Option4 = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblanswer = new javax.swing.JLabel();
        lblqualification = new javax.swing.JLabel();
        lblphone = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lblgrade = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Name :");

        lblname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Topic :");

        lbltopic.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Total Question :");

        lbltque.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("               Date :");

        lbldate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltopic, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltque, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbltque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbltopic, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1);
        jPanel1.setBounds(30, 70, 620, 120);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        Option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option1ActionPerformed(evt);
            }
        });

        Option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option2ActionPerformed(evt);
            }
        });

        Option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option3ActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(204, 204, 204));
        btnSubmit.setForeground(new java.awt.Color(255, 102, 0));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(204, 204, 204));
        btnNext.setForeground(new java.awt.Color(255, 102, 0));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Option1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                .addComponent(Option3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Option2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                .addComponent(Option4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lblquestion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblanswer, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(lblage, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblqualification, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblphone, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(lblqueno, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblqueno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblquestion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Option2)
                    .addComponent(Option1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Option4)
                    .addComponent(Option3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit)
                            .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblage, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                            .addComponent(lblgrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblanswer, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(lblqualification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblphone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        jPanel4.add(jPanel2);
        jPanel2.setBounds(30, 220, 620, 340);

        lbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aptitude_test_sys/images/TEST.jpg"))); // NOI18N
        jPanel4.add(lbl_image);
        lbl_image.setBounds(0, 0, 676, 581);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option1ActionPerformed

    private void Option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option2ActionPerformed

    private void Option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option3ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if( Option1.isSelected() || Option2.isSelected() || Option3.isSelected() || Option4.isSelected() )
        {
            try 
            {
                if( Option1.getText().equals(lblanswer.getText()) && Option1.isSelected() )
                {
                    marks++;
                }
                else if( Option2.getText().equals(lblanswer.getText()) && Option2.isSelected() )
                {
                    marks++;
                }
                else if( Option3.getText().equals(lblanswer.getText()) && Option3.isSelected() )
                {
                    marks++;
                }
                else if( Option4.getText().equals(lblanswer.getText()) && Option4.isSelected() )
                {
                    marks++;
                }

                if( rs.next() )
                {
                    lblquestion.setText( rs.getString("q_name") );

                    Option1.setText(rs.getString("option_1"));
                    Option2.setText(rs.getString("option_2"));
                    Option3.setText(rs.getString("option_3"));
                    Option4.setText(rs.getString("option_4"));

                    lblanswer.setText(rs.getString("answer"));
                    lblqueno.setText("Question no: "+ q++);
                    
                }
                else
                {
                    btnSubmit.setVisible(true);
                    btnNext.setVisible(false);
                }
                
                bg.clearSelection();
            } 
            catch (Exception e) 
            {

            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Please select atleast one option!!");
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        try 
        {
            int tot= Integer.parseInt(lbltque.getText());
            int per=(marks*100)/tot;
            if(per<60) 
            {
                lblgrade.setText("Fail");
            }
            else
            {
                lblgrade.setText("Pass");
            }
            int r=db.s.executeUpdate("insert into results values('"+lblname.getText()+"','"+lbltopic.getText()+"','"+lbltque.getText()+"','"+lbltque.getText()+"','"+marks+"','"+(marks*100)/tot+"','"+lblgrade.getText()+"','"+lbldate.getText()+"')");
            if(r>0)
            {
              result res=new result(marks, tot, lblname.getText(), lblage.getText(), lblphone.getText(), lblqualification.getText(), lbltopic.getText());
              res.show();
              dispose();
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    int marks=0;
    int q=1;
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Option1;
    private javax.swing.JRadioButton Option2;
    private javax.swing.JRadioButton Option3;
    private javax.swing.JRadioButton Option4;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblanswer;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblgrade;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lblqualification;
    private javax.swing.JLabel lblqueno;
    private javax.swing.JLabel lblquestion;
    private javax.swing.JLabel lbltopic;
    private javax.swing.JLabel lbltque;
    // End of variables declaration//GEN-END:variables
}
