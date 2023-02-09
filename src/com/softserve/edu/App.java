package com.softserve.edu;
import com.softserve.edu.hw3.Pair; // import was added in scope of HW03
import com.softserve.edu01.A;

public class App {
    private int i = 12;
    private static int j = 456;

    public void m1() {
        System.out.println("i = " + i);
        j++;
    }

    /**
     *  <b>JavaDoc</b> <font color='green'>Comment</font>
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello");
        int k = 5;
        String s = "abc"; // new String("abc");
        k = k + 1;
//        var s1 = "qwerty";
//        s = s+ s1;
//        System.out.println("s = " + s + "  s1 type = " + s1.getClass().getName());
        //
        /* This is a sample class which is used to demonstrate the use of multi-line comments.
         * This comment does not appear in the java documentation
         */
        //
        System.out.println("k = " + k + "  j = " + j);
        //
        App app1 = new App();
        System.out.println("app1.i = " + app1.i);
        //
        App app2 = new App();
        app2.i = 14;
        System.out.println("app2.i = " + app2.i);
        //
        app1.m1();
        app2.m1();
        System.out.println("j = " + j); // App.j; app1.j;
        //
        A a = new A();
        a.m1();
        com.softserve.edu02.A a2 = new com.softserve.edu02.A();
        a2.m1();

        //adding the code according to the HW03
        Pair pair1 = new Pair(10, 5);
        pair1.print();
    }
}
