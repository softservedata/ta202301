package com.softserve.edu.hw10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JsonService myJsonService = new JsonService();
        try {
            List<String> jsons = myJsonService.getJson("this is beautiful {\"action\":\"review\"} test {\"decision\":\"table\"}texting");
            System.out.println(jsons);
            myJsonService.getJson("this text has no json parts");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
