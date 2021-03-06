package com.dt.designpattern.iterator.pattern;

/**
 * 教室迭代器
 */
public class ClassroomIterator implements Iterator<Student> {

    private Classroom classroom;

    private int index;

    public ClassroomIterator(Classroom classroom) {
        this.classroom = classroom;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < classroom.getLength();
    }

    public Student next() {
        Student student = classroom.getStudent(index);
        index ++;
        return student;
    }
}
