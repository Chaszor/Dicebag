/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dicebag;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chasz
 */
public class Game {
    Scanner scnr = new Scanner(System.in);
    ArrayList<Dice> dicebag = new ArrayList<>();
    private String name;
    private int menuChoice;
    private boolean isDone;
    public Game(){
        System.out.println("Welcome to your Dicebag!");
        System.out.print("What is your name?: ");
        name = scnr.nextLine();
    }
    public void start(){
        isDone = false;
        System.out.println(name + ", we have given you a dice bag, what would you like to do?");
        System.out.println("1) Add Dice, 2) Clear Dice, 3) Roll Dice");
        menuChoice = scnr.nextInt();
        while (menuChoice > 0 && menuChoice < 4){    
            switch(menuChoice){
                case 1:
                    //System.out.println(menuChoice + " was selected");
                    dicebag.add(new Dice());
                    break;
                case 2:
                    //System.out.println(menuChoice + " was selected");
                    dicebag.clear();
                    break;
                case 3:
                    //System.out.println(menuChoice + " was selected");
                    dicebag.forEach(Dice -> {
                        Dice.roll();
                    });
                    break;
            }
            System.out.println("What would you like to do?");
            System.out.print("1) Add Dice, 2) Clear Dice, 3) Roll Dice : ");
            menuChoice = scnr.nextInt();   
        }
    }
}
