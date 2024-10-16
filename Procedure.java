public class Procedure {
    private String procedureName;
    private String date;
    private String practitionerName;
    private double charges;

    // No-arg constructor
    public Procedure() {}

    // Parameterized constructor for name and date
    public Procedure(String procedureName, String date) {
        this.procedureName = procedureName;
        this.date = date;
    }

    // Parameterized constructor for all attributes
    public Procedure(String procedureName, String date, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.date = date;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    // Accessors
    public String getProcedureName() { return procedureName; }
    public String getDate() { return date; }
    public String getPractitionerName() { return practitionerName; }
    public double getCharges() { return charges; }

    // Mutators
    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
    public void setDate(String date) { this.date = date; }
    public void setPractitionerName(String practitionerName) { this.practitionerName = practitionerName; }
    public void setCharges(double charges) { this.charges = charges; }

    // toString method
    @Override
    public String toString() {
        return "Procedure: " + procedureName + "\n" +
               "Date: " + date + "\n" +
               "Practitioner: " + practitionerName + "\n" +
               "Charges: $" + String.format("%.2f", charges);
    }
}
