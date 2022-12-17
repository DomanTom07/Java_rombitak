/*
* File: ErrorController.java
* Author: Tamás Domán
* Copyright: 2022, Tamás Domán
* Group: Szoft II N
* Date: 2022-12-17
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

package controllers;

import views.IOPanel;
import views.MainWindow;

public class ErrorController {
    public static boolean checkForErrors(MainWindow mainWindow, IOPanel sidePanel, IOPanel anglePanel) {
        if (checkInputEmpty(mainWindow)) return true;
        else if (checkInputNotNumber(sidePanel, anglePanel, mainWindow)) return true;
        else if (checkAngleValue(mainWindow)) return true;
        else return false;
    }
    private static boolean checkInputEmpty(MainWindow mainWindow) {
        if (mainWindow.sidePanel.ioField.getText().equals("") ||
        mainWindow.anglePanel.ioField.getText().equals("")) {
            showEmptyError(mainWindow);
            return true;
        } else return false;
    }
    private static void showEmptyError(MainWindow mainWindow) {
        mainWindow.sidePanel.ioField.setText("Töltse ki mindkét mezőt!");
        mainWindow.anglePanel.ioField.setText("Töltse ki mindkét mezőt!");
    }
    private static boolean checkInputNotNumber(IOPanel sidePanel, IOPanel anglePanel, MainWindow mainWindow) {
        if (isNumber(sidePanel) && isNumber(anglePanel)) return false;
        showNumberError(mainWindow);
        return true;
    }
    private static boolean isNumber(IOPanel ioPanel) {
        try {
            tryIsNumber(ioPanel);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static void tryIsNumber(IOPanel ioPanel) throws NumberFormatException {
        Double.parseDouble(ioPanel.ioField.getText());
    }
    private static void showNumberError(MainWindow mainWindow) {
        mainWindow.sidePanel.ioField.setText("Számokat adjon meg!");
        mainWindow.anglePanel.ioField.setText("Számokat adjon meg!");
    }
    private static boolean checkAngleValue(MainWindow mainWindow) {
        if (Double.parseDouble(mainWindow.anglePanel.ioField.getText()) >= 180) {
            showAngleError(mainWindow);
            return true;
        } else return false;
    }
    private static void showAngleError(MainWindow mainWindow) {
        mainWindow.anglePanel.ioField.setText("180-nál kisebb számot adjon meg!");
    }
}
