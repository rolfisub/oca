package com.rolf.test;

public class ClassA {
    private String name;
    public ClassA(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    {System.out.println("this is a weird instance initializer");}
}
