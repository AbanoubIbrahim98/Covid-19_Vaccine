import java.util.ArrayList;
// Citizen class (Son class of Person)— It represents a major resident.

// It inherits the Human (Father Class) class. * This class will also have accessibility to all non-private data from the parent process.


public class Citizen extends Person implements Comparable<Citizen>{
    // Define distinct qualities.
    private String site;
    private String number;
    private ArrayList<Dose> vaccine; // ArrayList to hold all vaccine taken by resident

    // Constructor
    public Citizen(String name, String site, String number) {
        // Deliver the inherited data towards the constructor of a parent.
        super(name);
        
        this.site = site;
        this.number = number;

        this.vaccine = new ArrayList<Dose>();
    }

    //  the Setter & Getter
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.site = number;
    }

    // Make a note of the vaccine's number.
    public int getTheNumberOfDoses(){
        return this.vaccine.size();
    }

    // Add a fresh dose to the user's regimen.
    public void addNewDose(Dose dose) {
        // Check to determine if the dose has been taken already.
        boolean currentlyExist = false;
        for (int i = 0; i < this.getTheNumberOfDoses(); i++) {
            Dose currentDose = this.vaccine.get(i);
            if (currentDose.equals(dose)) {
                currentlyExist = true;
                break; // The loop must be broken.
            }
        }

        // Check to see if it exists or not.
        if(!currentlyExist) {
            //* Add the dose to te list of vaccine.
            this.vaccine.add(dose);
            //if the loop seccse 
            System.out.print( "[Congratulations], Dose " + dose.getidentity()
                    + " resident approved " + this.getName() + ".\n");

        } else {
            //if the loop wrong 
            System.out.print("[Missed] Unfortunately, Citizen " + this.getName()
                    + " dosage has been given " + dose.getidentity() + " before.\n");
        }
    }

    // equals method
    //now the override,
    //Method overriding is one of the way by which java achieve Run Time Polymorphism
    @Override
    public boolean equals(Object obj) {
        // that the object is a member of this class
        if(!(obj instanceof Citizen)) return false;

        // Cast the obj
        Citizen resident = (Citizen) obj;

        // Check if the ids matched up.
        return getCivilId() == resident.getCivilId();
    }

    // To return a bespoke form of the object data, override the toString function.
    @Override
    public String toString() {
        String vaccineData = "{\n";

        for(int i = 0; i < this.getTheNumberOfDoses(); i++) {
          vaccineData += this.vaccine.get(i).toString();
          vaccineData += "\n";
        }
        vaccineData += "}";

        // To acquire super's attribute, call super.
        return  super.toString() + '\'' + ", site= " + this.getSite() + '\''
                + ", number = " + this.getNumber() + '\'' + ", Doses Data = " + vaccineData;
    }

    @Override
    public int compareTo(Citizen resident) {
        return Integer.compare(this.getCivilId(), resident.getCivilId());
    }
}