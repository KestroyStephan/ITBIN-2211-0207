package Model;

import Model.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private Connection connection;
    
     public UserDAO(Connection connection) {
        this.connection = connection;
    }

    public static boolean registerUser(String fullname, String username, String email,String password,  String contact, String role ) {
        return false;
     //To change body of generated methods, choose Tools | Templates.
    }

   

   
    public User getUserByUsername(String username) {
        User user = null;
        String query = "SELECT * FROM Users WHERE username = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    user = new User();
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    // Set other user properties as needed
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    public static boolean registerUser(User user) throws SQLException {
        String query = "INSERT INTO users (fullname, username,  password,email, contact, role) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, user.getFullName());
            stmt.setString(2, user.getUsername());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getEmail());
            stmt.setString(5, user.getContact());
            stmt.setString(6, user.getRole());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error registering user", e);
        }
    }
    
    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM users";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFullName(rs.getString("fullName"));
                user.setUsername(rs.getString("userName"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getString("role"));
                user.setContact(rs.getString("contact"));
                users.add(user);
            }
        }
        return users;
    }
    
    public void updateUser(User user) throws SQLException {
        String query = "UPDATE users SET fullName = ?, userName = ?,  password = ?, email = ?, role = ?, contact = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, user.getFullName());
            stmt.setString(2, user.getUsername());
            stmt.setString(5, user.getPassword());
            stmt.setString(4, user.getEmail());
            stmt.setString(5, user.getRole());
            stmt.setString(6, user.getContact());
            stmt.setInt(7, user.getId());
            stmt.executeUpdate();
        }
    }

     public void deleteUser(int userId) throws SQLException {
        String query = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, userId);
            stmt.executeUpdate();
        }
    }
    
     
}

