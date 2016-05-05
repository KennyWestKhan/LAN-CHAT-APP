package appPackages;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import pitchtalk1.pkg1.DBConnection;
import appPackages.DeleteCred;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;


public class Credentials extends javax.swing.JFrame {
    DBConnection con = new DBConnection();


    /**
     * Creates new form Credentials
     */
    public Credentials() {
        initComponents();
        this.setTitle("Create Credentials");
//        this.setSize(560, 340);
        this.getContentPane().setBackground(Color.WHITE);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        tfName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStudent = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtPassword1 = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        uploadButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        selfieButton = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        path = new javax.swing.JTextField();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nickname:");

        jLabel2.setText("Password:");

        jLabel3.setText("Position:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose", "Senior Lecturer", "Teaching Assistant", "Student" }));
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Student Number:");

        txtStudent.setAutoscrolls(false);
        txtStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentActionPerformed(evt);
            }
        });
        txtStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStudentKeyTyped(evt);
            }
        });

        jLabel5.setText("Repeat Password:");

        jButton1.setText("Reset");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Gender");

        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Display");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        selfieButton.setText("Take Selfie");

        path.setEditable(false);
        path.setText("File path");
        path.setAutoscrolls(false);
        path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathActionPerformed(evt);
            }
        });
        path.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pathKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(path)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(uploadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selfieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadButton)
                    .addComponent(jButton2)
                    .addComponent(selfieButton))
                .addGap(4, 4, 4))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(38, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton3))
                                .addComponent(txtStudent, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfName)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtStudent.setEditable(true);
            jLabel4.setEnabled(true);
        txtStudent.setText("");
        txtPassword1.setText("");
        txtPassword.setText("");
        tfName.setText("");
        jComboBox1.setSelectedItem("Choose");
        tfName.requestFocus();
        txtPassword.setBackground(Color.white);
                txtPassword1.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
//        Home home = new Home();
        new HomeBrowse().show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem() != "Student" && jComboBox1.getSelectedItem() != "Choose"){
            txtStudent.setEditable(false);
            jLabel4.setEnabled(false);            
        }else{
            jLabel4.setEnabled(true);
            txtStudent.setEditable(true);
        }
    }//GEN-LAST:event_jComboBox1FocusLost

    private void txtStudentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStudentKeyTyped
        // TODO add your handling code here:
        char c= evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || c==KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_txtStudentKeyTyped

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        gender="male";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        gender="male";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1FocusGained

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        if(path.getText().trim() == "File path")
        {
          JOptionPane.showMessageDialog(null, "UPLOAD FILE FIRST", "WARNING!", JOptionPane.WARNING_MESSAGE);
        } else {
            String url = "jdbc:mysql://localhost/users";
        String user = "root";
        String password = "";
        try{
            if((tfName.getText().isEmpty()) ||(txtPassword.getText().isEmpty()) || (txtPassword.getText().isEmpty()) || gender.isEmpty()){
                JOptionPane.showMessageDialog(this, "Please ensure all fields are filled ");      
            }else{
            if(txtPassword.getText().equals(txtPassword1.getText())){
                Connection myConn = DriverManager.getConnection(url, user, password); 
                Statement myStmt = myConn.createStatement();
                String query = "insert into login (Nickname, Password, Position,StudentNumber, Gender,image)"
                        +"values(?,?,?,?,?,?)";
                PreparedStatement preparedStmt = myConn.prepareStatement(query);
                preparedStmt.setString(1, tfName.getText());
                preparedStmt.setString(2, txtPassword1.getText());
            preparedStmt.setString(3, (String) jComboBox1.getSelectedItem());
            preparedStmt.setString(4, txtStudent.getText());
            preparedStmt.setString(5, gender);
            preparedStmt.setBytes(6, person_image);
            
                preparedStmt.execute();
                System.out.println("Saved");
                this.hide();
                JOptionPane.showMessageDialog(this, "Welcome "+tfName.getText()+"! ,"+" log in now with your credentials", "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new Home().show();
            }
            else{
                JOptionPane.showMessageDialog(this, "Password not matching");
                txtPassword.setBackground(Color.red);
                txtPassword1.setBackground(Color.red);
                txtPassword.requestFocus();
            }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "SELECT GENDER OR "+" CHECK CONNECTION WITH DATABASE", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_jButton5ActionPerformed
//String sql ="select image from login where Nickname = '" + appPackages.DeleteCred.tfName2.getText()+"'" ;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            if (tfName.getText().isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "NO PROFILE!", "WARNING!", JOptionPane.WARNING_MESSAGE);
        }else{
        try {
            String sql ="select image from login where Nickname = '" + appPackages.DeleteCred.tfName2.getText()+"'" ;
            con.pst=con.mycon.prepareStatement(sql);
            con.rs=con.pst.executeQuery();
            if(con.rs.next()){
                byte[]imagedata = con.rs.getBytes("image");
                format = new ImageIcon(imagedata);
                image.setIcon(format);

            }
        } catch (Exception e) {
            {
                e.printStackTrace();
            }
        }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        path.setText(filename);
        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte [1024];
            for(int readNum; (readNum = fis.read(buf))!=-1 ;){
                bos.write(buf,0,readNum);
            }
        person_image=bos.toByteArray();    
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathActionPerformed

    private void pathKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pathKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pathKeyTyped

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Credentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Credentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Credentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Credentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Credentials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField path;
    private javax.swing.JButton selfieButton;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JTextField txtStudent;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
private String gender;
private ImageIcon format = null;
String filename = null;
int s=0;
byte[] person_image = null;
}
