import java.util.Scanner;
import java.io.*;

public class notepad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printHelp();

        masterLoop: while(true) {
            switch(input.next().toLowerCase()) {
                case "exit":
                    break masterLoop; // Breaks containing loop.
                case "help":
                    printHelp();
                    break;
                default:
                    System.out.println("Unknown command.");
                    break;
            }
            System.out.println();

        }

        System.out.println("Closing program.");

        input.close();
        System.exit(0);
    }

    static String[] commands = {"append", "create", "delete", "exit", "getChars", "getLines", "help", "listFiles", "prepend", "read", "write"};

    static void printHelp() {
        System.out.println("Available commands are:\n");
        for(int i = 0; i < commands.length; i++) {
            System.out.println(commands[i]);
        }
        System.out.println();
    }
}