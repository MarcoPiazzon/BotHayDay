package com.company;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.util.Random;

import static java.awt.event.InputEvent.*;

public class Main {
    public static final int FIVE_SECONDS = 5000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        Random random = new Random();
        //Imposta();
        //Semina();
        Raccogli();
        /*while (true) {
            Raccogli();
            robot.mouseMove(MAX_X, MAX_Y);
            Thread.sleep(FIVE_SECONDS);
        }*/
    }

    public static void Imposta() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        int inizio_X = 1300;
        int inizio_Y = 1200;
        robot.mouseMove(500,500);
        robot.mousePress(BUTTON1_DOWN_MASK);
        robot.mouseMove(2000,2000);
        robot.mouseRelease(BUTTON1_DOWN_MASK);
        Thread.sleep(4000);

    }

    public static void Semina() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        int inizio_X = 1200;
        int inizio_Y = 1250;
        robot.mouseMove(inizio_X,inizio_Y); // prendo il primo pezzo di terra
        robot.mousePress(BUTTON1_DOWN_MASK);
        robot.mouseRelease(BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        robot.mouseMove(1000,900); // seleziono il grano
        robot.mousePress(BUTTON1_DOWN_MASK);
        int a = 1200;
        int b = 1130;
        for (int i = 0; i < 8; i++) {
            Thread.sleep(500);
            robot.mouseMove(a,b);
            a+=90;
            b-=40;
        }

    }

    public static void Raccogli() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        int inizio_X = 1210;
        int inizio_Y = 1240;
        robot.mouseMove(inizio_X,inizio_Y); //va sul pezzo da tagliare
        robot.mousePress(BUTTON1_DOWN_MASK);
        robot.mouseRelease(BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        robot.mouseMove(1000,inizio_Y);//va verso l'acetta
        robot.mousePress(BUTTON1_DOWN_MASK);
        robot.mouseMove(inizio_X,inizio_Y);//ritorna all'inizio
    }

    public static void Vendi(){

    }
}
