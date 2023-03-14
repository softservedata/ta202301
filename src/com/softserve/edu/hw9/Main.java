package com.softserve.edu.hw9;

import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("arr");
//        StringBuilder res = m1(s);
//        System.out.println(res);
//        ======

        char[] ListOfChars = {'3', 'a', 'd', 'f'};

        for (char listOfChar : ListOfChars) {
            System.out.println(listOfChar + " ");
        }
//        ========

        String str = "I study Java Kava language abc";
        int n = str.indexOf("ava");

//        System.out.println("ava n = " + n);
        char c = str.charAt(8);
//        System.out.println("c = " + c);
        n = -1;
        while ((n = str.indexOf("ava", n + 1)) >= 0 ) {
            System.out.println("n = " + n);
        }

        String str2 = str.substring(13);
//        System.out.println("str2 = " + str2);
        str2 = str2.toUpperCase();
//        System.out.println("new str2 = " + str2);

//        =======

        String s1 = "  \t\t Tabulated String \t\n\n  ";
        s1 = s1.trim();
        System.out.println(s1);

//        ======

        String str6 = "abracadabra abba";
//        str6 = str6.replaceAll("a\\b", "--");
//        str6 = str6.replaceAll("\\Ba\\B", "--");
        str6 = str6.replaceFirst("b", "--");
        System.out.println(str6);

        char sss[ ] = {'J', 'a', 'v', 'a'};
        String str0 = new String(sss);
        if(!str0.isEmpty()) {
            String num = String.valueOf(8);
            str0 = str0.toUpperCase();
            str0 = str0.concat('-' + num);
            System.out.println(str0);
        }

        String text = "letter abba work abtc";

        String pattern = "[bt]{2}";
        String pattern1 = "(\\w)\\1";
        String pattern2 = "\\b\\w*([c\\w])\\1\\w*\\b";

        System.out.println(text.matches(pattern1));

        String html = "<p><b>Beginning with bold text</b> net, <span>text</span> body<p>";

        String patternTag = ">[^><]+<";


    }




    public static StringBuilder m1(StringBuilder s){
        StringBuilder str = new StringBuilder();
        str.append(s);
        str.append("ay");
        System.out.println(str);

     return str;
    }
}
