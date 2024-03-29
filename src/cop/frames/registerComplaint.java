/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cop.frames;

/**
 *
 * @author hawk
 */

import cop.utils.ConnectToPSQL;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
public class registerComplaint extends javax.swing.JFrame {

    public ConnectToPSQL con;
    static String uname = "", fname = "", lname ="", email = "", pwd = "", u_type = "";
    static long mob;
    static int uid = -1;
    
    public registerComplaint(int uid, String uname, String pwd, String fname, String lname, long mob,String email, String u_type) {
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.u_type = u_type;
        this.mob = mob;
        initComponents();
        groupButton();
        con=new ConnectToPSQL();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        helloLabel = new javax.swing.JLabel();
        priorityLabel = new javax.swing.JLabel();
        highRadio = new javax.swing.JRadioButton();
        mediumRadio = new javax.swing.JRadioButton();
        lowRadio = new javax.swing.JRadioButton();
        categoryLabel = new javax.swing.JLabel();
        categoryCombo = new javax.swing.JComboBox<>();
        locationLabel = new javax.swing.JLabel();
        locationText = new javax.swing.JTextField();
        complaintLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        complaintText = new javax.swing.JTextArea();
        cancelButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Social COP");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Social COP | Register Complaint", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 14))); // NOI18N

        helloLabel.setText("Hello");

        priorityLabel.setText("Priority");

        highRadio.setText("High");

        mediumRadio.setText("Medium");
        mediumRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumRadioActionPerformed(evt);
            }
        });

        lowRadio.setText("Low");
        lowRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowRadioActionPerformed(evt);
            }
        });

        categoryLabel.setText("Category");

        categoryCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Road Block", "Accident", "Broken Road", "Other" }));
        categoryCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryComboActionPerformed(evt);
            }
        });

        locationLabel.setText("Location");

        locationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTextActionPerformed(evt);
            }
        });

        complaintLabel.setText("Complaint");

        complaintText.setColumns(20);
        complaintText.setRows(5);
        jScrollPane1.setViewportView(complaintText);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(priorityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(highRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mediumRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lowRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(locationText))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(helloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(complaintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoryCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(highRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mediumRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lowRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(priorityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(categoryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(complaintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mediumRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediumRadioActionPerformed

    private void lowRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lowRadioActionPerformed

    private void categoryComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryComboActionPerformed

    private void locationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTextActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String priority="", category = "", location = "", complaint = "";
        if(lowRadio.isSelected()) {priority = "Low";}
        else if(mediumRadio.isSelected()) {priority = "Medium";}
        else if(highRadio.isSelected()) {priority = "High";}
        category = (String) categoryCombo.getSelectedItem();
        if(locationText.getText().trim().length()==0)
            location="NULL";
        else {location = "'"+locationText.getText()+"'";}
        
        if(complaintText.getText().trim().length()==0 || complaintText.getText().trim().length()>256)
        {
            JOptionPane.showMessageDialog(null, "Enter complaint with character count between 0 and 256 ");
            return;
        }
        else {complaint = complaintText.getText();}
        
        String sql = "insert into complaints values(DEFAULT, '"+uid+"', '"+priority+"', 'Registered', '"+complaint+"', "+location+", '"+category+"', NULL)";
        if(con.InsertQuery(sql)>0){
            JOptionPane.showMessageDialog(null, "Complaint registered Successfully ");
            this.dispose();
            new userPanel(uid,uname,pwd,fname,lname,mob,email,u_type).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Error ", cop.COP.app_name, JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        this.dispose();
        new registerComplaint(uid,uname,pwd,fname,lname,mob,email,u_type).setVisible(true);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
        new userPanel(uid,uname,pwd,fname,lname,mob,email,u_type).setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void groupButton(){
        ButtonGroup pbg = new ButtonGroup();
        pbg.add(highRadio);
        pbg.add(mediumRadio);
        pbg.add(lowRadio);
        lowRadio.setSelected(true);
    }
    
    
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
            java.util.logging.Logger.getLogger(registerComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerComplaint(uid,uname,pwd,fname,lname,mob,email,u_type).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> categoryCombo;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel complaintLabel;
    private javax.swing.JTextArea complaintText;
    private javax.swing.JLabel helloLabel;
    private javax.swing.JRadioButton highRadio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField locationText;
    private javax.swing.JRadioButton lowRadio;
    private javax.swing.JRadioButton mediumRadio;
    private javax.swing.JLabel priorityLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
