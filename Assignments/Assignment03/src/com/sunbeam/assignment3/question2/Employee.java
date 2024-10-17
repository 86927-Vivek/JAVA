package com.sunbeam.assignment3.question2;


public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        setFirstName(firstName);
        setLastName(lastName);
        setMonthlySalary(monthlySalary);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    
    public void giveRaise(double percentage) {
        double raise = monthlySalary * (percentage / 100);
        setMonthlySalary(monthlySalary + raise);
    }

   
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Krishna", "Kumar", -5000);
        Employee employee2 = new Employee("Karishma", "Kumari", 6000);

        System.out.println("Monthly Salaries:");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + ": $" + employee1.getMonthlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + ": $" + employee2.getMonthlySalary());
        System.out.println("");
        
        System.out.println("Yearly Salaries:");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + ": $" + employee1.getYearlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + ": $" + employee2.getYearlySalary());

        
        employee1.giveRaise(10);
        employee2.giveRaise(10);

        System.out.println("");
        
        System.out.println("Updated Yearly Salaries after 10% Raise:");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + ": $" + employee1.getYearlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + ": $" + employee2.getYearlySalary());
    }
}



