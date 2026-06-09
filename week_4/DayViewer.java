// Enum to capture the days of the week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

// Superclass (Parent class)
class Week {
    // Method to display all days in the enum
    public void printDays() {
        System.out.println("Days of the week from the Superclass:");
        for (Day day : Day.values()) {
            System.out.println("- " + day);
        }
    }
}

// Subclass (Child class) that inherits from Week
class CustomWeek extends Week {
    // Additional method specific to the subclass
    public void printWeekend() {
        System.out.println("\nWeekend days from the Subclass:");
        System.out.println("- " + Day.SATURDAY);
        System.out.println("- " + Day.SUNDAY);
    }
}

// Main class to run the program
public class DayViewer {
    public static void main(String[] args) {
        // Create an object of the subclass
        CustomWeek myWeek = new CustomWeek();

        // Call the inherited method from the superclass
        myWeek.printDays();

        // Call the specific method from the subclass
        myWeek.printWeekend();
    }
}
