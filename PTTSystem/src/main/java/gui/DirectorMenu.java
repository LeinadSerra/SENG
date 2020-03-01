/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author Burhan
 */
public class DirectorMenu extends javax.swing.JFrame {

    /**
     * Creates new form DirectorMenu
     */
    public DefaultListModel jlm_std;
    public DefaultListModel jlm_app;
    
    public DirectorMenu() {
        initComponents();
        this.setResizable(false);//Because App Interface is spoiled on Maximization
        jlm_std = new DefaultListModel();
        jlm_app = new DefaultListModel();
        //Adding elements in jlm_std
        jlm_std.addElement("A Minimum of 2 Years Experience in Teaching or Relevant field");
        jlm_std.addElement("Bachelor’s Degree in Teaching or Relevant field");
        jlm_std.addElement("Completed Health Quetionnaire");
        jlm_std.addElement("Declaration of Criminal Convictions");
        jlm_std.addElement("Exceptional Interpersonal and Presentation Skills");
        jlm_std.addElement("In-depth Knowledge of Teaching Methods and Legal Educational Procedures");
        jlm_std.addElement("Outstanding Written and Verbal Communication Skills");
        jlm_std.addElement("Well-organized with Excellent Leadership Abilities");        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        btn_add = new javax.swing.JButton();
        btn_rem = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        btn_read = new javax.swing.JButton();
        btn_send = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        lbl_stdlist = new javax.swing.JLabel();
        lbl_applist = new javax.swing.JLabel();
        js_std = new javax.swing.JScrollPane();
        jl_std = new javax.swing.JList<>();
        js_app = new javax.swing.JScrollPane();
        jl_app = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DirectorMenu");

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_add.setText("Add >>");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_rem.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_rem.setText("Remove <<");
        btn_rem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_remActionPerformed(evt);
            }
        });

        btn_print.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_print.setText("Print in Text File");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_read.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_read.setText("Read From Text File");
        btn_read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_readActionPerformed(evt);
            }
        });

        btn_send.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_send.setText("Send List to Admin.");
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });

        lbl_title.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("This Feature is for Helping the Class Director in Creating a List of Teaching Requirements (TR in short)");

        lbl_stdlist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_stdlist.setText("List of Standard TRs");

        lbl_applist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_applist.setText("Approved List of TRs");

        js_std.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        js_std.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jl_std.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jl_std.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "A Minimum of 2 Years Experience in Teaching or Relevant field", "Bachelor’s Degree in Teaching or Relevant field", "Completed Health Quetionnaire", "Declaration of Criminal Convictions", "Exceptional Interpersonal and Presentation Skills", "In-depth Knowledge of Teaching Methods and Legal Educational Procedures.", "Outstanding Written and Verbal Communication Skills", "Well-organized with Excellent Leadership Abilities", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jl_std.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        js_std.setViewportView(jl_std);

        js_app.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        js_app.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jl_app.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jl_app.setPreferredSize(new java.awt.Dimension(354, 152));
        js_app.setViewportView(jl_app);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(js_std, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_send)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_rem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_print, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_read, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(js_app, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lbl_stdlist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_applist)
                .addGap(149, 149, 149))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(lbl_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_stdlist)
                    .addComponent(lbl_applist))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_add)
                        .addGap(18, 18, 18)
                        .addComponent(btn_rem)
                        .addGap(18, 18, 18)
                        .addComponent(btn_print)
                        .addGap(18, 18, 18)
                        .addComponent(btn_read)
                        .addGap(18, 18, 18)
                        .addComponent(btn_send))
                    .addComponent(js_app)
                    .addComponent(js_std))
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_remActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_remActionPerformed
        // TODO add your handling code here:
        if(jl_app.getSelectedIndex() == -1){//if nothing in jl_app is selected...  
            JOptionPane.showMessageDialog(rootPane, "No Approved Teaching Requirement is Selected!", "Error...", 1) ;
        }
        else{
            //Adding selected element to jl_std and jlm_std
            String str_rem = jl_app.getSelectedValue();
            int i_rem = jl_app.getSelectedIndex();
            jlm_std.addElement(str_rem);
            jl_std.setModel(jlm_std);

            //Removing selected element from jl_app and jlm_app
            if (jlm_app.getSize() != 0){jlm_app.removeElementAt(i_rem);}
            jl_app.setModel(jlm_app);
        }        
    }//GEN-LAST:event_btn_remActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here: 
        if(jl_std.getSelectedIndex() == -1){//if nothing in jl_std is selected... 
            JOptionPane.showMessageDialog(rootPane, "No Standard Teaching Requirement is Selected!", "Error...", 1) ;
        }
        else{
            //Adding selected element to jl_app and jlm_app
            String str_add = jl_std.getSelectedValue();
            int i_add = jl_std.getSelectedIndex();
            jlm_app.addElement(str_add);
            jl_app.setModel(jlm_app);

            //Removing selected element from jl_std and jlm_std
            if (jlm_std.getSize() != 0){jlm_std.removeElementAt(i_add);}
            jl_std.setModel(jlm_std);
        }
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        // TODO add your handling code here:
        PrintWriter printer = null;
        try{
            printer = new PrintWriter("TR_List.txt");//will create the text file or overwrite it
            int i_print = jl_app.getModel().getSize();
            for (int counter = 0; counter < i_print; counter++){
                printer.println(jl_app.getModel().getElementAt(counter));
            }
            printer.close();
        }
        catch(Exception ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(rootPane, "Printing of Text File did not occur as Expected!", "Error...", 1);
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_readActionPerformed
        // TODO add your handling code here:
        ProcessBuilder read_pb = new ProcessBuilder("Notepad.exe", "TR_List.txt");//opens .txt file from project directory
        read_pb.start();
    }//GEN-LAST:event_btn_readActionPerformed

    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "The .txt File containing Teaching Requirements is ready and needs your perusal!", "Important Message for the Administrator!", 1);
    }//GEN-LAST:event_btn_sendActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(DirectorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DirectorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DirectorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DirectorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DirectorMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_read;
    private javax.swing.JButton btn_rem;
    private javax.swing.JButton btn_send;
    private javax.swing.JList<String> jl_app;
    private javax.swing.JList<String> jl_std;
    private javax.swing.JScrollPane js_app;
    private javax.swing.JScrollPane js_std;
    private javax.swing.JLabel lbl_applist;
    private javax.swing.JLabel lbl_stdlist;
    private javax.swing.JLabel lbl_title;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
