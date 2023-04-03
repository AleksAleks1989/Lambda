package org.example;

//import jdk.incubator.vector.VectorOperators;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Main {
    public Main(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
Consumer<String> sayable =Main::new;
sayable.accept("Hello I am static");

    }

//    private static void saySomething(String s) {
//        System.out.println(s);
//    }
}




//@FunctionalInterface
//interface ISum {
//    int sum(int a, int b);
//}

