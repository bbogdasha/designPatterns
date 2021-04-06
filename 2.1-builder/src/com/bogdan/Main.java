package com.bogdan;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee firstEmployee = new Employee.Builder("Carl", "White")
                .setExperience(Experience.SENIOR)
                .setTeam(Team.BACKEND)
                .setProject(Project.APP_ONE)
                .setEmail("carl@gmail.com")
                .setPhoneNumber("+25252525")
                .build();

        Employee secondEmployee = new Employee.Builder("Emily", "Green")
                .setExperience(Experience.JUNIOR)
                .setTeam(Team.TESTER)
                .build();

        Employee thirdEmployee = new Employee.Builder("Danny", "Black")
                .setPhoneNumber("+575757557")
                .build();

        Employee fourthEmployee = new Employee.Builder("Bob", "Orange")
                .setExperience(Experience.TEAMLEAD)
                .setPhoneNumber("+121212121")
                .setEmail("bob@gmail.com")
                .build();

        Employee fifthEmployee = new Employee.Builder("Ann", "Pink")
                .setExperience(Experience.JUNIOR)
                .setTeam(Team.BACKEND)
                .setProject(Project.APP_ONE)
                .build();

        List<Employee> employees = new ArrayList<>();
        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);
        employees.add(fourthEmployee);
        employees.add(fifthEmployee);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
