package org.kitri.shoppingmall.service.master.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.master.IEmployeeDao;
import org.kitri.shoppingmall.dto.master.Employee;
import org.kitri.shoppingmall.service.master.IEmployeeSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class EmployeeSvcImpl implements IEmployeeSvc {

    /**
     * Default constructor
     */
    public EmployeeSvcImpl() {
    }

    /**
     * 
     */
    @Autowired
    private IEmployeeDao employeeDao;

    /**
     * @param employee 
     * @return
     */
    @Override
    public int regEmployee(Employee employee) {
        // TODO implement here
        return 0;
    }

    /**
     * @param employee 
     * @return
     */
    @Override
    public int updateEmployee(Employee employee) {
        // TODO implement here
        return 0;
    }

    /**
     * @param employeeid 
     * @return
     */
    @Override
    public Employee getMyInfo(String employeeid) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Employee> getEmployeeList() {
        // TODO implement here
        return null;
    }

    /**
     * @param employeeid 
     * @return
     */
    @Override
    public Employee getEmployeeDetails(String employeeid) {
        // TODO implement here
        return null;
    }

    /**
     * @param employeeid 
     * @return
     */
    @Override
    public Employee getEmployeeBySearch(String employeeid) {
        // TODO implement here
        return null;
    }
}