package com.itvdn.javaEssential.anonymous.ex002_anonymous_classes;

/**
 * Анонимные классы.
 */
interface Interface {
    void method(int m);
    void method2(int m);
}

public class Main {
    public static void main(String[] args) {
        // Объявление анонимного (внутреннего) класса
        Interface instance = new Interface() {
            public double d = 1.3;
            protected String str = "Anonymous class";
            private int num = 10;

            @Override
            public void method(int m) {
                num = 1234;
                System.out.println("instance1: d = " + d + ", str = " + str + ", num = " + num+" m= "+m);
            }
            public void method2(int m) {
                num = 1234;
                System.out.println("instance12: d = " + d + ", str = " + str + ", num = " + num+" m= "+m);
            }
        };
        instance.method2(5);
        instance.method(6);
int m=4;
instance.method(m);
        // Поле не доступно
        // System.out.println(instance.d);
    }
}
