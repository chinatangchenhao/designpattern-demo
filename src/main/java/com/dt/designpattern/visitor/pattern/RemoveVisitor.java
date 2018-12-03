package com.dt.designpattern.visitor.pattern;

public class RemoveVisitor implements Visitor {

    public void visit(Department dept) {
        if(dept.getChildren().size() > 0) {
            for(Department child : dept.getChildren()) {
                child.accept(this);
            }
        }
        System.out.println("删除部门【" + dept.getName() + "】");
    }

}
