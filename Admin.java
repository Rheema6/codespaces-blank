/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bussiness;

/**
 *
 * @author rheem
 */
public abstract class Admin  extends Employee{
    private int AdminID;
   private String AdminName; 

    public Admin(int AdminID, String AdminName) {
        this.AdminID = AdminID;
        this.AdminName = AdminName;
    }

    public Admin(int AdminID, String AdminName, int EmpID, String EmpName, String EPFnumber, int contact, String Department, String Designation) {
        super(EmpID, EmpName, EPFnumber, contact, Department, Designation);
        this.AdminID = AdminID;
        this.AdminName = AdminName;
    }

 

    public Admin() {
    }

    public int getAdminID() {
        return AdminID;
    }

    public void setAdminID(int AdminID) {
        this.AdminID = AdminID;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    
        
        
    }

   
