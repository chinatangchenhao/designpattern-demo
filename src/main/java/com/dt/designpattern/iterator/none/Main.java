package com.dt.designpattern.iterator.none;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final void main(String[] args) {
        // fun1();
        fun2();
    }

    public static void fun1() {
        Student student1 = new Student("小明");
        Student student2 = new Student("小王");

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        Classroom classroom = new Classroom();
        classroom.setStudents(students);

        Student[] resultStudents = classroom.getStudents();
        for(Student resultStudent: resultStudents) {
            System.out.println(resultStudent);
        }
    }

    public static void fun2() {
        Student student1 = new Student("小明");
        Student student2 = new Student("小王");

        Map<String, Student> students = new HashMap<String, Student>();
        students.put(student1.getName(), student1);
        students.put(student2.getName(), student2);

        Classroom2 classroom = new Classroom2();
        classroom.setStudents(students);

        Map<String, Student> resultStudents = classroom.getStudents();
        for(Student resultStudent : resultStudents.values()) {
            System.out.println(resultStudent);
        }
    }
}
