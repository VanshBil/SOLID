package net.media.training.live.srp;



public class Employee {
    private int empId;


    private double monthlySalary;
    private String name;
    private Address address;

    private String manager;
    private Leaves leaves;

    // Getters
    public int getEmpId() {
        return empId;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }


    public Leaves getLeaves() {
        return leaves;
    }


    public String getManager() {
        return manager;
    }


    // Setters
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    public void setManager(String manager) {
        this.manager = manager;
    }



    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.address = new Address(addressStreet,addressCity,addressCountry);
        this.leaves= new Leaves(leavesLeftPreviously,leavesTaken);
    }

    public Employee() {
    }


    //other method related to customer
}
