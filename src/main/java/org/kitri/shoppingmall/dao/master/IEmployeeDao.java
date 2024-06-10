package org.kitri.shoppingmall.dao.master;

import java.util.List;

import org.kitri.shoppingmall.dto.master.Employee;

/**
 * 
 */
public interface IEmployeeDao {


    /**
     * @param employee 
     * @return
     */
    public int regEmployee(Employee employee);

    /**
     * @param employee 
     * @return
     */
    public int updateEmployee(Employee employee);

    /**
     * @param employeeid 
     * @return
     */
    public Employee getMyInfo(String employeeid);

    /**
     * @return
     */
    public List<Employee> getEmployeeList();

    /**
     * @param employeeid 
     * @return
     */
    public Employee getEmployeeDetails(String employeeid);

    /**
     * @param employeeid 
     * @return
     */
    public Employee getEmployeeBySearch(String employeeid);

}