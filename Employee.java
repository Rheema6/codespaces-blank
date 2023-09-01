/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bussiness;

/**
 *
 * @author rheem
 */
public class Employee {
   private int EmpID;
   private String EmpName;
   private String EPFnumber;
     private int contact;
   private String Department;
   private String Designation;
     

    public Employee() {
    }

    public Employee(int EmpID, String EmpName, String EPFnumber,int contact,String Department, String Designation) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.EPFnumber = EPFnumber;
        this.Department = Department;
        this.Designation = Designation;
        this.contact=contact;
        
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getEPFnumber() {
        return EPFnumber;
    }

    public void setEPFnumber(String EPFnumber) {
        this.EPFnumber = EPFnumber;
    }

  
  

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
    
   
   
   
}
