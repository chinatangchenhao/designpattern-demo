package com.dt.designpattern.iterator.pattern;

public class Main {
    public static final void main(String[] args) {
        Student student1 = new Student("小明");
        Student student2 = new Student("小王");

        Classroom classroom = new Classroom(2);
        classroom.addStudent(student1);
        classroom.addStudent(student2);

        Iterator<Student> iterator = classroom.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student);
        }
    }
}
