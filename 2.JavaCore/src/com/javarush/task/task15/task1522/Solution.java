package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }


    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String planetName = reader.readLine();
            switch (planetName){
                case (Planet.EARTH):
                    thePlanet = Earth.getInstance();
                    break;
                case (Planet.MOON):
                    thePlanet = Moon.getInstance();
                    break;
                case (Planet.SUN):
                    thePlanet = Sun.getInstance();
                    break;
                default:
                    thePlanet = null;
                    break;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
