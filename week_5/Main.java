interface TimeCalculator {
    // Method to return the standard hours in a day
    int getHoursInDay();
    
    // Method to calculate total hours for a given number of days
    int calculateTotalHours(int days);
}

// Implementing the interface in a class
class DayCalculator implements TimeCalculator {
    // Constant for hours in a single day
    private static final int HOURS_PER_DAY = 24;

    // First method implementation
    @Override
    public int getHoursInDay() {
        return HOURS_PER_DAY;
    }

    // Second method implementation
    @Override
    public int calculateTotalHours(int days) {
        return days * HOURS_PER_DAY;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an object of the DayCalculator class
        TimeCalculator calculator = new DayCalculator();
        
        // Use the first method
        int standardHours = calculator.getHoursInDay();
        System.out.println("There are " + standardHours + " hours in a single day.");
        
        // Use the second method with a test value (e.g., 5 days)
        int testDays = 5;
        int totalHours = calculator.calculateTotalHours(testDays);
        System.out.println("Total hours in " + testDays + " days: " + totalHours);
    }
}
