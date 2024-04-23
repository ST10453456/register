
package com.mycompany.part1register;

public class UserInput {
    private String username;
    private String password;
    
    public UserInput(String username, String password){
    this.username = username;
    this.password = password;
    
    }

    UserInput() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
}
