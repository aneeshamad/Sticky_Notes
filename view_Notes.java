/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sticky_note;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aneeshamad
 */
public class view_Notes extends javax.swing.JFrame {

    /**
     * Creates new form view_Notes
     */
    public view_Notes() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        search_user2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Notes = new javax.swing.JTextArea();
        firstName3 = new javax.swing.JTextField();
        lastName3 = new javax.swing.JTextField();
        Back_to_Main3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View all note for a user", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 2, 14)); // NOI18N
        jLabel1.setText("Retrieve your notes? Absolutely !");

        jLabel3.setText("Farst Name");

        jLabel4.setText(" Last Name");

        search_user2.setText("search");
        search_user2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_user2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Here are your notes");

        Notes.setColumns(20);
        Notes.setRows(5);
        jScrollPane2.setViewportView(Notes);

        firstName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstName3ActionPerformed(evt);
            }
        });

        lastName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastName3ActionPerformed(evt);
            }
        });

        Back_to_Main3.setText(" <<Back to Main Menu ");
        Back_to_Main3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_to_Main3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Let me know your farst & last name ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Back_to_Main3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstName3)
                            .addComponent(lastName3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(search_user2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(firstName3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lastName3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(search_user2)
                        .addGap(38, 38, 38)))
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back_to_Main3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static String read(File target)throws Exception 
  { 
  
  BufferedReader br = new BufferedReader(new FileReader(target)); 
  
  String st=""; 
  while ((st = br.readLine()) != null) 
    st+= st;
  return st;
  } 
 
    
    
    public static String readFileAsString(String target)throws Exception 
  { 
    String data = ""; 
    data = new String(Files.readAllBytes(Paths.get(target))); 
    return data; 
  } 
 
    private void firstName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstName3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstName3ActionPerformed

    private void lastName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastName3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastName3ActionPerformed

    private void Back_to_Main3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_to_Main3ActionPerformed
        // TODO add your handling code here:
        Sticky_Notes Sticky= new Sticky_Notes();
        Sticky.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back_to_Main3ActionPerformed

    private void search_user2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_user2ActionPerformed
        // TODO add your handling code here:
         String first_name = new String();
        String last_name =new String ();
        first_name = firstName3.getText();
        last_name =lastName3.getText(); 
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
        File target=new File("//Users//aneeshamad//NetBeansProjects//Sticky_Note//".concat(fullname).concat(".txt"));
    
         try {
                    //New_note.append(read(target));
                     Notes.setText(" your notes are  "+"\n"+readFileAsString(fullname.concat(".txt")));
                } catch (Exception ex) {
                    Logger.getLogger(view_Notes.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            
         }
         if(!found) {
              System.out.println("not found ");
           JOptionPane.showMessageDialog(null,
        " File not Exist " + "" + ".",
        null, JOptionPane.INFORMATION_MESSAGE);
           Notes.setEditable(false);
         }
         
      }
      
        
    }//GEN-LAST:event_search_user2ActionPerformed

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
            java.util.logging.Logger.getLogger(view_Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_Notes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_to_Main3;
    private javax.swing.JTextArea Notes;
    private javax.swing.JTextField firstName3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastName3;
    private javax.swing.JButton search_user2;
    // End of variables declaration//GEN-END:variables
}
