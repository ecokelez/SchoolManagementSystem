package OKULYONETIMSISTEMI;

import java.util.Map;
import java.util.Scanner;

public class CommonMethods {
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
            System.out.println("An error occured! The application is restarting.");
            Menu.mainMenu();
        }

        Menu.returnToMenu("ADD", type);
    }

    public static void search(String type) {
        String typeLowercase = type.toLowerCase();
        System.out.println("---------------------------# SEARCH " + type + " PAGE #---------------------------");
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

    public static void ShowTableHead(String type, String title) {
        System.out.println("---------------------------# " + type + " " + title + " #--------------------------------------------------------");
        System.out.println("ID           Name                 Last Name              Age                Student Number          Grade" +
                "\n-----------------------------------------------------------------------------------------------------------------");
    }


}
