package controller;

import Model.User;
import Model.UserDAO;

import java.sql.SQLException;

public class RegistrationController {
    public static boolean registerUser(String fullname, String username,  String password, String email, String contact, String role) {
        User user = new User();
        user.setFullName(fullname);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setContact(contact);
        user.setRole(role);
        try {
            return UserDAO.registerUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
