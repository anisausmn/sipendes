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
    public void deleteAdmin(int id) throws SQLException {
        String query = "DELETE FROM admin WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        
        ps.setInt(1, id);
        ps.executeUpdate();
    }
    
    @Override
    public Admin getAdmin(int id) throws SQLException {
        String query = "SELECT * FROM admin WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        
        ps.setInt(1, id);
        
        Admin admin = new Admin();
        ResultSet rs = ps.executeQuery();
        boolean check = false;
        
        while (rs.next()) {
            check = true;
            admin.setAdminId(rs.getInt("id"));
            admin.setAdminName(rs.getString("name"));
            admin.setAdminAddress(rs.getString("address"));
            admin.setAdminContact(rs.getString("contact"));
            admin.setAdminUsername(rs.getString("username"));
            admin.setAdminEmail(rs.getString("email"));
            // TODO: change password to hasshed password
            admin.setAdminPassword(rs.getString("password"));
        }
        
        if (check == true) {
            return admin;
        } else {
            return null;
        }
    }

    @Override
    public List<Admin> getAllAdmin() throws SQLException {
        String query = "SELECT * FROM admin";
        PreparedStatement ps = con.prepareStatement(query);
        
        ResultSet rs = ps.executeQuery();
        List<Admin> listAdmin = new ArrayList();
        
        while (rs.next()) {
            Admin admin = new Admin();
            
            admin.setAdminId(rs.getInt("id"));
            admin.setAdminName(rs.getString("name"));
            admin.setAdminAddress(rs.getString("address"));
            admin.setAdminContact(rs.getString("contact"));
            admin.setAdminUsername(rs.getString("username"));
            admin.setAdminEmail(rs.getString("email"));
            // TODO: change password to hasshed password
            admin.setAdminPassword(rs.getString("password"));
            listAdmin.add(admin);
        }
        return listAdmin;
    }

    @Override
    public void update(Admin admin) throws SQLException {
        String query = "UPDATE admin SET ";
        String querySetName = "name = ?, ";
        String querySetAddress = "address = ?, ";
        String querySetContact = "contact = ?,  ";
        String querySetUsername = "username = ?, ";
        String querySetEmail = "email = ?, ";
        String querySetPassword = "password = ?, ";
        String queryWhereId = "WHERE id = ?, ";
        
        query = query + querySetName + querySetAddress + querySetContact + querySetUsername + querySetEmail + querySetPassword + queryWhereId;
        PreparedStatement ps = con.prepareStatement(query);
        
        ps.setString(1, admin.getAdminName());
        ps.setString(2, admin.getAdminAddress());
        ps.setString(3, admin.getAdminContact());
        ps.setString(4, admin.getAdminUsername());
        ps.setString(5, admin.getAdminEmail());
        ps.setString(6, admin.getAdminPassword());
        ps.executeUpdate();
    }
    
}
