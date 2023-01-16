package com.assingment.day3._3Question3;

public class UsecaseMain {

    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDaoImplementation();

        //save()
        Employee emp1 = new Employee("Nitin","Saharsha",450000);
        dao.save(emp1);

        //getAddress()
        String res =  dao.getAddressOfEmployee(3);
        if(res !=null) {
            System.out.println("The Address of Employee: "+res);
        }else {
            System.out.println("Employee Not found...");
        }

        //addbonus()
        String mes = dao.giveBonusToEmployee(2, 3000);
        System.out.println(mes);

        //delete
        Boolean flag = dao.deleteEmployee(8);
        if(flag==false) {
            System.out.println("Employee does not exist..");
        }else {
            System.out.println("Employee removed Successfully..");
        }






	}









}
