package com.jie;

public class childClassAnnotation extends annotationClassTest {
    @annotationTest(key = {"ke2"})
    public void test02(){

    }

    @Override
    public void Execute() throws ClassNotFoundException {
        super.Execute();
        Execute(this.getClass());
    }
}
