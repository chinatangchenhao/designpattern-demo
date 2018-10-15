package com.dt.designpattern.iterator.pattern;

/**
 * 教室类
 */
public class Classroom implements Aggregate<Student>{

    private Student[] students;

    /**
     * last相当于是数组的长度
     */
    private int last = 0;

    public Classroom(int size) {
        this.students = new Student[size];
    }

    public Student getStudent(int index) {
        return students[index];
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students[last] = student;
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator<Student> iterator() {
        return new ClassroomIterator(this);
    }
}
