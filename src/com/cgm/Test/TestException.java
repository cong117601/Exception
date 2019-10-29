package com.cgm.Test;

public class TestException {

    public static void a() throws MyException {
        throw new MyException("你出现了编译时异常");

    }
    public static void b() throws RuntimeMyException{
        throw new RuntimeMyException("你出现了运行时异常");
    }

    public static void main(String[] args) throws MyException, RuntimeMyException {
       // a();
        b();
    }
}
