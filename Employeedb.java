/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import bussiness.Employee;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author rheem
 */
public class Employeedb implements IEmployee {
   private ArrayList<Employee> EList;
   private File myfile;

    public Employeedb() {
      EList= new ArrayList<>();
       
       myfile=new File("C:\\Employee\\Employee.txt");
    }

    @Override
    public boolean add(Employee E) {
       try{
           FileWriter file =new FileWriter(myfile,true);
           String line =E.getEmpID()+":"+E.getEmpName()+":"+E.getEPFnumber()+":"+E.getContact()+":"+E.getDepartment()+":"+E.getDesignation()+"\n";
          file.append(line);
          file.close();
           return true;
       }catch(IOException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
        return false;
       
       }
     
    }



    @Override
    public ArrayList<Employee> getAll() {
          ArrayList<Employee> EList=new ArrayList<>();
  
        try{
            Scanner sc=new Scanner(myfile);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                String[] ary =line.split(":");
                int EmpID=Integer.valueOf(ary[0]);
                String EmpName=ary[1];
                String EPFnumber=ary[2];
                int contact=Integer.valueOf(ary[3]);
                String Department=ary[4];
                String Designation=ary[5];
               // Employee E=new(EmpID,EmpName,EPFnumber,contact,Department,Designation);
                Employee E=new Employee(EmpID,EmpName,EPFnumber,contact,Department,Designation);
                EList.add(E);
            }
            sc.close();
            return EList;
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
                

                
            }
       
    }
   
    @Override
    public Employee search(int EmployeeID) {
    ArrayList<Employee>Elist=getAll();
    for(Employee E:Elist){
        if(E.getEmpID()==EmployeeID){
            return E;
        }
    }
    return null;
    }

    @Override
    public boolean delete(int EmployeeID) {
        try{
        ArrayList<Employee> EList=getAll();
        FileWriter file1 =new FileWriter(myfile);
        file1.write("");
        file1.close();
        for(Employee E: EList){
            if(E.getEmpID()==EmployeeID){
                EList.remove(E);
            break;
        }
        }  
        
        for(Employee E1:EList){
            add(E1);
        }
        return true;
   }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            return false;
                

                
}
}

    @Override
    public boolean update(Employee E) {
     
      try{
        ArrayList<Employee> EList=getAll();
        FileWriter file1 =new FileWriter(myfile);
        file1.write("");
        file1.close();
        for(Employee E1: EList){
            if(E1.getEmpID()==E.getEmpID()){
                EList.remove(E1);
                EList.add(E);
            break;
    }
            
    }
      for(Employee E2:EList){
            add(E2);
        }
      return true;
   }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            return false;   
    
   }
}
}





    