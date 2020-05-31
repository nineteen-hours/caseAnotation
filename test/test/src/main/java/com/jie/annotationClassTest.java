package com.jie;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class annotationClassTest {
    @annotationTest(key = {"Test01","Test02"})
    public void Test01(){

    }

    public annotationClassTest() {
//        Execute();
    }

    public void Execute() throws ClassNotFoundException {
        Class aClass = Class.forName("com.jie.annotationClassTest");
        System.out.println(aClass);
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);

        }

        System.out.println("-----");

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            annotationTest annotation = declaredMethod.getAnnotation(annotationTest.class);
            if (annotation != null) {
                System.out.println(annotation.key());
                String[] key = annotation.key();
                for (String s : key) {
                    System.out.println(s);
                }
            }
        }

    }

    public  void Execute(Class cl){
        Annotation[] annotations = cl.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);

        }

        System.out.println("-----");

        Method[] declaredMethods = cl.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            annotationTest annotation = declaredMethod.getAnnotation(annotationTest.class);
            if (annotation != null) {
                System.out.println(annotation.key());
                String[] key = annotation.key();
                for (String s : key) {
                    System.out.println(s);
                }
            }
        }
    }
}
