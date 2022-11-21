package OKULYONETIMSISTEMI;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pojo {

    static Map<Integer, Pojo> teachersList = new HashMap<>();

    static Set<Map.Entry<Integer, Pojo>> teachersSet = teachersList.entrySet();
    static Set<Integer> teacherIDs = teachersList.keySet();
    static Map<Integer, Pojo> studentsList = new HashMap<>();
    static Set<Map.Entry<Integer, Pojo>> studentsSet = studentsList.entrySet();
    static Set<Integer> studentIDs = studentsList.keySet();



    private int idNumber;
    public String name;
    public String lastName;
    public int age;
    private int teacherRegNumber;
    String teacherField;
    int studentGrade;
    int studentNumber;


    public Pojo() {

    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTeacherRegNumber() {
        return teacherRegNumber;
    }

    public void setTeacherRegNumber(int teacherRegNumber) {
        this.teacherRegNumber = teacherRegNumber;
    }

    public String getTeacherField() {
        return teacherField;
    }

    public void setTeacherField(String teacherField) {
        this.teacherField = teacherField;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", teacherRegNumber=" + teacherRegNumber +
                ", teacherField='" + teacherField + '\'' +
                ", studentGrade=" + studentGrade +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
