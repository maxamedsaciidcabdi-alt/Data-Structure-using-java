# Inpatient Class

## Purpose

The `Inpatient` class represents a patient who stays in the hospital for
one or more days. It inherits common patient information from the
`Patient` superclass.

## Inheritance

`class Inpatient extends Patient` allows the class to use the inherited
`name` and `consultFee` properties.

## Additional Properties

-   `roomCharge`: The room cost for one day.
-   `numberOfDays`: The number of days the patient stays in the
    hospital.

## Constructor

The constructor receives the patient's name, consultation fee, room
charge, and number of days. - `super(name, consultFee)` initializes the
inherited properties using the `Patient` constructor. -
`this.roomCharge = roomCharge` stores the daily room cost. -
`this.numberOfDays = numberOfDays` stores the length of the stay.

## CalculateBill() Method

The method calculates and returns the total bill:

`Total Bill = (numberOfDays * roomCharge) + consultFee`

For example, if the consultation fee is \$50, the daily room charge is
\$100, and the patient stays for 3 days, the total is
`(3 * 100) + 50 = $350`.

## display() Method

The `display()` method prints the patient type, name, consultation fee,
room charge per day, number of days, and total bill. It uses
`CalculateBill()` to calculate the total.

## Key Concepts

-   Inheritance with `extends`
-   Calling a superclass constructor with `super`
-   Storing values in instance variables
-   Multiplication and addition in a calculation method
