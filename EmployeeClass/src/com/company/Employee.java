package com.company;

public class Employee implements Comparable<Employee> {
    public int salary;

    public  int compareTo(Employee other){
        if (this.salary < other.salary) return -1;
        if (this.salary > other.salary) return 1;
        return 0;
    }

}
