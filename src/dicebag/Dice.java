/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dicebag;

import java.util.Scanner;

/**
 *
 * @author chasz
 */
public class Dice {
    Scanner scnr = new Scanner(System.in);
    private int numDice;
    private int numSides;
    private int roll;
    private int numRolls;
    public Dice(){
        System.out.print("How many dice: ");
        try{
            this.numDice = scnr.nextInt();
        }catch(Exception e){
            System.out.println("wasnt a number");
        }

        System.out.print("How many sides: ");
        try{
            this.numSides = scnr.nextInt();
        }catch(Exception e){
            System.out.println("wasnt a number");
        }
        System.out.println("You added a " + this.numDice + "d" + this.numSides + "!");
    }
    public void roll(){
        this.numRolls = this.numDice;
        while(this.numRolls > 0){
            this.roll = (int)(Math.random() * this.numSides) + 1;
            this.numRolls--;
            System.out.println("Your D" + this.numSides + " rolled a " + roll);
        }
    }
}
