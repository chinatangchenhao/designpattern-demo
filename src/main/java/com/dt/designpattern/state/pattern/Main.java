package com.dt.designpattern.state.pattern;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new NewState());
        context.execute(1);
        context.execute(2);
        context.execute(3);
    }
}
