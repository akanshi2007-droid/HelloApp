package org.example;

public class HelloAppUC4 {
    public static void main(String[] args) {
        String result = "World";
        if (args != null && args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            result = nameBuilder.toString();
        }
        System.out.println("Hello, " + result + "!");
    }
}