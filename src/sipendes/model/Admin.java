/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipendes.model;

/**
 *
 * @author fafsdasdfdfs
 */
public class Admin {
    int adminId;
    public String adminName, adminAddress, adminContact;
    public String adminUsername, adminEmail, adminPassword;
    
    public Admin() {
    }
    public Admin(String name, String address, String contact, String username, String email, String password) {
        this.adminName = name;
        this.adminAddress = address;
        this.adminContact = contact;
        this.adminUsername = username;
        this.adminEmail = email;
        this.adminPassword = password;
    }
    
    public int getAdminId(){
        return this.adminId;
    }
    
    public void setAdminId(int newId) {
        this.adminId = newId;
    }
    
    public String getAdminName() {
        return this.adminName;
    }
    
    public void setAdminName(String newName) {
        this.adminName = newName;
    }
    
    public String getAdminAddress() {
        return this.adminAddress;
    }
    
    public void setAdminAddress(String newAddress) {
        this.adminAddress = newAddress;
    }
    
    public String getAdminContact() {
        return this.adminContact;
    }
    
    public void setAdminContact(String newContact) {
        this.adminContact = newContact;
    }
    
    public String getAdminUsername() {
        return this.adminUsername;
    }
    
    public void setAdminUsername(String newUsername) {
        this.adminUsername = newUsername;
    }
    
    public String getAdminEmail() {
        return this.adminEmail;
    }
    
    public void setAdminEmail(String newEmail) {
        this.adminEmail = newEmail;
    }
    
    public String getAdminPassword() {
        return this.adminPassword;
    }
    
    public void setAdminPassword(String newPassword) {
        this.adminPassword = newPassword;
    }
}
