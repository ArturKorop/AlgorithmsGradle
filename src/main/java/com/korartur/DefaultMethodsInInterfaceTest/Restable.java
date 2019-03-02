package com.korartur.DefaultMethodsInInterfaceTest;

public interface Restable {
    void rest();

    default void show(){
        System.out.println("Restable");
    }
}
