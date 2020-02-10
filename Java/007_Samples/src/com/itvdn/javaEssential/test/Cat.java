package com.itvdn.javaEssential.test;

public class Cat {
    String name;
    Cat(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Cat c1=new Cat("Barsick");
        Cat c2=new Cat("Barsick");
        if (c1==c2){
            System.out.println("Cat's equals");

        }else {
            System.out.println("They're not equals");
        }
    }
}
