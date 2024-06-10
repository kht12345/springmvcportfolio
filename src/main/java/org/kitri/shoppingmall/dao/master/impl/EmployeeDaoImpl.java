package org.kitri.shoppingmall.dao.master.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.master.IEmployeeDao;
import org.kitri.shoppingmall.dto.master.Employee;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 */
@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

    /**
     * 
     */
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


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
     * 
     */
    @Override
    public Employee getEmployeeBySearch(String employeeid) {
        // TODO implement here
    	return null;
    }
}