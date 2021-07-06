/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipendes;

/**
 *
 * @author fafsdasdfdfs
 */

import java.sql.SQLException;
import java.util.List;

import sipendes.model.*;
import sipendes.controller.*;

public class SiPenDes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        AdminControllerImplementation tester = new AdminControllerImplementation();
        
//        Admin adib = tester.getAllAdmin();
        
        List<Admin> testGetAllAdmin = tester.getAllAdmin();
        for (Admin testAdmin : testGetAllAdmin) {
            System.out.println( testAdmin.adminName);
            System.out.println( testAdmin.adminAddress);
            System.out.println( testAdmin.adminContact);
            System.out.println( testAdmin.adminUsername);
            System.out.println( testAdmin.adminPassword);
            System.out.println( testAdmin.adminEmail);
        }
        
    }
    
}
