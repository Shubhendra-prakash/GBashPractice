package test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class age {
	private static final int MIN_AGE = 16;
    private static final int MAX_AGE = 85;

    public static void main(String[] args) {
        // Sample Date of Birth input (format: yyyy-MM-dd)
        String dobInput = "2007-05-20"; // Example: May 15, 2006
        
        // Validate the DOB
        boolean isValid = validateDOB(dobInput);

        if (isValid) {
            System.out.println("The date of birth is valid.");
        } else {
            System.out.println("The date of birth is invalid. Age must be between " + MIN_AGE + " and " + MAX_AGE + " years.");
        }
    }

    public static boolean validateDOB(String dobInput) {
        try {
            // Define the date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Parse the DOB input
            LocalDate dob = LocalDate.parse(dobInput, formatter);

            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Calculate the age
            int age = Period.between(dob, currentDate).getYears();

            // Check if the age is within the allowed range
            return age >= MIN_AGE && age <= MAX_AGE;

        } catch (DateTimeParseException e) {
            // Handle invalid date format
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            return false;
        }
    }
}
