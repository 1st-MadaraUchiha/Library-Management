/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.library.jframe;

import com.library.project.MySQLConnection;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author acer
 */
public class ReturnBook extends javax.swing.JFrame {

    MySQLConnection con;
    private int bookId;
    private int studentId;
    /**
     * Creates new form IssueBook
     */
    public ReturnBook() throws SQLException {
        initComponents();
        con = new MySQLConnection();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bookid_text1 = new app.bolivia.swing.JCTextField();
        issueDate_lbl = new app.bolivia.swing.JCTextField();
        bookName_lbl = new app.bolivia.swing.JCTextField();
        studentName_lbl = new app.bolivia.swing.JCTextField();
        issueID_lbl = new app.bolivia.swing.JCTextField();
        dueDate_lbl = new app.bolivia.swing.JCTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        bookId_text = new app.bolivia.swing.JCTextField();
        jLabel24 = new javax.swing.JLabel();
        studentId_text = new app.bolivia.swing.JCTextField();
        Find_button = new rojerusan.RSMaterialButtonCircle();
        return_botton = new rojerusan.RSMaterialButtonCircle();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(251, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Literature_100px_1.png")));
        jLabel1.setText("      Book Details");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Issue ID");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Book Name");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setText("Student Name");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setText("Issue Date");

        bookid_text1.setBackground(new java.awt.Color(102, 102, 255));
        bookid_text1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        bookid_text1.setForeground(new java.awt.Color(204, 204, 204));
        bookid_text1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bookid_text1.setPhColor(new java.awt.Color(255, 255, 255));
        bookid_text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookid_text1ActionPerformed(evt);
            }
        });

        issueDate_lbl.setBackground(new java.awt.Color(102, 102, 255));
        issueDate_lbl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        issueDate_lbl.setForeground(new java.awt.Color(255, 255, 255));
        issueDate_lbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        issueDate_lbl.setPhColor(new java.awt.Color(255, 255, 255));
        issueDate_lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueDate_lblActionPerformed(evt);
            }
        });

        bookName_lbl.setBackground(new java.awt.Color(102, 102, 255));
        bookName_lbl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        bookName_lbl.setForeground(new java.awt.Color(255, 255, 255));
        bookName_lbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bookName_lbl.setPhColor(new java.awt.Color(255, 255, 255));
        bookName_lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookName_lblActionPerformed(evt);
            }
        });

        studentName_lbl.setBackground(new java.awt.Color(102, 102, 255));
        studentName_lbl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        studentName_lbl.setForeground(new java.awt.Color(255, 255, 255));
        studentName_lbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        studentName_lbl.setPhColor(new java.awt.Color(255, 255, 255));
        studentName_lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentName_lblActionPerformed(evt);
            }
        });

        issueID_lbl.setBackground(new java.awt.Color(102, 102, 255));
        issueID_lbl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        issueID_lbl.setForeground(new java.awt.Color(255, 255, 255));
        issueID_lbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        issueID_lbl.setPhColor(new java.awt.Color(255, 255, 255));
        issueID_lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueID_lblActionPerformed(evt);
            }
        });

        dueDate_lbl.setBackground(new java.awt.Color(102, 102, 255));
        dueDate_lbl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        dueDate_lbl.setForeground(new java.awt.Color(255, 255, 255));
        dueDate_lbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dueDate_lbl.setPhColor(new java.awt.Color(255, 255, 255));
        dueDate_lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dueDate_lblActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setText("Due Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(issueID_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                            .addComponent(bookName_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(studentName_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dueDate_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(issueDate_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(bookid_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(75, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issueID_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookName_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentName_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issueDate_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dueDate_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(bookid_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(293, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 353, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(251, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Books_52px_1.png")));
        jLabel4.setText("       Return Book");

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(251, 51, 51));
        jLabel23.setText("Book Id");

        bookId_text.setBackground(new java.awt.Color(251, 51, 51));
        bookId_text.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        bookId_text.setForeground(new java.awt.Color(255, 255, 255));
        bookId_text.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bookId_text.setPhColor(new java.awt.Color(102, 102, 255));
        bookId_text.setPlaceholder("Enter Book Id...");
        bookId_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bookId_textFocusLost(evt);
            }
        });
        bookId_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookId_textActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(251, 51, 51));
        jLabel24.setText("Student ID");

        studentId_text.setBackground(new java.awt.Color(251, 51, 51));
        studentId_text.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        studentId_text.setForeground(new java.awt.Color(255, 255, 255));
        studentId_text.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        studentId_text.setPhColor(new java.awt.Color(102, 102, 255));
        studentId_text.setPlaceholder("Enter Student ID");
        studentId_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                studentId_textFocusLost(evt);
            }
        });
        studentId_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentId_textActionPerformed(evt);
            }
        });

        Find_button.setBackground(new java.awt.Color(255, 51, 102));
        Find_button.setText("Find");
        Find_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Find_buttonMouseReleased(evt);
            }
        });

        return_botton.setBackground(new java.awt.Color(255, 51, 102));
        return_botton.setText("Return Book");
        return_botton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                return_bottonMouseReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bookId_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(studentId_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53))))
                    .addComponent(Find_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(return_botton, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addGap(55, 55, 55)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookId_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentId_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(Find_button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(432, Short.MAX_VALUE)
                    .addComponent(return_botton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(106, 106, 106)))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Rewind_48px.png")));
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library-2.png")));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 88, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 585));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        this.setVisible(false);
        new HomePage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseReleased

    private void bookid_text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookid_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookid_text1ActionPerformed

    private void issueDate_lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueDate_lblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueDate_lblActionPerformed

    private void bookName_lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookName_lblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookName_lblActionPerformed

    private void studentName_lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentName_lblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentName_lblActionPerformed

    private void issueID_lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueID_lblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueID_lblActionPerformed

    private void bookId_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookId_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookId_textActionPerformed

    private void studentId_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentId_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentId_textActionPerformed

    private void studentId_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentId_textFocusLost
      
        // TODO add your handling code here:
    }//GEN-LAST:event_studentId_textFocusLost

    private void bookId_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookId_textFocusLost

        // TODO add your handling code here:
    }//GEN-LAST:event_bookId_textFocusLost

    private void Find_buttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Find_buttonMouseReleased
    setDetails();
        // TODO add your handling code here:
    }//GEN-LAST:event_Find_buttonMouseReleased

    private void return_bottonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_bottonMouseReleased
        if(setDetails()){
            try{
                String book = "returned";
                String statuss = "pending";
                con.s.executeUpdate("update issue_book_details set status='"+book+"' where book_id='"+bookId+"' and student_id='"+studentId+"' and status='"+statuss+"'");
                bookCount();
                JOptionPane.showMessageDialog(null,"Book Has Been Returned");
            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Failed To Return Book");
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_return_bottonMouseReleased

    private void dueDate_lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dueDate_lblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dueDate_lblActionPerformed

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseReleased

   

    public void bookCount(){

        bookId = Integer.parseInt(bookId_text.getText());
        try {
            con.s.executeUpdate("update book_details set quantity= quantity + 1 where book_id ='"+bookId+"'");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ReturnBook().setVisible(true);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }
   
 private boolean setDetails(){
     boolean bookreturn = false;
     bookId = Integer.parseInt(bookId_text.getText());
     studentId = Integer.parseInt(studentId_text.getText());
   try{
       ResultSet rs = con.s.executeQuery("select * from issue_book_details where book_id='"+bookId+"' and student_id='"+studentId+"' and status='pending'");
       if(rs.next()){
              issueID_lbl.setText(rs.getString("id"));
              bookName_lbl.setText(rs.getString("book_name"));
              studentName_lbl.setText(rs.getString("student_name"));
              issueDate_lbl.setText(rs.getString("issue_date"));
              dueDate_lbl.setText(rs.getString("due_date"));
              bookreturn = true;
       }
       else if (!rs.next()){
           JOptionPane.showMessageDialog(null,"Couldn't find data in database with provided details");
       }
   }
   catch(Exception e){
       e.printStackTrace();
   }
   return bookreturn;
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle Find_button;
    private app.bolivia.swing.JCTextField bookId_text;
    private app.bolivia.swing.JCTextField bookName_lbl;
    private app.bolivia.swing.JCTextField bookid_text1;
    private app.bolivia.swing.JCTextField dueDate_lbl;
    private app.bolivia.swing.JCTextField issueDate_lbl;
    private app.bolivia.swing.JCTextField issueID_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private rojerusan.RSMaterialButtonCircle return_botton;
    private app.bolivia.swing.JCTextField studentId_text;
    private app.bolivia.swing.JCTextField studentName_lbl;
    // End of variables declaration//GEN-END:variables
}
