package OKULYONETIMSISTEMI;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class TeacherMethods {

    static Scanner input = new Scanner(System.in);

    public static void getTeacherAgeFieldAndRegNumber(String type, Pojo teacher) {
        System.out.println("Please enter the birth year of the " + type.toLowerCase() + " (yyyy)");
        String birthYear = input.next();
        int age = LocalDate.now().getYear() - Integer.parseInt(birthYear);
        System.out.println("Please enter the registration number of the " + type.toLowerCase());
        int regNumber = input.nextInt();
        System.out.println("Please enter the teaching field of the " + type.toLowerCase());
        String field = input.next();

        teacher.setAge(age);
        teacher.setTeacherRegNumber(regNumber);
        teacher.setTeacherField(field);

        Pojo.teachersList.put(teacher.getIdNumber(), teacher);

    }

    public static void listAllTeachers(String type) {
        for (
                Map.Entry<Integer, Pojo> w : Pojo.teachersSet) {
            Pojo teacherObj = Pojo.teachersList.get(w.getKey());
            System.out.printf("%-12s %-21s %-21s %-20s %-21s %-20s\n", teacherObj.getIdNumber(), teacherObj.getName(), teacherObj.getLastName(),
                    teacherObj.getAge(), teacherObj.getTeacherRegNumber(), teacherObj.getTeacherField());
        }
    }


}
