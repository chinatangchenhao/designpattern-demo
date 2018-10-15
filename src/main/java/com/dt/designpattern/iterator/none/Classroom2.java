package com.dt.designpattern.iterator.none;

import java.util.Map;

/**
 * 教室类内部集合改为Map集合
 */
public class Classroom2 {

    private Map<String, Student> students;

    public Map<String, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<String, Student> students) {
        this.students = students;
    }
}
