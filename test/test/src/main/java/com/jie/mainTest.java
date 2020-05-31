package com.jie;

import java.lang.annotation.Annotation;

public class mainTest {
    public static void main(String[] args) throws ClassNotFoundException {
        annotationClassTest aTest = new annotationClassTest();
        aTest.Execute();
        Execute();
    }

    public static void Execute() throws ClassNotFoundException {
        Class aClass = Class.forName("com.jie.annotationClassTest");
        System.out.println(aClass);
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        System.out.println("-----");

        Annotation[] declaredAnnotations = aClass.getDeclaredAnnotations();
        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println(declaredAnnotation);
        }
    }
}
