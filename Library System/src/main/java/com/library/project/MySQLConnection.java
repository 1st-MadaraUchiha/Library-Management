package com.library.project;

import javax.swing.*;
import java.sql.*;


public class MySQLConnection {
    Connection c;
    public Statement s;

    public MySQLConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/library_ms","root","");
            s = c.createStatement();
            this.s = s;
        }
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Check ReadMe And Initialize Database");
        }

    }
}