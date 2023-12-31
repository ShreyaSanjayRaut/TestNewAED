/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WorkAreas.AdminRole.AdministerUserAccountsWorkResp;

import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.Profile;
import Business.SessionManager;
import Business.UserAccounts.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author kal bugrara
 */
public class AdminUserAccount extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;

 
    PersonDirectory list;
    Profile profile;

    public AdminUserAccount(PersonDirectory list, Profile profile, JPanel jp) {

        CardSequencePanel = jp;
        this.list= list;
        this.profile = profile;
    
        initComponents();
        //display user details here
         UserAccount u = SessionManager.getCurrentUser();
        String UserName = u.toString(); // Replace this with the actual faculty name
        System.out.println("list");
        System.out.println("facultyName"+u.getPersonId());
        String pID = u.getPersonId();
       
//        Person p = list.findPerson(pID);
        System.out.println("Pid  -->");
       
             System.out.println("user is  11"+profile.getPerson());
           

       displayFields();
    }



    private void displayFields() {
        
        txtFirstName.setText(profile.getPerson().getFirstName());
        txtLastName.setText(profile.getPerson().getLastName());
        txtEmail.setText(profile.getPerson().getEmail());
        txtPhoneNumber.setText(profile.getPerson().getPhoneNumber());
        
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
        Back1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Administer User Account");
        add(jLabel2);
        jLabel2.setBounds(21, 20, 550, 28);

        Back1.setText("<< Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });
        add(Back1);
        Back1.setBounds(40, 390, 100, 22);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(180, 270, 110, 22);

        jLabel3.setText("Last Name");
        add(jLabel3);
        jLabel3.setBounds(130, 160, 56, 16);

        jLabel4.setText("First Name");
        add(jLabel4);
        jLabel4.setBounds(130, 130, 57, 16);

        jLabel5.setText("Email");
        add(jLabel5);
        jLabel5.setBounds(130, 190, 70, 16);

        jLabel6.setText("Phone Number");
        add(jLabel6);
        jLabel6.setBounds(130, 220, 81, 16);
        add(txtPhoneNumber);
        txtPhoneNumber.setBounds(260, 220, 140, 22);
        add(txtFirstName);
        txtFirstName.setBounds(260, 130, 140, 22);
        add(txtLastName);
        txtLastName.setBounds(260, 160, 140, 22);
        add(txtEmail);
        txtEmail.setBounds(260, 190, 140, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        // TODO add your handling code here:
         CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);


    }//GEN-LAST:event_Back1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        UserAccount u = SessionManager.getCurrentUser();
        String facultyName = u.toString(); // Replace this with the actual faculty name
        System.out.println("facultyName"+facultyName);
        Person person = profile.getPerson();
        person.setEmail(txtEmail.getText());
        person.setFirstName(txtFirstName.getText());
        person.setLastName(txtLastName.getText());
        person.setPhoneNumber(txtPhoneNumber.getText());
        
        System.out.println("person"+person.getFirstName());
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables

}
