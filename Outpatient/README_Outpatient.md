# Outpatient Class

## Purpose

The `Outpatient` class represents a patient who visits the hospital
without staying overnight. It inherits common patient information from
the `Patient` superclass.

## Inheritance

`class Outpatient extends Patient` means that `Outpatient` inherits the
`name` and `consultFee` properties from `Patient`.

## Additional Property

-   `labCharge`: The cost of laboratory tests for the outpatient.

## Constructor

The constructor receives the patient's name, consultation fee, and
laboratory charge. - `super(name, consultFee)` calls the `Patient`
constructor to initialize the inherited properties. -
`this.labCharge = labCharge` stores the laboratory charge in the current
object.

## CalculateBill() Method

The method calculates and returns the total bill:

`Total Bill = labCharge + consultFee`

For example, if the consultation fee is \$20 and the lab charge is \$30,
the total bill is \$50.

## display() Method

The `display()` method prints the patient type, name, consultation fee,
lab charge, and total bill. It calls `CalculateBill()` to calculate the
amount shown.

## Key Concepts

-   Inheritance with `extends`
-   Calling a superclass constructor with `super`
-   Instance variables
-   Returning a calculated value from a method
