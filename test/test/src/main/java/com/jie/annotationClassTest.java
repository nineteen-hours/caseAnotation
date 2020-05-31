package com.jie;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class annotationClassTest {
    @annotationTest(key = {"Test01","Test02"})
    public void Test01(){

    }

    public annotationClassTest() {


    }

    public void Execute(){
        Class aClass = this.getClass();
        System.out.println(aClass);
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        System.out.println("-----");

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            Annotation[] declaredAnnotations = declaredMethod.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                System.out.println(declaredAnnotation);
            }
        }

    }
}
