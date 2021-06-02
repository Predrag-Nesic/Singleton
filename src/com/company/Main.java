package com.company;

public class Main {

    public static void main(String[] args) {
//        This cannot be done...
//        Unikat u1 = new Unikat();

        Unique u1 = Unique.Specimen();
        System.out.println(u1);

        Unique u2 = Unique.Specimen();
        System.out.println(u2);

        // In order to check if the object are same, we can check like so...

        if(Unique.same(u1, u2)) {
            System.out.println("Objects are the same.");
        } else {
            System.out.println("Objects are not the same.");
        }

        Unique u3 = Unique.Specimen();
        System.out.println(u1);

        Unique u4 = Unique.Specimen();
        System.out.println(u2);

        if(Unique.same(u1, u4)) {
            System.out.println("Objects are the same.");
        } else {
            System.out.println("Objects are not the same.");
        }
    }
}



class Unique {
//    This is an example of one of the design patterns, the goal is to make one object and all the references to show to
//    this specific object, which is static and mutual to all;
    public static Unique specimen = null;

    private Unique() {

    }

    // In order to do so, we need one static attribute for all, and a private constructor, and a static method to call upon
    // that specific constructor

    public static Unique Specimen() {
        if(specimen == null) {
            specimen = new Unique();
        }
        return specimen;
    }

    public static boolean same(Unique a, Unique b) {
        return a == b;
    }


}
