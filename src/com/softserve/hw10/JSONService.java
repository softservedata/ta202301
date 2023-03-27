package com.softserve.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Homework 10 (from 03.03.2023)
1) В класі JsonService написати метод List<String> getJson(String text) в якому з текстової стрічки text видобути всі підстрічки, які відповідають формату JSON та повернути їх у списку типу ArrayList.
   Якщо стрічка не міститиме жодної валідної підстрічки у форматі JSON, викинути IllegalArgumentException з повідомлення про невалідний вхідний текст.
   В основній програмі створити об'єкт класу JsonService та перевірити функціонал методу getJson викликаючи його з коректними та некоректними даними.
   Скористатися регулярними виразами.
   Для коду використати пакет com.softserve.homework10
   Запушати код на github у свою вітку.
 */
public class JSONService {
    public List<String> getJSON (String text) {
        Pattern pattern = Pattern.compile("\\{(?:[^{}]|(\\?R))*}");
        Matcher matcher = pattern.matcher(text);
        List<String> list = new ArrayList<>();

        while (matcher.find()) {
            list.add(matcher.group());
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Input text is invalid");
        }
        return list;
    }
}
