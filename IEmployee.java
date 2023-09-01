/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data;
import bussiness.Employee;
import java.util.ArrayList;


/**
 *
 * @author rheem
 */
public interface IEmployee {
    boolean add(Employee E);
    ArrayList<Employee>getAll();
    Employee search(int EmployeeID);
    boolean delete (int  EmployeeID);
    boolean update(Employee E);
}
