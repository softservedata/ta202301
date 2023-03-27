package com.softserve.hw10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JSONService newJSON = new JSONService();

        try {
            List<String> json = newJSON.getJSON("[{\"outputType\":{\"type\":\"APK\"},\"apkData\":{\"type\":\"MAIN\",\"splits\":[],\"versionCode\":4,\"versionName\":\"1.4.0.0\",\"enabled\":true,\"outputFile\":\"AppKinetics-SaveEditService-App-debug.apk\",\"fullName\":\"AppDebug\",\"baseName\":\"App-debug\",\"dirName\":\"\"},\"path\":\"AppKinetics-SaveEditService-App-debug.apk\",\"properties\":{}}]");
            System.out.println(json);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
