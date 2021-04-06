package com.bogdan;

public class Employee {

    private final String name;
    private final String surname;
    private final Experience experience;
    private final Team team;
    private final Project project;
    private final String email;
    private final String phoneNumber;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Experience getExperience() {
        return experience;
    }

    public Team getTeam() {
        return team;
    }

    public Project getProject() {
        return project;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder {

        //required parameters
        private final String name;
        private final String surname;

        //optional parameters
        private Experience experience;
        private Team team;
        private Project project;
        private String email;
        private String phoneNumber;

        public Builder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Builder setExperience(Experience experience) {
            this.experience = experience;
            return this;
        }

        public Builder setTeam(Team team) {
            this.team = team;
            return this;
        }

        public Builder setProject(Project project) {
            this.project = project;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

    private Employee(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.experience = builder.experience;
        this.team = builder.team;
        this.project = builder.project;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name: " + name +
                ", surname: " + surname +
                ", experience: " + experience +
                ", team: " + team +
                ", project: " + project +
                ", phoneNumbers: " + phoneNumber +
                ", email: " + email +
                '}';
    }
}
