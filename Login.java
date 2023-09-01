/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bussiness;

/**
 *
 * @author rheem
 */
public class Login {
    private String Username;
    private String Password;
    //private String name;

    public Login(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
        //this.name = name;
    }

    public Login() {
    }

   /* public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    */

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
