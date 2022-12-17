/*
* File: CalcController.java
* Author: Tamás Domán
* Copyright: 2022, Tamás Domán
* Group: Szoft II N
* Date: 2022-12-17
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

package controllers;

public class CalcController {
    public static double calcPerimeter(double side) {
        return side * 4;
    }
    public static double calcArea(double side, double angle) {
        return Math.pow(side, 2) * Math.sin(Math.toRadians(angle));
    }
}
