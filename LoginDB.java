/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import bussiness.Login;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author rheem
 */
public class LoginDB implements ILogin{
   private ArrayList<Login> LList;
   private File logfile;

    public LoginDB() {
        LList= new ArrayList<>();
       
       logfile=new File("C:\\Employee\\log1.txt");
    }

    @Override
    public boolean add(Login L) {
         try{
           FileWriter file =new FileWriter(logfile,true);
           String line =L.getUsername()+":"+L.getPassword()+"\n";
          file.append(line);
          file.close();
           return true;
       }catch(IOException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
        return false;
       }
    
    }

 
   

    @Override
    public ArrayList<Login> getAll() {
       ArrayList<Login> LList=new ArrayList<>();
  
        try{
            Scanner sc=new Scanner(logfile);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                String[] arr =line.split(":");
                String Username=arr[0];
                String Password=arr[1];
                Login L=new Login(Username,Password);
                LList.add(L);
            }
            sc.close();
            return LList;
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        
        }
    }

    @Override
    public Login get(String Username) {
      ArrayList<Login>Llist=getAll();
    for(Login L:Llist){
        if(L.getUsername().equals(Username)){
            return L;
        }
    }
    return null;
    
    }

    @Override
    public boolean delete(String Username) {
       try{
        ArrayList<Login> LList=getAll();
        FileWriter File=new FileWriter(logfile);
        File.write("");
        File.close();
        for(Login L: LList){
            if(L.getUsername().equals(Username)){
                LList.remove(L);
            break;
        }
        }  
        
        for(Login L1:LList){
            add(L1);
        }
        return true;
    }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            return false;
    }
    }

    @Override
    public boolean update(Login L) {
      
      try{
        ArrayList<Login> LList=getAll();
        FileWriter file =new FileWriter(logfile);
        file.write("");
        file.close();
        for(Login L1: LList){
            if(L1.getUsername().equals(L.getUsername())){
                LList.remove(L1);
                LList.add(L);
            break;
    }
            
    }
      for(Login L2:LList){
            add(L2);
        }
      return true;
   }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            return false;   
    
   }
    }
    
}