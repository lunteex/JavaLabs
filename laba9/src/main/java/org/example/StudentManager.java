package org.example;
import java.util.*;

public class StudentManager {

    public static void promoteStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double avg = student.getAverageGrade();

            if (avg < 3.0) {
                iterator.remove();
                System.out.println(student.getName() + " отчислен (средний балл: " + String.format("%.2f", avg) + ")");
            } else {
                student.setCourse(student.getCourse() + 1);
                System.out.println(student.getName() + " переведён на " + student.getCourse() + " курс (средний: " + String.format("%.2f", avg) + ")");
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("\nСтуденты на " + course + " курсе:");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("- " + student.getName() + " (группа: " + student.getGroup() + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("  Нет студентов на этом курсе.");
        }
    }
}