/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KESTROY
 */
public class userDA {
    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        Connection con = DatabaseConnection.getConnection();
        String query = "SELECT * FROM users";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
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
        
        return users;
    }
    
    public void updateUser(User user) throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        String query = "UPDATE users SET fullName = ?, userName = ?, email = ?, password = ?, role = ?, contact = ? WHERE id = ?";
        PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, user.getFullName());
            pst.setString(2, user.getUsername());
            pst.setString(3, user.getEmail());
            pst.setString(4, user.getPassword());
            pst.setString(5, user.getRole());
            pst.setString(6, user.getContact());
            pst.setInt(7, user.getId());
            pst.executeUpdate();
        }
    
     public void deleteUser(int userId) throws SQLException {
        Connection con = DatabaseConnection.getConnection();
         String query = "DELETE FROM users WHERE id = ?";
        PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, userId);
            pst.executeUpdate();
        }
}
