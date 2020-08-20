package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i), 0);
        }

        int amount = 0;
        for (String s : list) {
            char[] tmp = s.toCharArray();

            for (int i = 0; i < tmp.length; i++) {
                if (map.containsKey(tmp[i])) {
                    amount = map.get(tmp[i]).intValue();
                    amount++;
                    map.put(tmp[i], amount);

                }
            }
        }


        //map.get('ё')
        for (Character character : alphabet) {
            System.out.println(character + " " + map.get(character).intValue());
        }


    }
}
