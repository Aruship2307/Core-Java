package com.faq.imp.program;

//How to take the variable from the command line in Core Java?
public class CommandLineDemo {

	public static void main(String[] args) {
		  // Check if command-line arguments are provided, args string array is arugment in main() method
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            /* Access the command-line arguments, used loop to iterate each element of args array, in loop current argument is args[i], each argument is printed to console*/
            for (int i = 0; i < args.length; i++) {
                String argument = args[i];
                System.out.println("Argument " + i + ": " + argument);
            }
        }
    }
}
/* to run program & gives command line arguments, use below command in terminal
java CommandLineDemo argument1 argument2 
CommandLineDemo is class in Java, 
commandlineargument alwasy passed as String  */
