package com.dt.designpattern.command.pattern;

public class Main {

    public static final void main(String[] args) {
        Command commandA = new CommandA();
        Command commandB = new CommandB();

        Invoker invoker = new Invoker();

        invoker.setCommand(commandA);
        invoker.execute();

        invoker.setCommand(commandB);
        invoker.execute();

    }

}
