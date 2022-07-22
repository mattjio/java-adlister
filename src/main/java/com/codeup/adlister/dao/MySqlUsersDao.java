package com.codeup.adlister.dao;

import com.codeup.adlister.Config;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class MySqlUsersDao implements Users{
    private static Connection connection;

    public MySqlUsersDao(Config config) {
        if (connection == null) {
            try {
                DriverManager.registerDriver(new Driver());
                connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
                );
            } catch (SQLException e) {
                throw new RuntimeException("Error connecting to the database!", e);
            }
        }
    }

    @Override
    public User findByUsername(String username) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + username + "'");
            if (rs.next()) {
                return new User(
                    rs.getLong("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("email")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error finding user by username.", e);
        }
        return null;
    }

    @Override
    public Long insert(User user) {
        return null;
    }
}
