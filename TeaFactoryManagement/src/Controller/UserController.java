/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import Model.userDA;
import View.UserDetails;
import View.UserInterface;
import java.util.List;

/**
 *
 * @author KESTROY
 */
public class UserController {
    private UserInterface view;
    private UserDetails user;
    private userDA dao;
    
    public UserController(UserInterface view) {
        this.view = view;
        this.dao = new userDA();
    }
    
    public UserController(UserDetails user) {
        this.user = user;
        this.dao = new userDA();
    }
    
    
    
    
    public List<User> getAllUsers() throws Exception {
        return dao.getAllUsers();
    }
    
    public void updateUser(User users) throws Exception {
        dao.updateUser(users);
    }

    public void deleteUser(int id) throws Exception {
        dao.deleteUser(id);
    }

}

