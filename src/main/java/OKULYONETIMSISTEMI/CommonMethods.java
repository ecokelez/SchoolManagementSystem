package OKULYONETIMSISTEMI;

import java.util.Scanner;

public class CommonMethods extends Menu {
    static Scanner input = new Scanner(System.in);

    public static void add(String type) {
        String typeLowercase = type.toLowerCase();
        System.out.println("---------------------------# ADD " + type + " PAGE #---------------------------");
        System.out.println();
        System.out.println("Please enter the ID number of the " + typeLowercase);
        int idNumber = input.nextInt();
        System.out.println("Please enter the name of the " + typeLowercase);
        String name = input.next();
        System.out.println("Please enter the last name of the " + typeLowercase);
        String lastName = input.next();

        if (type.equals("STUDENT")) {
            Pojo student = new Pojo();
            student.setIdNumber(idNumber);
            student.setName(name);
            student.setLastName(lastName);
            StudentMethods.calculateStudentAgeAndGrade(type, student);

        } else if (type.equals("TEACHER")) {
            Pojo teacher = new Pojo();
            teacher.setIdNumber(idNumber);
            teacher.setName(name);
            teacher.setLastName(lastName);
            TeacherMethods.getTeacherAgeFieldAndRegNumber(type, teacher);

        } else {
            System.out.println("An error occured! The application is restarting.");
            Menu.mainMenu();
        }

        System.out.println("The " + type.toLowerCase() + " has been added successfully.");
        Menu.returnToMenu("ADD", type);
    }

    public static void list(String type) {
        ShowTableHead(type, "LIST");
        if (type.equals("STUDENT")) {
            StudentMethods.listAllStudents(type);
        } else if (type.equals("TEACHER")) {
            TeacherMethods.listAllTeachers(type);
        } else {
            System.out.println("An error occurred! The application is restarting.");
            Menu.mainMenu();
        }
        returnToMenu(type);
    }

    public static void search(String type) {
        String typeLowercase = type.toLowerCase();
        System.out.println("---------------------------# SEARCH " + type + " PAGE #---------------------------");
        System.out.println();
        System.out.println("Please enter the ID number of the " + typeLowercase + " that you want to search:");
        int userInput = input.nextInt();


        if (Pojo.teacherIDs.contains(userInput) || Pojo.studentIDs.contains(userInput)) {
            System.out.println(typeLowercase + " found!");
            ShowTableHead(type, "INFO");
            if (type.equals("STUDENT")) {
                Pojo studentObj = Pojo.studentsList.get(userInput);
                System.out.printf("%-12s %-21s %-21s %-20s %-21s %-20s\n", studentObj.getIdNumber(), studentObj.getName(), studentObj.getLastName(),
                        studentObj.getAge(), studentObj.getStudentNumber(), studentObj.getStudentGrade());

            } else if (type.equals("TEACHER")) {
                Pojo teacherObj = Pojo.teachersList.get(userInput);
                System.out.printf("%-12s %-20s %-21s %-20s %-21s %-16s\n", teacherObj.getIdNumber(), teacherObj.getName(), teacherObj.getLastName(),
                        teacherObj.getAge(), teacherObj.getTeacherRegNumber(), teacherObj.getTeacherField());
            } else {
                System.out.println("An error occured! The application is restarting.");
                Menu.mainMenu();
            }
        } else {
            System.out.println("There is no " + typeLowercase + " registered with this number in our school.");
            Menu.returnToMenu("SEARCH", type);
        }
        Menu.returnToMenu("SEARCH", type);

    }

    public static void remove(String type) {
        String typeLowercase = type.toLowerCase();
        System.out.println("---------------------------# REMOVE " + type + " PAGE #---------------------------");
        System.out.println();
        System.out.println("Please enter the ID number of the " + typeLowercase + " that you want to remove:");
        int userInput = input.nextInt();

        if (Pojo.teachersList.isEmpty() && Pojo.studentsList.isEmpty()) {
            System.out.println("List is already empty.");
            Menu.returnToMenu("REMOVE", typeLowercase);
        } else {
            if (type.equals("STUDENT")) {
                Pojo.studentsList.remove(userInput);
            } else if (type.equals("TEACHER")) {
                Pojo.teachersList.remove(userInput);
            }
        }

        System.out.println("The " + type.toLowerCase() + " has been removed successfully.");
        Menu.returnToMenu("REMOVE", type);
    }

    public static void ShowTableHead(String type, String title) {
        if (type.equals("STUDENT")) {
            System.out.println("---------------------------# " + type + " " + title + " #--------------------------------------------------------");
            System.out.println("ID           Name                 Last Name              Age                Student Number          Grade" +
                    "\n-----------------------------------------------------------------------------------------------------------------");
        } else if (type.equals("TEACHER")) {
            System.out.println("---------------------------# " + type + " " + title + " #--------------------------------------------------------");
            System.out.println("ID           Name                 Last Name              Age                Reg Number          Field" +
                    "\n-----------------------------------------------------------------------------------------------------------------");
        }
    }

    public static void returnToMenu (String type) {//Burada methodu override etmek zorunda kaldim. Ama statik oldugu icin tekrar kendim yazdim...
        do {
            System.out.println("1- RETURN TO " + type.toUpperCase() + " SUB MENU\n" +
                    "2- RETURN TO MAIN MENU\n" +
                    "Q- QUIT");

            String userInput = input.next().toUpperCase();
            if (userInput.equals("1")) {
                Menu.subMenu(type);
                break;
            } else if (userInput.equals("2")) {
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

}
