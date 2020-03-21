/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Dell
 */
public class User {
    
   private String user;
   private String phno;
   private String role;

   
    public User(String user, String phno, String role) {
        this.phno=phno;
        this.user=user;
        this.role=role;
    }
   
   
   
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
   
   
 
}

