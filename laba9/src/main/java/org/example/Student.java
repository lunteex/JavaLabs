package org.example;
import java.util.*;

class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void addGrade(String subject, int grade) {
        if (grade >= 2 && grade <= 5) {
            grades.put(subject, grade);
        }
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        return grades.values().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Имя='" + name + '\'' +
                ", Группа='" + group + '\'' +
                ", Курс=" + course +
                ", Средний балл=" + String.format("%.2f", getAverageGrade()) +
                '}';
    }
}