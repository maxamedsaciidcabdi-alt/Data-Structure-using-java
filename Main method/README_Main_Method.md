# Main Method: Creating and Displaying Patient Objects

## Purpose

This section creates five patient objects and displays their
information. It demonstrates how objects are created from the
`Outpatient` and `Inpatient` subclasses.

## Creating the Objects

-   `p1`, `p2`, and `p3` are `Outpatient` objects.
-   `p4` and `p5` are `Inpatient` objects.
-   Each constructor receives the values needed to describe that
    patient.
    -   Outpatients receive a name, consultation fee, and lab charge.
    -   Inpatients receive a name, consultation fee, room charge per
        day, and number of days.

## Displaying Patient Information

Calling `display()` on each object prints its details and total bill.
Each object uses the `display()` method defined in its own class

## Key Concepts

-   **Object creation:** `new` creates an object from a class.
-   **Constructors:** Pass initial values into each object.
-   **Method calls:** `p1.display()` runs the display method for `p1`.
-   **Inheritance:** Both patient types share the common information
    defined in `Patient`.

## Expected Result

The program displays details for all five patients, including the
calculated bill for each one.
