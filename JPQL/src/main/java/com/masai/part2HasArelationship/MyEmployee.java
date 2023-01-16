package com.masai.part2HasArelationship;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "myemployee3")
public class MyEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    private String ename;
    private int salary;

    @Embedded
    @ElementCollection(fetch = FetchType.EAGER)  //fetch data from 2nd table as well without telling. By default, orm is LAZY (FetchType.LAZY) :
                                                    // will give lazyException if you try to access the address if Eager is not assign.
    @JoinTable(name = "address", joinColumns = @JoinColumn(name = "empId"))
    private Set<Address> address = new HashSet<Address>();

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "state", column = @Column(name = "home_State")),
//            @AttributeOverride(name = "city", column = @Column(name = "home_City")),
//            @AttributeOverride(name = "pincode", column = @Column(name = "home_Pincode"))
//
//    })
//    private Address homeAddress;
//
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "state", column = @Column(name = "office_State")),
//            @AttributeOverride(name = "city", column = @Column(name = "office_City")),
//            @AttributeOverride(name = "pincode", column = @Column(name = "office_Pincode"))
//
//    })
//    private Address officeAddess;

//    public Address getOfficeAddess() {
//        return officeAddess;
//    }
//
//    public void setOfficeAddess(Address officeAddess) {
//        this.officeAddess = officeAddess;
//    }
//
//    public MyEmployee(String ename, int salary, Address homeAddress, Address officeAddess) {
//        this.ename = ename;
//        this.salary = salary;
//        this.homeAddress = homeAddress;
//        this.officeAddess = officeAddess;
//    }



    public MyEmployee(String ename, int salary) {
        this.ename = ename;
        this.salary = salary;
    }

    //public Address getHomeAddress() {
    //    return homeAddress;
    //}

   // public void setHomeAddress(Address homeAddress) {
    //    this.homeAddress = homeAddress;
    //}

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "eid=" + eid +
//                ", ename='" + ename + '\'' +
//                ", salary=" + salary +
//                ", address=" + homeAddress +
//                '}';
//    }

//    public MyEmployee(int eid, String ename, int salary, Address homeAddress) {
//        this.eid = eid;
//        this.ename = ename;
//        this.salary = salary;
//        this.homeAddress = homeAddress;
//    }
//
//    public MyEmployee(String ename, int salary, Address homeAddress) {
//        this.ename = ename;
//        this.salary = salary;
//        this.homeAddress = homeAddress;
//    }

    public MyEmployee() {
    }

    public MyEmployee(int eid, String ename, int salary) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
