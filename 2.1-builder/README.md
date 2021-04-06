# Builder

The Builder pattern proposes to take the construction of on object outside its own class, entrusting this task to separate objects called builders.

---

Created: 

```java
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
```

Result:

```
	Employee{name: Carl, surname: White, experience: senior, team: backend, project: app_one, phoneNumbers: +25252525, email: carl@gmail.com}
	Employee{name: Emily, surname: Green, experience: junior, team: tester, project: null, phoneNumbers: null, email: null}
	Employee{name: Danny, surname: Black, experience: null, team: null, project: null, phoneNumbers: +575757557, email: null}
	Employee{name: Bob, surname: Orange, experience: teamlead, team: null, project: null, phoneNumbers: +121212121, email: bob@gmail.com}
	Employee{name: Ann, surname: Pink, experience: junior, team: backend, project: app_one, phoneNumbers: null, email: null}
```