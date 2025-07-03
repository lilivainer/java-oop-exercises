# Employee Management System – OOP Java Project

This repository contains the solution for **Assignment 3** in Object-Oriented Programming (OOP) – part of the Java coursework under package `Ex14_1`.

##  Project Description

The system models employee management in a fictional company called **"HappyToAll"**, which includes four types of employees:
- `RegularEmployee`
- `UnionMember`
- `Technician`
- `ProjectSupervisor`

Each employee inherits from the base class `Employee`, and implements the following interfaces:
- `Votable` – with `int getVoteScore()`
- `Salaried` – with `double calculateSalary()`

A custom `EmployeeType` enum is used to describe employee roles and their descriptions.

Additionally, a custom exception `BonusNotEligibleException` is thrown in specific bonus conditions.

---

##  Class Overview

- `Employee` – Abstract base class with fields: `name`, `yearsOfSeniority`, `type`
- `RegularEmployee` – Standard employee
- `UnionMember` – Employee with union membership
- `Technician` – Responsible for a number of computers
- `ProjectSupervisor` – Manages a team of up to 15 employees
- `Company` – Contains all employees and provides logic for:
  - Adding employees
  - Calculating total monthly salary
  - Voting logic for renaming the company
  - Bonus eligibility validation
- `Votable` / `Salaried` – Interfaces for voting score and salary
- `EmployeeType` – Enum with values: REGULAR, UNION, TECHNICIAN, SUPERVISOR
- `BonusNotEligibleException` – Custom exception class for bonus rules

---

##  Salary Rules

- Base salary: 8000 ₪  
- +500 ₪ per year of seniority  
- Technicians get +250 ₪ for every 10 computers  
- Project supervisors get:
  - +100 ₪ for each technician in their team  
  - +50 ₪ for each union member in their team  

---

##  Voting Rules

| Employee Type       | Vote Score |
|---------------------|------------|
| RegularEmployee     | 10         |
| UnionMember         | 24         |
| Technician          | 23         |
| ProjectSupervisor   | 12         |

Votes from Regular and Technician employees are considered **supportive**.  
Votes from Union members and Project Supervisors are considered **against**.

---

##  Bonus Rules

Only eligible for `RegularEmployee` and `Technician`.

Eligibility conditions:
- `RegularEmployee`: seniority > 5 years
- `Technician`: seniority > 5 **and** responsible for more than 100 computers  
Otherwise, a `BonusNotEligibleException` is thrown.

---

##  Testing

A full test example was provided (not included in submission) to verify:
- Correct salaries
- Accurate vote scores
- Bonus logic
- Team composition and behavior

You are encouraged to run additional custom test cases to ensure code stability and accuracy.

---

##  Submission Instructions

This submission includes:
- 6 Java classes  
- 2 interfaces  
- 1 Enum  
- 1 custom Exception class  
All located in the package `Ex14_1`


