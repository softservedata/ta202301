package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonService {
    public List<String> getJson(String text) {
        Pattern pattern = Pattern.compile("\\{(?:[^{}]|(\\?R))*}");
        Matcher matcher = pattern.matcher(text);
        List<String> groups = new ArrayList<>();
        while (matcher.find()) {
            groups.add(matcher.group());
        }
        if (groups.isEmpty()){
            throw new IllegalArgumentException("Invalid input text");
        }
        return groups;
    }
}
