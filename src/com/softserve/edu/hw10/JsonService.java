package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonService {
    public List <String> getJson(String input){
        Pattern validationPattern = Pattern.compile("\\{(?:[^{}]|(\\{(?:[^{}]|(\\{(?:[^{}]|(\\{(?:[^{}]|)*}))*}))*}))*}");
        Matcher validationMatcher = validationPattern.matcher(input);
        List<String> list = new ArrayList<>();
        while (validationMatcher.find()) {
            list.add(validationMatcher.group());
        }
        if (list.isEmpty()){
            throw new IllegalArgumentException("The input is not in JSON format");
        }
        return list;
    }
}
