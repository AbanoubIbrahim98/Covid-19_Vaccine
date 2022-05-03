import java.util.Date;

/**
 * Dose class >> is the dose that the citizen takes.
 */
public class Dose {
    // Static >> to be shared between all objects
    private static int doseId_Generator = 1;

    // Define unique attributes
    private int identity;
    private String manufacturer;
    private String takenAt;
    private String takenIn;
    private Professional professional;

    // Constructor
    public Dose(String manufacturer, String takenAt, String takenIn, Professional professional) {
        //* Initialize the variables
        this.identity = doseId_Generator;
        this.manufacturer = manufacturer;
        this.takenAt = takenAt;
        this.takenIn = takenIn;
        this.professional = professional;

        doseId_Generator++; // Increment the variable -- to give the next dose unique id
    }


    // Setter & Getter
    public int getidentity() {
        return identity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(String takenAt) {
        this.takenAt = takenAt;
    }

    public String getTakenIn() {
        return takenIn;
    }

    public void setTakenIn(String takenIn) {
        this.takenIn = takenIn;
    }

    public Professional getProfessional() {
        return professional;
    }

    public void setProfessional(Professional professional) {
        this.professional = professional;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        // Check that the obj is instance of this class
        if(!(obj instanceof Dose)) return false;

        // Cast the obj
        Dose dose = (Dose) obj;

        // Check if the ids matched up.
        return getidentity() == dose.getidentity();
    }

    // toString method
    @Override
    public String toString() {
        return "identity = " + this.getidentity() + ", Manufacturer = '" + this.getManufacturer() + '\'' + ", TakenAt=" + this.getTakenAt() + ", TakenIn='" + this.getTakenIn() + '\'' + ", Health Professional = " + this.getProfessional();
    }
}
