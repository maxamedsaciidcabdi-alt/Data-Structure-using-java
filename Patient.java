package hospital;

class Patient {
    protected String name;
    protected double consultFee;

    // Constructor
    public Patient(String name, double consultFee) {
        this.name = name;
        this.consultFee = consultFee;
    }
}

// Outpatient inherits from Patient
class Outpatient extends Patient {
    private double labCharge;

    public Outpatient(String name, double consultFee, double labCharge) {
        super(name, consultFee);
        this.labCharge = labCharge;
    }

    public double CalculateBill() {
        return labCharge + consultFee;
    }

    public void display() {
        System.out.println("Patient Type: Outpatient");
        System.out.println("Name: " + name);
        System.out.println("Consultation Fee: $" + consultFee);
        System.out.println("Lab Charge: $" + labCharge);
        System.out.println("Total Bill: $" + CalculateBill());
        System.out.println("---------------------------");
    }
}

// Inpatient inherits from Patient
 class Inpatient extends Patient {
    private double roomCharge;
    private int numberOfDays;

    public Inpatient(String name, double consultFee,
                     double roomCharge, int numberOfDays) {
        super(name, consultFee);
        this.roomCharge = roomCharge;
        this.numberOfDays = numberOfDays;
    }

    public double CalculateBill() {
        return (numberOfDays * roomCharge) + consultFee;
    }

    public void display() {
        System.out.println("Patient Type: Inpatient");
        System.out.println("Name: " + name);
        System.out.println("Consultation Fee: $" + consultFee);
        System.out.println("Room Charge per Day: $" + roomCharge);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Total Bill: $" + CalculateBill());
        System.out.println("---------------------------");
    }



        public static void main(String[] args) {

            // Creating 5 objects
            Outpatient p1 = new Outpatient("Ahmed", 20, 30);
            Outpatient p2 = new Outpatient("Fatima", 25, 40);
            Outpatient p3 = new Outpatient("Mohamed", 15, 35);

            Inpatient p4 = new Inpatient("Ali", 50, 100, 3);
            Inpatient p5 = new Inpatient("Amina", 40, 80, 5);

            // Displaying patient information
            p1.display();
            p2.display();
            p3.display();
            p4.display();
            p5.display();
        }



}

