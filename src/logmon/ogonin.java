/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logmon;

import Models.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.file;

/**
 *
 * @author Dell
 */
public class ogonin extends javax.swing.JFrame {

    /**
     * Creates new form ogonin
     */
    public ogonin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFC = new javax.swing.JFileChooser();
        jD1 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jB3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jL1 = new javax.swing.JLabel();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jT1 = new javax.swing.JLabel();
        jBut1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFCActionPerformed(evt);
            }
        });

        jD1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jD1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jD1.setMinimumSize(new java.awt.Dimension(800, 500));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "user", "phno", "role"
            }
        ));
        jTable2.setEnabled(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        jB3.setText("Edit User");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jB4.setText("Add  User");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jD1Layout = new javax.swing.GroupLayout(jD1.getContentPane());
        jD1.getContentPane().setLayout(jD1Layout);
        jD1Layout.setHorizontalGroup(
            jD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jD1Layout.createSequentialGroup()
                        .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jD1Layout.setVerticalGroup(
            jD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB3)
                    .addComponent(jButton3)
                    .addComponent(jB4))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jL1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jL1.setText("File Location");

        jB1.setText("Open");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB2.setText("Validate");
        jB2.setEnabled(false);
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jBut1.setText("Config");
        jBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut1ActionPerformed(evt);
            }
        });

        jButton1.setText("Start");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Stop");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/Coder-PNG-Image.png"))); // NOI18N
        jLabel1.setText("srkn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jT1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(152, 152, 152)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(135, 135, 135))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jT1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
TimerTask tt = new TimerTask() {
        public void run() {
            if (utils.date.checkForNew(folname)) {
                jT1.setText(System.currentTimeMillis()+" Monitoring Folder : " + folname);
                System.out.println("Monitofing in cli" + folname);
                if (utils.Monitor.check(file)) {
                    userList = (ArrayList<User>) utils.UserList.readUsersFromCSV("C:\\logmon\\User.notif\\user.logmon");
                    model = (DefaultTableModel) jTable2.getModel();
                    System.out.println("Sys Down");
                    System.out.println("App Down. Notified..");
                    
                    Object[] rowData = new Object[3];
                    for (int i = 0; i < userList.size(); i++) {
                        rowData[0] = userList.get(i).getPhno();
                        rowData[1] = userList.get(i).getPhno();
                        utils.Monitor.sendNotif(rowData[1].toString(), smsMess);
                        jT1.setText("App Down. Notified..");
                        System.out.println("App Down.Admin"+ rowData[0].toString()+" "+ " "+rowData[1]+ " Notified..");
                    }
                }
            } else {

                pathFol = loc1.getParentFile().getPath();
                pathUniv = pathFol + "\\" + utils.date.newFol() + "\\" + filname;
                run();
            }
        }
    };
    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        // TODO add your handling code here:
        int returnVal = jFC.showOpenDialog(jL1);
        if (returnVal == jFC.APPROVE_OPTION) {
            file = jFC.getSelectedFile();
            pathUniv = file.getPath();
            filname = file.getName();
            loc1 = file.getParentFile();
            folname = loc1.getName();

            jT1.setText("Folder " + folname + "|" + filname + " is to be monitord. Validate to monitor");
            jB2.setEnabled(true);
        } else {
            jT1.setText("File access cancelled by user.");
        }
    }//GEN-LAST:event_jB1ActionPerformed

    private void jFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFCActionPerformed


    }//GEN-LAST:event_jFCActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        // TODO add your handling code here:
        if (utils.date.thisday(folname)) {
            jButton1.setEnabled(rootPaneCheckingEnabled);
            jT1.setText("Validated. Please press Start Monitoring");
        } else {
            jT1.setText("Validation Failed");
        }
    }//GEN-LAST:event_jB2ActionPerformed

    private void jBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut1ActionPerformed
        // TODO add your handling code here:
        jD1.setVisible(true);
        File logmonuser = new File("C:\\logmon\\User.notif\\user.logmon");
        boolean exists = logmonuser.exists();

        if (!exists) {
            try {
                logmonuser.getParentFile().mkdirs();
                logmonuser.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ogonin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        userList = (ArrayList<User>) utils.UserList.readUsersFromCSV("C:\\logmon\\User.notif\\user.logmon");
        model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        Object[] rowData = new Object[3];
        for (int i = 0; i < userList.size(); i++) {
            rowData[0] = userList.get(i).getUser();
            rowData[1] = userList.get(i).getPhno();
            rowData[2] = userList.get(i).getRole();
            model.addRow(rowData);
        }
    }//GEN-LAST:event_jBut1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        jButton2.setEnabled(true);
        jButton1.setEnabled(false);
        jT1.setText("Started Monitoring");

        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(tt, 0, 10, TimeUnit.SECONDS);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        executorService.shutdownNow();

        System.out.println("Stopped Monitoring" + folname);
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        // TODO add your handling code here:
        jTable2.setEnabled(true);
    }//GEN-LAST:event_jB3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FileWriter csv = null;
        try {
            // TODO add your handling code here:
            csv = new FileWriter(new File("C:\\logmon\\User.notif\\user.logmon"));

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {

                    String val = model.getValueAt(i, j).toString();
                    csv.write(val);
                    if (j != (model.getColumnCount() - 1)) {
                        csv.write(",");
                    }

                }

                csv.write("\n");

            }

            csv.flush();
            csv.close();

        } catch (IOException ex) {
            Logger.getLogger(ogonin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        // TODO add your handling code here:
        model.addRow(new Object[]{"Click to edit", "Click to edit", "Click to edit"});
    }//GEN-LAST:event_jB4ActionPerformed

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
            java.util.logging.Logger.getLogger(ogonin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ogonin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ogonin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ogonin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ogonin().setVisible(true);
            }
        });
    }
    public ArrayList<Models.User> userList;
    String smsMess = "IMPORTANT ACL SMS Server is Down. Please Check Immediately";
    String folname, filname, pathUniv, pathFol;
    boolean status = true;
    File file, loc1;
    ScheduledExecutorService executorService;
    DefaultTableModel model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jBut1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jD1;
    private javax.swing.JFileChooser jFC;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel jT1;
    public javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}