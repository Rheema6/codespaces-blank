/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data;
import bussiness.Login;
import java.util.ArrayList;
/**
 *
 * @author rheem
 */
public interface ILogin {
    boolean add(Login L);
    ArrayList<Login>getAll();
    Login get(String Username);
    boolean delete (String Username);
    boolean update(Login L);
    
}
