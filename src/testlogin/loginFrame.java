package testlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Hiro
 */
public class loginFrame extends javax.swing.JFrame {

    /** Creates new form loginFrame */
    public loginFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        Userlb = new javax.swing.JLabel();
        Passlb = new javax.swing.JLabel();
        Logolb = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JPasswordField();
        lgbt = new javax.swing.JButton();
        Exbt = new javax.swing.JButton();
        cbt = new javax.swing.JButton();
        lb_pass = new javax.swing.JLabel();
        lb_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Petfriends Library Management System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb1.setFont(new java.awt.Font("Trebuchet MS", 3, 48));
        lb1.setForeground(new java.awt.Color(255, 153, 0));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("Petfriends Library Book");
        lb1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 129, 540, 69));

        Userlb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testlogin/UserIcon.png"))); // NOI18N
        Userlb.setMaximumSize(new java.awt.Dimension(60, 68));
        Userlb.setMinimumSize(new java.awt.Dimension(60, 68));
        Userlb.setPreferredSize(new java.awt.Dimension(60, 68));
        jPanel1.add(Userlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 42, 48));

        Passlb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testlogin/PassIcon.png"))); // NOI18N
        jPanel1.add(Passlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        Logolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logolb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testlogin/LogoPF.png"))); // NOI18N
        Logolb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Logolb, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 18, 274, -1));

        txt1.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 102, 0));
        txt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1KeyReleased(evt);
            }
        });
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 350, 35));

        txt2.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 102, 0));
        txt2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2KeyReleased(evt);
            }
        });
        jPanel1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 350, 35));

        lgbt.setBackground(new java.awt.Color(255, 153, 0));
        lgbt.setFont(new java.awt.Font("Trebuchet MS", 3, 28)); // NOI18N
        lgbt.setForeground(new java.awt.Color(255, 255, 255));
        lgbt.setText("Login");
        lgbt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lgbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgbtActionPerformed(evt);
            }
        });
        jPanel1.add(lgbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 105, 37));

        Exbt.setBackground(new java.awt.Color(255, 153, 0));
        Exbt.setFont(new java.awt.Font("Trebuchet MS", 3, 28)); // NOI18N
        Exbt.setForeground(new java.awt.Color(255, 255, 255));
        Exbt.setText("Exit");
        Exbt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Exbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExbtActionPerformed(evt);
            }
        });
        jPanel1.add(Exbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 112, 37));

        cbt.setBackground(new java.awt.Color(255, 153, 0));
        cbt.setFont(new java.awt.Font("Trebuchet MS", 3, 28));
        cbt.setForeground(new java.awt.Color(255, 255, 255));
        cbt.setText("Reset");
        cbt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtActionPerformed(evt);
            }
        });
        jPanel1.add(cbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 112, 37));
        jPanel1.add(lb_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 350, 20));
        jPanel1.add(lb_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 350, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-593)/2, (screenSize.height-469)/2, 593, 469);
    }// </editor-fold>//GEN-END:initComponents

    private void ExbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExbtActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_ExbtActionPerformed

    private void cbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtActionPerformed
        txt1.setText("");
        txt2.setText("");
    }//GEN-LAST:event_cbtActionPerformed

    private void lgbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgbtActionPerformed

        if (txt1.getText().trim().isEmpty() && txt2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อหรือรหัสผ่านผู้ใช้ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txt1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อหรือรหัสผ่านผู้ใช้ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txt2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อหรือรหัสผ่านผู้ใช้ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
                String sql = "Select * from logindatabase where username=? and password=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, txt1.getText());
                pst.setString(2, txt2.getText());
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Petfriends Library Book ยินดีต้อนรับ");
                    this.dispose();
                    new mainMenu().show();

                } else {
                    JOptionPane.showMessageDialog(null, "ชื่อและรหัสผ่านไม่ถูกต้อง", "error!!", JOptionPane.ERROR_MESSAGE);
                    txt1.setText("");
                    txt2.setText("");
                }
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_lgbtActionPerformed

    private void txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyReleased
    //ไม่ใช้งาน ใช้ JOptionPane แทน
    }//GEN-LAST:event_txt1KeyReleased

    private void txt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyReleased
    //ไม่ใช้งาน ใช้ JOptionPane แทน
    }//GEN-LAST:event_txt2KeyReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exbt;
    private javax.swing.JLabel Logolb;
    private javax.swing.JLabel Passlb;
    private javax.swing.JLabel Userlb;
    private javax.swing.JButton cbt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb_pass;
    private javax.swing.JLabel lb_user;
    private javax.swing.JButton lgbt;
    private javax.swing.JTextField txt1;
    private javax.swing.JPasswordField txt2;
    // End of variables declaration//GEN-END:variables
}
