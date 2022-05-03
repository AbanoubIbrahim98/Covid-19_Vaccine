/** * Citizens Management — The program's main class.

* The majority of the program logic is implemented in this class, as well as all of the essential features. Adding a new resident to the list, for example. When a new dose is given to a certain resident, Putting all of the information into a text file,....

* Why are all of the methods in this class static? - To be invoked without the need to create an object from the class +...;

* All major methods return void because it displays an appropriate success or failure message to the user.

*/

// Import the necessary files.
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CitizensManagement {
    // The ArrayList holds all of the information on the residents.
    private static ArrayList<Citizen> residents = new ArrayList<>();
//** This is where all of the main functionality is implemented.

// @resident — The resident to be added */ /** * add a new resident to the main list *
    
       static void NewcCtizensShouldBeAdded(Citizen resident) {
        // Check to see if the resident is already on the list.
        for (Citizen value : residents) {
            if (resident.equals(value)) {
                System.out.println("[Missed] Unfortunately, Citizen " + resident.getName() + "already exists in the list.");
                return; // Stop the function from running
            }
        }
        // If not (the resident is a newcomer), add the resident to the arrayList.
        residents.add(resident);
        System.out.println("[Congratulations] Citizen " + resident.getName() + " successfully added to the list.");
    }

    /**
    /** * Giving a dose to a certain resident. @param resident — The resident to which dose should be applied. @param dose — The dose that will be given to the resident.
     */
     static void addDoseToCitizen (Citizen resident, Dose dose) {
         // call the resident class's addNewDose method
         resident.addNewDose(dose);
    }

/** * Calculating the average number of passengers per resident on a given day.

*/
    static void getNoOfFullyVaccinated() {
        int result = 0;

        // All residents are looped over
        for(int i = 0; i < residents.size(); i++) {
            Citizen resident = residents.get(i);
            // Check to see if the resident ingested at least two doses.
            if(resident.getTheNumberOfDoses() >= 2) {
                result++;
            }
        }

        System.out.println("The total number of people who have been fully vaccinated is " + result);
    }

   
    static void informationMustBeKept() {
        // Sort the data by civil id (see the compareTo method in the Citizen class for more information)
        Collections.sort(residents);

        // Prepare the data into single string
        String residentsData = "Data on all citizens who've already registered <<\n\n";
        for (int i = 0; i < residents.size(); i++) {
            Citizen resident = residents.get(i);
            residentsData += resident.toString() + "\n";
        }

        residentsData += "\n>>";

        // Trying to write all residents data to 'Citizens-Data.txt' file
        try {
            // Initialize an file writer to write all residents data to a file
            FileWriter myWriter = new FileWriter("Citizens-Data.txt");
            // Write the data
            myWriter.write(residentsData);
            // Close the file
            myWriter.close();
             //Display and make try and catch
            System.out.println("[Congratulations] To the this moment, all data has been stored. \'Citizens-Data.txt\' successfully!");
        } catch (IOException e) {
            System.out.println("[Missed] Unfortunately, When storing data,  has an error occurred.!");
            e.printStackTrace();
        }
    }
}
