package OKULYONETIMSISTEMI;

import java.util.Scanner;

public class Menu {

    static Scanner input = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("-------------------------# SCHOOL MANAGEMENT SYSTEM #-------------------------");
        System.out.println();
        System.out.println("1. Student Transactions\n" +
                "2. Teacher Transactions\n" +
                "Q. QUIT\n");
        System.out.println("Please select the transaction you want:");
        String userInput = input.next().toUpperCase(); //We catch the user selection
        String type = "";

        do {
            if (userInput.equals("1")) {
                type = "STUDENT";
                subMenu(type);
                break;
            } else if (userInput.equals("2")) {
                type = "TEACHER";
                subMenu(type);
                break;
            } else if (userInput.equals("Q")) {
                quit();
                break;
            } else {
                System.out.println("Invalid user input. Please try again... ");
                userInput = input.next().toUpperCase();
            }
        } while (true);
    }

    public static void subMenu(String type) {
        System.out.println("-------------------# " + type + " SUB MENU #-------------------");
        System.out.println();
        System.out.println("1- ADD " + type + "\n" +
                "2- SEARCH " + type + "\n" +
                "3- LIST " + type + "\n" +
                "4- REMOVE " + type + "\n" +
                "5- RETURN TO MAIN MENU\n" +
                "Q- QUIT");
        System.out.println("Please select the transaction you want:");
        String userInput = input.next().toUpperCase(); //We catch the user selection

        do {
            if (userInput.equals("1")) {
                CommonMethods.add(type);
                break;
            } else if (userInput.equals("2")) {
                CommonMethods.search(type);
                break;
            } else if (userInput.equals("3")) {
                CommonMethods.list(type);
                break;
            } else if (userInput.equals("4")) {
                CommonMethods.remove(type);
                break;
            } else if (userInput.equals("5")) {
                Menu.mainMenu();
                break;
            } else if (userInput.equals("Q")) {
                quit();
                break;
            } else {
                System.out.println("Invalid user input. Please try again... ");
                userInput = input.next().toUpperCase();
            }
        } while (true);
    }

    public static void returnToMenu(String methodName, String type) {
        do {
            System.out.println("1- " + methodName+ " MORE " + type.toUpperCase() + "\n" +
                    "2- RETURN TO " + type.toUpperCase() + " SUB MENU\n" +
                    "3- RETURN TO MAIN MENU\n" +
                    "Q- QUIT");

            String userInput = input.next().toUpperCase();
            if (userInput.equals("1")) {
                switch (methodName) {
                    case "ADD":
                        CommonMethods.add(type);
                        break;
                    case "LIST":
                        CommonMethods.list(type);
                        break;
                    case "SEARCH":
                        CommonMethods.search(type);
                        break;
                    case "REMOVE":
                        CommonMethods.remove(type);
                        break;
                }
                break;
            } else if (userInput.equals("2")) {
                Menu.subMenu(type);
                break;
            } else if (userInput.equals("3")) {
                Menu.mainMenu();
                break;
            } else if (userInput.equals("Q")) {
                quit();
                break;
            } else {
                System.out.println("Invalid user input. Please try again... ");
            }
        } while (true);
    }

    public static void quit() {
        System.out.println("Thank you for using the SCHOOL MANAGEMENT SYSTEM...\n" +
                "System closed...");
    }
}






















