package com.assingment.day3._3Question3;

public interface EmployeeDao {

    public void save(Employee emp);
    public String getAddressOfEmployee(int empId);
    public String giveBonusToEmployee(int empId, int bonus);
    public boolean deleteEmployee(int empId);

}
