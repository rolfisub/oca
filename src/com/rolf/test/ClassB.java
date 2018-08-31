package com.rolf.test;

interface rolf {
    String rolfi = "a";
}

public class ClassB implements rolf {


    public static void main (String[] args) {
        ClassA a = new ClassA(args[0]);
        System.out.println(a.getName());
        System.out.println(rolfi);
    }
}
