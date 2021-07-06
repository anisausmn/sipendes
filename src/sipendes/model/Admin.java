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
    private String adminUsername, adminEmail, adminPassword;
    
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
    
    private String getAdminUsername() {
        return this.adminUsername;
    }
    
    private void setAdminUsername(String newUsername) {
        this.adminUsername = newUsername;
    }
    
    private String getAdminEmail() {
        return this.adminEmail;
    }
    
    private void setAdminEmail(String newEmail) {
        this.adminEmail = newEmail;
    }
    
    private String getAdminPassword() {
        return this.adminPassword;
    }
    
    private void setAdminPassword(String newPassword) {
        this.adminPassword = newPassword;
    }
}
