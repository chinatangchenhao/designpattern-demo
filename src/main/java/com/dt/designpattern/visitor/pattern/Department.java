package com.dt.designpattern.visitor.pattern;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;

    private List<Department> children = new ArrayList<Department>();

    public Department(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Department> getChildren() {
        return children;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChildren(List<Department> children) {
        this.children = children;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
