package com.softserve.edu03;

class Person { // extends Object by Default
    private String name;
}

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private static int count = 123;

    static {
        System.out.println("Student, static block, count = " + count);
        count = 0;
        System.out.println("Student, updated, count = " + count);
    }

    public Student() {  // Overload
        firstName = "";
        lastName = "";
        age = 0;
        count = count + 1;
        System.out.println("Student Default Constructor done");
    }

    public Student(String firstName, String lastName, int age) { // Overload
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.println("Student Constructor done");
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 2) {
            this.firstName = firstName;
        } else {
            System.out.println("Invalid firstName");
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        // check permission
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static int getCount() {
        return count;
    }

    // Overload
    public void print() {
        System.out.println("FirstName = " + getFirstName());
    }

    // Overload
    public void print(String msg) {
        System.out.println(msg + " FirstName = " + getFirstName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
