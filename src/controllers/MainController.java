/*
* File: MainController.java
* Author: Tamás Domán
* Copyright: 2022, Tamás Domán
* Group: Szoft II N
* Date: 2022-12-17
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

package controllers;

import javax.swing.JOptionPane;

import views.MainWindow;

public class MainController {
    MainWindow mainWindow;
    public MainController() {
        this.mainWindow = new MainWindow();
        this.mainWindow.buttonsPanel.calcButton.addActionListener(e -> {
            this.onClickCalcButton();
        });
        this.mainWindow.buttonsPanel.emptyButton.addActionListener(e -> {
            this.onClickEmptyButton();
        });
        this.mainWindow.buttonsPanel.aboutButton.addActionListener(e -> {
            this.onClickAboutButton();
        });
    }
    private void onClickCalcButton() {
        if (!ErrorController.checkForErrors(this.mainWindow, this.mainWindow.sidePanel, this.mainWindow.anglePanel)) {
            this.calcResult();
        }
    }
    public void calcResult() {
        double side = Double.parseDouble(this.mainWindow.sidePanel.ioField.getText());
        double angle = Double.parseDouble(this.mainWindow.anglePanel.ioField.getText());
        Double perimeter = CalcController.calcPerimeter(side);
        Double area = CalcController.calcArea(side, angle);
        this.showResult(perimeter, area);
    }
    public void showResult(Double perimeter, Double area) {
        this.mainWindow.perimeterPanel.ioField.setText(perimeter.toString());
        this.mainWindow.perimeterPanel.ioField.setEditable(false);
        this.mainWindow.areaPanel.ioField.setText(area.toString());
        this.mainWindow.areaPanel.ioField.setEditable(false);
    }
    private void onClickEmptyButton() {
        this.mainWindow.sidePanel.ioField.setText("");
        this.mainWindow.anglePanel.ioField.setText("");
        this.mainWindow.perimeterPanel.ioField.setText("");
        this.mainWindow.areaPanel.ioField.setText("");
    }
    private void onClickAboutButton() {
        String about = "Program: Rombitak\nVerzió: 1.1\nKészítette: Tamás Domán,\nSzoft II N,\n2022-12-17";
        JOptionPane.showMessageDialog(this.mainWindow.getContentPane(), about);
    }
}
