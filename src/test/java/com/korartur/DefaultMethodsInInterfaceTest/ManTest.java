package com.korartur.DefaultMethodsInInterfaceTest;

import org.junit.Test;

public class ManTest {

    @Test
    public void test1(){
        var man = new Man();
        man.show();
    }

    @Test
    public void test2(){
        Workable man = new Man();
        man.show();
    }

    @Test
    public void test3(){
        Restable man = new Man();
        man.show();
    }
}
