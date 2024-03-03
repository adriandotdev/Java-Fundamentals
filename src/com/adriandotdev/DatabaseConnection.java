package com.adriandotdev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnection {

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkncharge_v2", "root", "password");

            PreparedStatement st = conn.prepareStatement("SELECT * FROM users");

            ResultSet result = st.executeQuery();

            while (result.next()) {

                System.out.printf("%d %s %s%n", result.getInt("id"), result.getString("username"), result.getString("password"));
            }

            conn.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
