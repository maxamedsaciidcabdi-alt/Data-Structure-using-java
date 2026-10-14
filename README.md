# Hospital Package -- Java OOP Assignment

## Overview

This project is a simple hospital billing system developed in Java using
Object-Oriented Programming (OOP), especially **Inheritance**.

## Classes

-   **Patient:** The superclass that stores the patient's name and
    consultation fee.
-   **Outpatient:** Inherits from `Patient` and adds a laboratory
    charge.
-   **Inpatient:** Inherits from `Patient` and adds a room charge and
    number of days.

## Bill Calculation

-   **Outpatient:** Total Bill = Lab Charge + Consultation Fee
-   **Inpatient:** Total Bill = (Room Charge × Number of Days) +
    Consultation Fee

## Main Method

The `main()` method creates five patient objects: three outpatients and
two inpatients. It displays each patient's information and total bill.

## Concepts Used

-   Inheritance
-   Classes and Objects
-   Constructors
-   `super()` keyword
-   Methods
-   Mathematical calculations

## Conclusion

This project demonstrates how inheritance allows different patient types
to share common properties while using their own billing calculations.
