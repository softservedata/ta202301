package com.softserve.edu03;

public class AppStud {
    private static int k = 123;

    static {
        System.out.println("AppStud, static block, k = " + k);
        k = 456;
        System.out.println("AppStud, updated, k = " + k);
    }

    public static void main(String[] args) {
        System.out.println("START ...");
        //
        Student st = new Student("Ivan", "Ivanov", 30);
        st.print();
        st.print("Hello");
        //
        Student st2 = new Student("Petro", "Petrov", 29);
        st2.print();
        st2.setFirstName("Abc");
        st2.print();
        //
        //System.out.println("Count = " + st.getCount()); // Invalid Solution
        System.out.println("Count = " + Student.getCount());
        //
        System.out.println("Object st = " + st.toString());
    }
}
