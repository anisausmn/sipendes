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
import java.sql.SQLException;
import java.util.List;

import sipendes.model.Admin;

public interface AdminController {
    public int addAdmin(Admin admin)
            throws SQLException;
    public void deleteAdmin(int id)
            throws SQLException;
    public Admin getAdmin(int id)
            throws SQLException;
    public List<Admin> getAllAdmin()
            throws SQLException;
    public void update(Admin admin)
            throws SQLException;
}
