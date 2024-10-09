import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class Login extends JFrame{
    public JPanel loginPanel;
    private JTextField txtUserName;
    private JTextField txtPassword;
    private JButton btnLogin;
    private JLabel lbluser;
    private JLabel lblPassword;
    private JButton btnExit;

    public Login() {
//        this.setTitle("Login Page");
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(false);
//        this.setSize(620,580);
//        this.setVisible(true);


        btnLogin.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtUserName.getText().equals("admin") && txtPassword.getText().equals("123456")){
                    MainForm mf = new MainForm();
                    mf.setContentPane(mf.tabbedPane1);
                    mf.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(btnLogin,"Error! Credentials are  incorrect.");
                }
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
            Login login = new Login();
        login.setTitle("Login Page");
        login.setContentPane(login.loginPanel);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setResizable(false);
        login.setSize(620,580);
        login.setVisible(true);
    }
}
