// LoginForm.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFormCompany extends JFrame {
    private JTextField idField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginFormCompany() {
        setTitle("Login Form");
        setSize(400, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel idLabel = new JLabel("Company ID:");
        add(idLabel);
        idField = new JTextField();
        add(idField);

        JLabel passwordLabel = new JLabel("Password:");
        add(passwordLabel);
        passwordField = new JPasswordField();
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle login action here
                String id = idField.getText();
                String password = new String(passwordField.getPassword());
                SessionData.Company_ID = idField.getText();
                
                CompanyDashboard comdashboard = new CompanyDashboard();
        		comdashboard.setVisible(true);
                // For demonstration, just show the entered credentials
                JOptionPane.showMessageDialog(LoginFormCompany.this, "ID: " + id + "\nPassword: " + password);
            }
        });
        add(loginButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFormCompany();
    }
}