package com.korartur.DefaultMethodsInInterfaceTest;

import javafx.beans.value.WritableObjectValue;

public class Man implements Workable, Restable{

    @Override
    public void rest() {
        System.out.println("I do my work");
    }

    @Override
    public void doWork() {
        System.out.println("I have my rest");
    }

    @Override
    public void show(){
        System.out.println("I am man");
        Workable.super.show();
        Restable.super.show();
    }

}
