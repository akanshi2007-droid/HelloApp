package org.example;

public class HelloApp3 {
    public static void main(String[] args) {
        // Precondition: Default value
        String result = "World";

        // Logic for UC4: Handling multiple names
        if (args != null && args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                
                // Add comma and space between names (but not after the last one)
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            result = nameBuilder.toString();
        }

        // Final Postcondition: Single greeting with all names
        System.out.println("Hello, " + result + "!");
    }
}