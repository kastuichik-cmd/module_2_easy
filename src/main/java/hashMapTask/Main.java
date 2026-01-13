package hashMapTask;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        addStudent(students, new Student("1", "Павел", 20));
        addStudent(students, new Student("2", "Света", 22));
        addStudent(students, new Student("3", "Алиса", 19));

        Student foundStudent = findStudentById(students, "2");
        System.out.println("Найден студент: " + foundStudent);

        removeStudentById(students, "1");

        System.out.println("Все студенты после удаления:");
        students.values().forEach(System.out::println);
    }

    static void addStudent(Map<String, Student> students, Student student) {
        students.put(student.getStudentId(), student);
    }

    static Student findStudentById(Map<String, Student> students, String studentId) {
        return students.get(studentId);
    }

    static void removeStudentById(Map<String, Student> students, String studentId) {
        students.remove(studentId);
    }


}
