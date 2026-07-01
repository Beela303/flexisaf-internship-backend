public class NumberConversion {
    public static void main(String[] args) {
        // --- 1. CONVERTING A NUMBER TO A STRING ---
        int originalNumber = 456;
        
        // Use String.valueOf() to convert the integer to text
        String textNumber = String.valueOf(originalNumber);
        
        System.out.println("--- Number to String ---");
        System.out.println("String value: " + textNumber);
        // This will concatenate text, resulting in "45610"
        System.out.println("Proving it is text: " + (textNumber + 10)); 
        
        
        // --- 2. CONVERTING A STRING BACK TO A NUMBER ---
        String numericText = "789";
        
        // Use Integer.parseInt() to convert the text to an actual integer
        int parsedNumber = Integer.parseInt(numericText);
        
        System.out.println("\n--- String to Number ---");
        System.out.println("Integer value: " + parsedNumber);
        // This will perform mathematical addition, resulting in 799
        System.out.println("Proving it is a number: " + (parsedNumber + 10));
    }
}
