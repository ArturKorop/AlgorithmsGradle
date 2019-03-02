package com.korartur.DefaultMethodsInInterfaceTest;

public interface Workable {
    void doWork();

    default void show(){
        System.out.println("Workable");
    }
}
