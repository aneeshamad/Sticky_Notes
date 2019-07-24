/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sticky_note;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import static java.util.Locale.US;
/**
 *
 * @author aneeshamad
 */
public class Add_new_note extends javax.swing.JFrame {

    ArrayList<File> txt_files =new ArrayList<>();
    
    public Add_new_note() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstName2 = new javax.swing.JTextField();
        lastName2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        New_note = new javax.swing.JTextArea();
        search_user1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        add_note = new javax.swing.JButton();
        Back_to_Main2 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add New Note", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 2, 14)); // NOI18N
        jLabel1.setText("Let's add new note ...");

        jLabel2.setText("Please  enter your  full name");

        jLabel3.setText("Farst Name");

        jLabel4.setText(" Last Name");

        firstName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstName2ActionPerformed(evt);
            }
        });

        lastName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastName2ActionPerformed(evt);
            }
        });

        New_note.setColumns(20);
        New_note.setRows(5);
        jScrollPane2.setViewportView(New_note);

        search_user1.setText("search");
        search_user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_user1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Write down your note  >> ");

        add_note.setText("add note");
        add_note.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_noteActionPerformed(evt);
            }
        });

        Back_to_Main2.setText(" <<Back to Main Menu ");
        Back_to_Main2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_to_Main2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Back_to_Main2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstName2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(lastName2))
                                .addGap(44, 44, 44)
                                .addComponent(search_user1)))
                        .addGap(22, 22, 22)
                        .addComponent(add_note)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(firstName2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lastName2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(search_user1)
                        .addGap(71, 71, 71)))
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(add_note, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(Back_to_Main2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public static void usingBufferedWritter(String note ,File target ) throws IOException
{
    String textToAppend = note ;
     
    BufferedWriter writer = new BufferedWriter(
                                new FileWriter(target, true)  //Set true for append mode
                            ); 
    writer.newLine(); 
    writer.newLine();
    
    writer.write(textToAppend);
    writer.close();
}
    
     
    
    

    private void firstName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstName2ActionPerformed

    private void lastName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastName2ActionPerformed

    private void Back_to_Main2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_to_Main2ActionPerformed
        // TODO add your handling code here:
        
        Sticky_Notes Sticky= new Sticky_Notes();
        Sticky.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back_to_Main2ActionPerformed

    private void search_user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_user1ActionPerformed
        // TODO add your handling code here:
        String first_name = new String();
        String last_name =new String ();
        first_name = firstName2.getText();
        last_name =lastName2.getText(); 
        String fullname=new String();
        fullname= first_name.concat(last_name);
        String path =  "//Users//aneeshamad//NetBeansProjects//Sticky_Note";
        
       boolean found = false; 
      File dir = new File(path);
      String[] children = dir.list();
      String filename=null;
      if (children == null) {
         System.out.println("does not exist or is not a directory");
      } else {
         for (int i = 0; i < children.length; i++) {
            filename = children[i];
            boolean T= filename.contains(fullname.concat(".txt"));
            if (T==true) {
                System.out.println(fullname);
                found = true;
                JOptionPane.showMessageDialog(null,
        " File Exist " + "" + ".",
        null, JOptionPane.INFORMATION_MESSAGE);
            }
            
         }
         if(!found) {   // if the user not found ;
              System.out.println("not found ");
           JOptionPane.showMessageDialog(null,
        " File not Exist " + "" + ".",
        null, JOptionPane.INFORMATION_MESSAGE);
           add_note.setEnabled(false);
         }
         
      }
      
        
    }//GEN-LAST:event_search_user1ActionPerformed

    private void add_noteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_noteActionPerformed
        // TODO add your handling code here:
         String first_name = new String();
        String last_name =new String ();
        first_name = firstName2.getText();
        last_name =lastName2.getText(); 
        String fullname=new String();
        fullname= first_name.concat(last_name);
        String note=new String();
        note = New_note.getText();
        try{
        File target=new File("//Users//aneeshamad//NetBeansProjects//Sticky_Note//".concat(fullname).concat(".txt"));
        usingBufferedWritter(note,target);
        
      
       New_note.setText("");
        }
        catch (Exception ex) {
            Logger.getLogger(Add_new_note.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_add_noteActionPerformed

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
            java.util.logging.Logger.getLogger(Add_new_note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_new_note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_new_note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_new_note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_new_note().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_to_Main2;
    private javax.swing.JTextArea New_note;
    private javax.swing.JButton add_note;
    private javax.swing.JTextField firstName2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField lastName2;
    private javax.swing.JButton search_user1;
    // End of variables declaration//GEN-END:variables
}
