public class StringReverse {
    public static void main(String[] args) {
        String originalText = "Hello Java";
        String reversedText = "";
        
        // Loop backwards from the last index of the string down to 0
        for (int i = originalText.length() - 1; i >= 0; i--) {
            // Extract the character at the current index and add it to our new string
            reversedText = reversedText + originalText.charAt(i);
        }
        
        System.out.println("Original Text: " + originalText);
        System.out.println("Reversed Text: " + reversedText);
    }
}
