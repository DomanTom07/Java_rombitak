/*
* File: MainWindow.java
* Author: Tamás Domán
* Copyright: 2022, Tamás Domán
* Group: Szoft II N
* Date: 2022-12-17
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

package views;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
    public IOPanel sidePanel;
    public IOPanel anglePanel;
    public ButtonsPanel buttonsPanel;
    public IOPanel perimeterPanel;
    public IOPanel areaPanel;
    public MainWindow() {
        initComponents();
        addComponentsToWindow();
        initWindow();
    }
    private void initComponents() {
        this.setInputPanels();
        this.buttonsPanel = new ButtonsPanel();
        this.setOutputPanels();
    }
    private void setInputPanels() {
        this.sidePanel = new IOPanel();
        this.sidePanel.setLabelText("A oldal: ");
        this.anglePanel = new IOPanel();
        this.anglePanel.setLabelText("Alfa szög (fokban): ");
    }
    private void setOutputPanels() {
        this.perimeterPanel = new IOPanel();
        this.perimeterPanel.setLabelText("Kerület:");
        this.areaPanel = new IOPanel();
        this.areaPanel.setLabelText("Terület:");
    }
    private void addComponentsToWindow() {
        this.add(sidePanel);
        this.add(anglePanel);
        this.add(buttonsPanel);
        this.add(perimeterPanel);
        this.add(areaPanel);
    }
    private void initWindow() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 200);
        this.setTitle("Rombitak");
        this.setVisible(true);
    }
}
