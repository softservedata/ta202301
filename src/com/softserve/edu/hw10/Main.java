package com.softserve.edu.hw10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JsonService myJsonService = new JsonService();
        try {
            List<String> json = myJsonService.getJson("user test {\"name\":\"Kane\"} data {\"surname\":\"Gary\"} is presenting");
            for(String property : json) {
                System.out.println(property);
            }
            myJsonService.getJson("JSON is absent in string");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
