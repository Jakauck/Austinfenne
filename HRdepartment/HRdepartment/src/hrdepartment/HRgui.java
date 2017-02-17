
package hrdepartment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class HRgui extends javax.swing.JFrame {

  
    public HRgui() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstName_label = new javax.swing.JLabel();
        street_label = new javax.swing.JLabel();
        telephoneNumber_label = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        ssn_label = new javax.swing.JLabel();
        hireDate_label = new javax.swing.JLabel();
        payRate_label = new javax.swing.JLabel();
        emergencyContact_label = new javax.swing.JLabel();
        emergencyContactNumber_label = new javax.swing.JLabel();
        FIRST_NAME_textField = new javax.swing.JTextField();
        LAST_NAME_textField = new javax.swing.JTextField();
        STREET_textField = new javax.swing.JTextField();
        EMERGENCY_CONTACT_NUMBER_textField = new javax.swing.JTextField();
        SSN_textField = new javax.swing.JTextField();
        HIRE_DATE_textField = new javax.swing.JTextField();
        PAY_RATE_textField = new javax.swing.JTextField();
        EMERGENCY_CONTACT_textField = new javax.swing.JTextField();
        TELEPHONE_NUMBER_textField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        POSITION_comboBox = new javax.swing.JComboBox<>();
        lastName_label = new javax.swing.JLabel();
        city_label = new javax.swing.JLabel();
        CITY_textField = new javax.swing.JTextField();
        zipCode_label = new javax.swing.JLabel();
        STATE_comboBox = new javax.swing.JComboBox<>();
        ZIP_CODE_textField = new javax.swing.JTextField();
        DOB_textField = new javax.swing.JTextField();
        EMPLOYEE_ID_textField = new javax.swing.JTextField();
        employeeID_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstName_label.setText("First Name");

        street_label.setText("Street");

        telephoneNumber_label.setText("Telephone #");

        dob_label.setText("DOB");

        ssn_label.setText("SSN");

        hireDate_label.setText("Hire date");

        payRate_label.setText("Pay rate");

        emergencyContact_label.setText("Emergency contact");

        emergencyContactNumber_label.setText("Emergency contact #");

        FIRST_NAME_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIRST_NAME_textFieldActionPerformed(evt);
            }
        });

        STREET_textField.setColumns(12);

        SSN_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSN_textFieldActionPerformed(evt);
            }
        });

        EMERGENCY_CONTACT_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMERGENCY_CONTACT_textFieldActionPerformed(evt);
            }
        });

        TELEPHONE_NUMBER_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TELEPHONE_NUMBER_textFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Street", "City", "Zip Code", "State", "SSN", "Hire Date", "Position", "Pay rate", "Telephone number", "DOB", "Emergency contact", "Emergency contact#"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        POSITION_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a position", "Receptionist", "Salesperson", "Internet Sales Person", "Manager", "Assistant Manager", "Human Resources", "Janitor", "Detailer", "Technician", "Administration", "Accountant" }));
        POSITION_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POSITION_comboBoxActionPerformed(evt);
            }
        });

        lastName_label.setText("Last Name");

        city_label.setText("City");

        CITY_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CITY_textFieldActionPerformed(evt);
            }
        });

        zipCode_label.setText("Zip code");

        STATE_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "State", "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY" }));

        ZIP_CODE_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZIP_CODE_textFieldActionPerformed(evt);
            }
        });

        EMPLOYEE_ID_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMPLOYEE_ID_textFieldActionPerformed(evt);
            }
        });

        employeeID_label.setText("Employee ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(street_label)
                    .addComponent(payRate_label))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(employeeID_label)
                        .addGap(67, 67, 67)
                        .addComponent(EMPLOYEE_ID_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firstName_label)
                        .addGap(35, 35, 35)
                        .addComponent(FIRST_NAME_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(lastName_label)
                        .addGap(100, 100, 100)
                        .addComponent(LAST_NAME_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PAY_RATE_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(STREET_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(city_label)
                                .addGap(84, 84, 84)
                                .addComponent(CITY_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ssn_label)
                        .addGap(31, 31, 31)
                        .addComponent(SSN_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306)
                        .addComponent(hireDate_label)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(163, 163, 163)
                                        .addComponent(zipCode_label)
                                        .addGap(93, 93, 93)
                                        .addComponent(ZIP_CODE_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(STATE_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(172, 172, 172))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(HIRE_DATE_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(210, 210, 210)
                                        .addComponent(POSITION_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(245, 245, 245))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TELEPHONE_NUMBER_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dob_label)
                                .addGap(50, 50, 50)
                                .addComponent(DOB_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(313, 313, 313))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emergencyContact_label)
                        .addGap(39, 39, 39)
                        .addComponent(EMERGENCY_CONTACT_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(emergencyContactNumber_label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telephoneNumber_label)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(99, 99, 99)
                                .addComponent(jButton3)))))
                .addGap(54, 54, 54)
                .addComponent(EMERGENCY_CONTACT_NUMBER_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(street_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STREET_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CITY_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipCode_label)
                            .addComponent(ZIP_CODE_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STATE_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hireDate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SSN_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssn_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HIRE_DATE_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(POSITION_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstName_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FIRST_NAME_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastName_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LAST_NAME_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EMPLOYEE_ID_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeID_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(payRate_label)
                            .addComponent(PAY_RATE_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephoneNumber_label)
                            .addComponent(TELEPHONE_NUMBER_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dob_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOB_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emergencyContact_label, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emergencyContactNumber_label)
                    .addComponent(EMERGENCY_CONTACT_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EMERGENCY_CONTACT_NUMBER_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FIRST_NAME_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIRST_NAME_textFieldActionPerformed
    }//GEN-LAST:event_FIRST_NAME_textFieldActionPerformed

    private void SSN_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSN_textFieldActionPerformed
    }//GEN-LAST:event_SSN_textFieldActionPerformed
//exits out of gui
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    //clears text fields in gui
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EMPLOYEE_ID_textField.setText("");
        FIRST_NAME_textField.setText("");
        LAST_NAME_textField.setText("");
        STREET_textField.setText("");
        CITY_textField.setText("");
        ZIP_CODE_textField.setText("");
        SSN_textField.setText("");
        HIRE_DATE_textField.setText("");
        PAY_RATE_textField.setText("");
        TELEPHONE_NUMBER_textField.setText("");
        DOB_textField.setText("");
        EMERGENCY_CONTACT_textField.setText("");
        EMERGENCY_CONTACT_NUMBER_textField.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    //submit button and inserts into database
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                
        String query="INSERT INTO TABLES (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,STREET,CITY,ZIP_CODE,STATE,SSN,HIRE_DATE,POSITION,PAY_RATE,TELEPHONE_NUMBER,DOB,EMERGENCY_CONTACT,EMERGENCY_CONTACT_NUMBER) VALUES (" +
        " ' " + EMPLOYEE_ID_textField.getText() + " '," +
        " ' " + FIRST_NAME_textField.getText() + " '," +
        " ' " + LAST_NAME_textField.getText() + " ',"+
        " ' " + STREET_textField.getText() + " ',"+
        " ' " + CITY_textField.getText() + " ',"+
        " ' " + ZIP_CODE_textField.getText() + " ',"+
        " ' " + STATE_comboBox.getSelectedItem() + " ',"+
        " ' " + SSN_textField.getText() + " ',"+
        " ' " + HIRE_DATE_textField.getText() + " ',"+
        " ' " + POSITION_comboBox.getSelectedItem() + " ',"+
        " ' " + PAY_RATE_textField.getText() + " ',"+
        " ' " + TELEPHONE_NUMBER_textField.getText() + " ',"+
        " ' " + DOB_textField.getText() + " ',"+
        " ' " + EMERGENCY_CONTACT_textField.getText() + " ',"+
        " ' " + EMERGENCY_CONTACT_NUMBER_textField.getText() + " ');";

            insertStatement(query);

//table that displays in gui
DefaultTableModel model=(DefaultTableModel) jTable1.getModel();

model.addRow(new Object[]{
    EMPLOYEE_ID_textField.getText(),
    FIRST_NAME_textField.getText(),
    LAST_NAME_textField.getText(),
    STREET_textField.getText(),
    CITY_textField.getText(),
    ZIP_CODE_textField.getText(),
    STATE_comboBox.getSelectedItem(),
    SSN_textField.getText(),
    HIRE_DATE_textField.getText(),
    POSITION_comboBox.getSelectedItem(),
    PAY_RATE_textField.getText(),
    TELEPHONE_NUMBER_textField.getText(),
    DOB_textField.getText(),
    EMERGENCY_CONTACT_textField.getText(),
   EMERGENCY_CONTACT_NUMBER_textField.getText(),});

    }//GEN-LAST:event_jButton1ActionPerformed

    private void TELEPHONE_NUMBER_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TELEPHONE_NUMBER_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TELEPHONE_NUMBER_textFieldActionPerformed

    private void POSITION_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POSITION_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_POSITION_comboBoxActionPerformed

    private void CITY_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CITY_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CITY_textFieldActionPerformed

    private void EMERGENCY_CONTACT_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMERGENCY_CONTACT_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMERGENCY_CONTACT_textFieldActionPerformed

    private void ZIP_CODE_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZIP_CODE_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZIP_CODE_textFieldActionPerformed

    private void EMPLOYEE_ID_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMPLOYEE_ID_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMPLOYEE_ID_textFieldActionPerformed

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
            java.util.logging.Logger.getLogger(HRgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRgui().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CITY_textField;
    private javax.swing.JTextField DOB_textField;
    private javax.swing.JTextField EMERGENCY_CONTACT_NUMBER_textField;
    private javax.swing.JTextField EMERGENCY_CONTACT_textField;
    private javax.swing.JTextField EMPLOYEE_ID_textField;
    private javax.swing.JTextField FIRST_NAME_textField;
    private javax.swing.JTextField HIRE_DATE_textField;
    private javax.swing.JTextField LAST_NAME_textField;
    private javax.swing.JTextField PAY_RATE_textField;
    private javax.swing.JComboBox<String> POSITION_comboBox;
    private javax.swing.JTextField SSN_textField;
    private javax.swing.JComboBox<String> STATE_comboBox;
    private javax.swing.JTextField STREET_textField;
    private javax.swing.JTextField TELEPHONE_NUMBER_textField;
    private javax.swing.JTextField ZIP_CODE_textField;
    private javax.swing.JLabel city_label;
    private javax.swing.JLabel dob_label;
    private javax.swing.JLabel emergencyContactNumber_label;
    private javax.swing.JLabel emergencyContact_label;
    private javax.swing.JLabel employeeID_label;
    private javax.swing.JLabel firstName_label;
    private javax.swing.JLabel hireDate_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lastName_label;
    private javax.swing.JLabel payRate_label;
    private javax.swing.JLabel ssn_label;
    private javax.swing.JLabel street_label;
    private javax.swing.JLabel telephoneNumber_label;
    private javax.swing.JLabel zipCode_label;
    // End of variables declaration//GEN-END:variables
//database
    private void insertStatement(String insert_query)
    {
    Connection c=null;
    Statement stmt=null;
    try{
    Class.forName("org.sqlite.JDBC");
    c=DriverManager.getConnection("jdbc:sqlite:HR.db");
    c.setAutoCommit(false);
    stmt=c.createStatement();
    stmt.executeUpdate(insert_query);
    stmt.close();
    c.commit();
    c.close();
    
}
    catch(Exception e){
    System.err.println(e.getClass().getName() + ": " + e.getMessage());
  
    }
    }


}
