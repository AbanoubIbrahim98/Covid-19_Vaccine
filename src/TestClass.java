import java.util.Date;

/**
 * The Testing class -- Here will test all the program functionality.
 */
public class TestClass {
    public static void main(String[] args) {
        System.out.println("=========== Welcome In The Citizens Management Program ===========\n");

        // Initialize some residents
        Citizen resident2 = new Citizen("HALEMA",  "Amsterdam", "12262421899");
        Citizen resident6 = new Citizen("MOUNERA", "Bangkok", "+447508629557");
        Citizen resident3 = new Citizen("LOUAI", "Beijing", "+33629474120");
        Citizen resident4 = new Citizen("AMIRA", "Berlin", "+447868206847");
        Citizen resident1 = new Citizen("MUNA", "Brussels", "+77789493419");
        Citizen resident5 = new Citizen("GHINA", "Cairo", "+66802204827");
        Citizen resident7 = new Citizen("SALLY" ,  "Chicago", "+420605993434");
        Citizen resident9 = new Citizen("MANAR" ,  "Dublin", "+31613355460");
        Citizen resident10 = new Citizen("SOSO","Geneva", "+4366565514515");
        Citizen resident11 = new Citizen("WAFAA","Hanoi", "+380979805709");
        Citizen resident8 = new Citizen("SAHAR" , "Istanbul", "+27765878260");
        Citizen resident12 = new Citizen("AYA",  "London", "+2787240508610186");

        // Initialize some professionals 
        Professional professional_1 = new Professional("FATHEA", 2);
        Professional worker_2 = new Professional("MOHAMMEDE", 3);
        Professional expert_3 = new Professional("FARES ", 1);

        // Initialize 7 residents
        Dose dose1 = new Dose("Bratislava", "3/13/2022", "KING FAISAL  ..", professional_1);
        Dose dose2 = new Dose("Frankfurt", "2/1/2022", "PRINSE SULTAN  ..",  worker_2);
        Dose dose3 = new Dose("The Hague", "1/1/2022", "KING SAUD ..",  expert_3);

        // Add residents to main list
        System.out.println("---------Residents are being added.---------");
        CitizensManagement.NewcCtizensShouldBeAdded(resident1);
        CitizensManagement.NewcCtizensShouldBeAdded(resident2);
        CitizensManagement.NewcCtizensShouldBeAdded(resident3);
        CitizensManagement.NewcCtizensShouldBeAdded(resident4);
        CitizensManagement.NewcCtizensShouldBeAdded(resident5);
        CitizensManagement.NewcCtizensShouldBeAdded(resident6);
        CitizensManagement.NewcCtizensShouldBeAdded(resident7);
        CitizensManagement.NewcCtizensShouldBeAdded(resident8);
        CitizensManagement.NewcCtizensShouldBeAdded(resident9);
        CitizensManagement.NewcCtizensShouldBeAdded(resident10);
        CitizensManagement.NewcCtizensShouldBeAdded(resident11);
        CitizensManagement.NewcCtizensShouldBeAdded(resident12);

        System.out.println("-------------------------------------");


        // Add Doses to the residents
        System.out.println("---------Expanding Citizens' Doses--------");
        CitizensManagement.addDoseToCitizen(resident1, dose1);
        CitizensManagement.addDoseToCitizen(resident1, dose2);

        CitizensManagement.addDoseToCitizen(resident2, dose1);

        CitizensManagement.addDoseToCitizen(resident3, dose1);
        CitizensManagement.addDoseToCitizen(resident3, dose2);
        CitizensManagement.addDoseToCitizen(resident3, dose3);

        CitizensManagement.addDoseToCitizen(resident4, dose1);
        CitizensManagement.addDoseToCitizen(resident4, dose2);
        CitizensManagement.addDoseToCitizen(resident4, dose3);

        CitizensManagement.addDoseToCitizen(resident5, dose1);

        CitizensManagement.addDoseToCitizen(resident6, dose1);

        CitizensManagement.addDoseToCitizen(resident7, dose1);
        CitizensManagement.addDoseToCitizen(resident7, dose2);

        // From resident8 to resident12 --> Un-vaccinated

        System.out.println("-------------------------------------");

        System.out.println("---------A amount of persons who are fully immunized (at least two vaccines) is displayed.)---------");

        CitizensManagement.getNoOfFullyVaccinated();

        System.out.println("-------------------------------------");

        // Try to violate the state of the objects and show that code prevents all violations.
        System.out.println("---------Attempting to Destroy the State of Objects----------");

        System.out.println("\n---Violate adding new resident operation...");
        CitizensManagement.NewcCtizensShouldBeAdded(resident1); // Citizen 1 already exist
        
        System.out.println("\n---Adding vaccination to a resident operation is a violation....");
        CitizensManagement.addDoseToCitizen(resident2, dose1); 
        CitizensManagement.addDoseToCitizen(resident7, dose2); 

        System.out.println("-------------------------------------");

        System.out.println("---------Information on all inhabitants is being saved.---------");

        CitizensManagement.informationMustBeKept();

        System.out.println("\n===========Farewell, AND HAVE A WONDERFUL Day===========\n");
    }
}
