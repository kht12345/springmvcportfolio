package org.kitri.shoppingmall.controller.master;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.kitri.shoppingmall.dto.master.Employee;
import org.kitri.shoppingmall.service.master.IEmployeeSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 
 */
@Controller
public class EmployeeCtrl {
    /**
     * 
     */
    @Autowired
    private IEmployeeSvc employeeSvc;

    @Autowired
    private HttpSession session;
    
    /**
     * @param employee 
     * @return
     */
    public int regEmployee(Employee employee) {
        // TODO implement here
        return 0;
    }

    /**
     * @param employee 
     * @return
     */
    public int updateEmployee(Employee employee) {
        // TODO implement here
        return 0;
    }

    /**
     * @param employeeid 
     * @return
     */
    public Employee getMyInfo(String employeeid) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Employee> getEmployeeList() {
        // TODO implement here
        return null;
    }

    /**
     * @param employeeid 
     * @return
     */
    public Employee getEmployeeDetails(String employeeid) {
        // TODO implement here
        return null;
    }

    /**
     * @param employeeid 
     * @return
     */
    public Employee getEmployeeBySearch(String employeeid) {
        // TODO implement here
        return null;
    }

}