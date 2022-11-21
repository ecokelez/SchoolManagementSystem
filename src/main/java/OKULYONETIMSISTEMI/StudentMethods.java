package OKULYONETIMSISTEMI;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class StudentMethods {

    static Scanner input = new Scanner(System.in);

    public static void calculateStudentAgeAndGrade(String type, Pojo student) {
        System.out.println("Please enter the birth year of the " + type.toLowerCase() + " (yyyy)");
        String birthYear = input.next();
        int age = LocalDate.now().getYear() - Integer.parseInt(birthYear);
        int studentGrade = 0;
        do {
            if (age == 15) {
                studentGrade = 9;
                break;
            } else if (age == 16) {
                studentGrade = 10;
                break;
            } else if (age == 17) {
                studentGrade = 11;
                break;
            } else if (age == 18) {
                studentGrade = 12;
                break;
            } else {
                System.out.println("Student age should be between 15-18. You can not add this student...");
                System.out.println("You can click '1' if you want to return the student sub menu, or you can enter the birth year again..");
                String userInput = input.next();
                if (userInput.equals("1")) {
                    Menu.subMenu(type);
                    break;
                } else {
                    if (userInput.length() != 4) {
                        System.out.println("Incorrect year format. Please enter the birth year in this format (yyyy)");
                        birthYear = input.next();
                        age = LocalDate.now().getYear() - Integer.parseInt(birthYear);
                    } else {
                        break;
                    }
                }
            }
        } while (true);

        int studentNumber = (int) (Math.random() * 1000);

        student.setAge(age);
        student.setStudentGrade(studentGrade);
        student.setStudentNumber(studentNumber);
        Pojo.studentsList.put(student.getIdNumber(), student);

    }

    public static void listAllStudents(String type) {
        for (Map.Entry<Integer, Pojo> w : Pojo.studentsSet) {
            Pojo studentObj = Pojo.studentsList.get(w.getKey());
            System.out.printf("%-12s %-21s %-21s %-20s %-21s %-20s\n", studentObj.getIdNumber(), studentObj.getName(), studentObj.getLastName(),
                    studentObj.getAge(), studentObj.getStudentNumber(), studentObj.getStudentGrade());
        }
    }

}
