package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.salary = 100;
        employee2.salary = 500;

        int result = ((Comparable) employee1).compareTo(employee2);
        System.out.println(result);
    }
}
