package com.jie;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class staticAnnotationClass {
    public staticAnnotationClass() {
    }
    @annotationTest(key = {"dd","dsd"})
    public  static void   Test01(){

    }

    static {
        try {
            Execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void Execute() throws ClassNotFoundException {
        Class aClass = Class.forName("com.jie.staticAnnotationClass");
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

    }}
