package org.example;

public class A {
    synchronized static void fun1(){
        System.out.println("fun1");
    }

    synchronized  void fun2(){
        System.out.println("fun2");
    }

    void fun3(){
        System.out.println("fun3");
    }

}
