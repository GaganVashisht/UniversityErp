package Database;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Login.AdminLogin;
import Login.Home;
import Login.Main;
import Login.TeacherLogin;
import MainPage.AdministratorMainStd;
import MainPage.StudentMainPage;
import MainPage.TeacherMainPage1;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUKUL
 */
public class Otp extends javax.swing.JFrame {
 static String rollno;

public Otp(String roll) {
	rollno=roll;
	initComponents(rollno);
	  Toolkit t=getToolkit();
      Dimension size=t.getScreenSize();
      setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(String rollno) {

    	 jPanel1 = new javax.swing.JPanel();
         jPanel2 = new javax.swing.JPanel();
         jLabel2 = new javax.swing.JLabel();
         jLabel6 = new javax.swing.JLabel();
         jLabel1 = new javax.swing.JLabel();
         login_btn = new javax.swing.JButton();
         Otp2 = new javax.swing.JPasswordField();
         Otp3 = new javax.swing.JPasswordField();
         Otp1 = new javax.swing.JPasswordField();
         jLabel7 = new javax.swing.JLabel();

         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setTitle("SIGN IN SCREEN");
         setUndecorated(true);
         setResizable(false);

         jPanel1.setBackground(new java.awt.Color(255, 255, 255));
         jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
         jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

         jPanel2.setBackground(new java.awt.Color(102, 102, 102));

         jLabel2.setBackground(new java.awt.Color(255, 255, 255));
         jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
         jLabel2.setForeground(new java.awt.Color(255, 255, 255));
         jLabel2.setText("AUTHENTICATION");

         jLabel6.setBackground(new java.awt.Color(255, 255, 255));
         jLabel6.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
         jLabel6.setForeground(new java.awt.Color(255, 255, 255));
         jLabel6.setText("TWO-STEP");

        
         javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
         jPanel2.setLayout(jPanel2Layout);
         jPanel2Layout.setHorizontalGroup(
             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel2Layout.createSequentialGroup()
                 .addGap(58, 58, 58)
                 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                         .addComponent(jLabel1)
                         .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addGroup(jPanel2Layout.createSequentialGroup()
                         .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addGap(222, 222, 222))))
             .addGroup(jPanel2Layout.createSequentialGroup()
                 .addGap(27, 27, 27)
                 .addComponent(jLabel2)
                 .addGap(0, 0, Short.MAX_VALUE))
         );
         jPanel2Layout.setVerticalGroup(
             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addComponent(jLabel1)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(241, 241, 241))
         );

			/* login_btn.setBackground(new java.awt.Color(0, 204, 204)); */
         login_btn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
         login_btn.setText("CHECK");
         login_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
         login_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         login_btn.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 try {
					login_btnActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
             }
         });


         jLabel7.setBackground(new java.awt.Color(255, 255, 255));
         jLabel7.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
         jLabel7.setText("One Time Password");
         
         JButton btnNewButton = new JButton("X");
         btnNewButton.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent arg0) {
         	System.exit(0);
         	}
         });
         btnNewButton.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 12));

         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
         jPanel1Layout.setHorizontalGroup(
         	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
         		.addGroup(jPanel1Layout.createSequentialGroup()
         			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
         			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
         				.addGroup(jPanel1Layout.createSequentialGroup()
         					.addGap(410)
         					.addComponent(btnNewButton)
         					.addPreferredGap(ComponentPlacement.RELATED)
         					.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 3074, Short.MAX_VALUE))
         				.addGroup(jPanel1Layout.createSequentialGroup()
         					.addGap(127)
         					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
         						.addComponent(login_btn, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
         						.addGroup(jPanel1Layout.createSequentialGroup()
         							.addComponent(Otp1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
         							.addGap(18)
         							.addComponent(Otp2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
         					.addGap(18)
         					.addComponent(Otp3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
         			.addContainerGap())
         );
         jPanel1Layout.setVerticalGroup(
         	jPanel1Layout.createParallelGroup(Alignment.LEADING)
         		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
         		.addGroup(jPanel1Layout.createSequentialGroup()
         			.addGap(37)
         			.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
         			.addGap(49)
         			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
         				.addComponent(Otp3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
         				.addComponent(Otp2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
         				.addComponent(Otp1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
         			.addGap(123)
         			.addComponent(login_btn, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
         			.addContainerGap(49, Short.MAX_VALUE))
         		.addGroup(jPanel1Layout.createSequentialGroup()
         			.addGap(3)
         			.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
         			.addContainerGap(414, Short.MAX_VALUE))
         );
         jPanel1.setLayout(jPanel1Layout);

         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         );

         setBounds(0, 0, 828, 453);
     }// </editor-fold>                        

  
     private void cross_btnActionPerformed(java.awt.event.ActionEvent evt) throws UnknownHostException, IOException {                                          
         dispose();
         new Main().setVisible(true);
     }                                         

     private void login_btnActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {          
    	
         String r=rollno;
         
         String otp=AdminLogin.otp;
         String otp1=Home.otp;
         String otp2=TeacherLogin.otp;
     
			
			  if(Otp1.getText().length()!=1||Otp2.getText().
			  length()!=1||Otp3.getText().length()!=1) {
			  JOptionPane.showMessageDialog(new JFrame(),"otp length should  only be 3 letters long "); 
			   }else {
			 
       String otpgot=Otp1.getText()+Otp2.getText()+Otp3.getText();
     
              
     if(otpgot.equals(otp)) {
    	 JOptionPane.showMessageDialog(new JFrame(),"VERIFIED Admin Login");  
      	 new AdministratorMainStd().setVisible(true);
    	 dispose();
   }else if(otpgot.equals(otp2)) {
  	 JOptionPane.showMessageDialog(new JFrame(),"VERIFIED Faculty Login");  
  	new TeacherMainPage1().setVisible(true);
	 dispose();
}
     else  if(otpgot.equals(otp1)) {
    	 JOptionPane.showMessageDialog(new JFrame(),"VERIFIED Student Login"); 
    	 
    	 new StudentMainPage(r).setVisible(true);
    	 dispose();
    	// new Alumni_Reg().setVisible(true);
   }else {
	   JOptionPane.showMessageDialog(new JFrame(),"invalid \n TRY AGAINI");  
	   this.dispose();
	   new Otp(r).setVisible(true);
   }}
     }
     /**
      * @param args the command line arguments
      */
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
            java.util.logging.Logger.getLogger(Otp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Otp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Otp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Otp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Otp("1815663").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField Otp1;
    private javax.swing.JTextField Otp2;
    private javax.swing.JTextField Otp3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login_btn;
}
