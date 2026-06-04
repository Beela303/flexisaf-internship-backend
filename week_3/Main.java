public class Main {
    public static void main(String[] args) {
        // variable for test score
        int examScore = 99;

        // Evaluate the score using an if-else if ladder
        if (examScore >= 90) {
            System.out.println("Grade: A");
        } else if (examScore >= 80) {
            // Runs if score is less than 90 BUT greater than or equal to 80
            System.out.println("Grade: B"); 
        } else if (examScore >= 70) {
            System.out.println("Grade: C");
        } else {
            // Runs only if ALL the above conditions fail
            System.out.println("Grade: F");
        }
    }
}
