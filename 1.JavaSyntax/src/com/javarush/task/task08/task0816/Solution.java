package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Аталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Италлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Таллоне", dateFormat.parse("MAY 1 2012"));
        map.put("Апалонне", dateFormat.parse("MAY 1 2012"));
        map.put("ТУРУРУ", dateFormat.parse("MAY 1 2012"));
        map.put("Феофане", dateFormat.parse("MAY 1 2012"));
        map.put("Заебало", dateFormat.parse("MAY 1 2012"));
        map.put("Программировать", dateFormat.parse("JUN 1 2012"));
        map.put("Неполучаеца", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){

            Date month = iterator.next().getValue();
            int monthNum = month.getMonth() + 1;
            if (monthNum>5 && monthNum<9){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> myMap = createMap();
        removeAllSummerPeople(myMap);

    }
}
