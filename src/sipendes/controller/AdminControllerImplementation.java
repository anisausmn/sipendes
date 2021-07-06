/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipendes.controller;

/**
 *
 * @author fafsdasdfdfs
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sipendes.model.Admin;
import sipendes.tools.SQLConnection;

public class AdminControllerImplementation implements AdminController {

    static Connection con = SQLConnection.getConnection();
    
    @Override
    public int addAdmin(Admin admin) throws SQLException {
        String query = "INSERT INTO admin (name, address, contact, username, email, password) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        
        ps.setString(1, admin.getAdminName());
        ps.setString(2, admin.getAdminAddress());
        ps.setString(3, admin.getAdminContact());
        ps.setString(4, admin.getAdminUsername());
        ps.setString(5, admin.getAdminEmail());
        ps.setString(6, admin.getAdminPassword());
        
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Admin> getAllAdmin() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Admin admin) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
