package com.company.buildings.logic;

import java.io.FileNotFoundException;

import com.company.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor, as per https://en.wikipedia.org/wiki/Utility_class.
 */

public class Neighborhood {
    public Neighborhood() {

    }

    public static void print(Building[] buildings, String header, OutputInterface out){
        out.println(header);
        out.println("------");
        for (Building building: buildings) {
            out.print(building.toString());
        }
    }

    public static int calcArea(Building[] buildings){
        int all = 0;
        for (Building building:buildings) {
            all += building.calcLotArea();
        }
        return all;
    }

    // TODO - Put your code here.
}