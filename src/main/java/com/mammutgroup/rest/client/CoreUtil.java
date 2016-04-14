package com.mammutgroup.rest.client;

import com.mammutgroup.workshop.common.core.model.dto.EmployeeDto;

/**
 * @author mushtu
 * @since 4/14/16.
 */
public class CoreUtil {

    public static EmployeeDto createEmployee()
    {
        EmployeeDto employee = new EmployeeDto();
        employee.setFirstName("mojtaba");
        employee.setLastName("yazdani");
        employee.setUsername("m.yazdani");
        employee.setPassword("1234");
        employee.setEnabled(true);
        employee.setMobileNumber("09198145870");
        return employee;
    }
}
