package com;

import java.util.Scanner;
import java.util.Random;

class Game{
    private int Number;

    private int GuessNumber;
    private int Attempt=0;

    Game(){
        Random rad= new Random();
        Number= rad.nextInt(50);
    }

    void takeUserInput(){
        System.out.print("Guess The Number: ");
        Scanner sc= new Scanner(System.in);
        GuessNumber= sc.nextInt();
    }
    Boolean isCorrectNumber(){
        Attempt++;
        if (GuessNumber==Number){
            System.out.println("Your Guess is Right..");
            System.out.printf("You Guess the number in %d attempts.",Attempt);
            return true;
        }
        else if (GuessNumber>Number){
            System.out.println();
            System.out.println("Guess Is High");
        }
        else if (GuessNumber<Number){
            System.out.println();
            System.out.println("Guess Is Low");
        }
        return false;
    }
    void showNumber(){
        System.out.println("Right Number is: "+Number);
    }
}
public class Guess_Number {
    public static void main(String[] args) {
    Game gn= new Game();
    int c=5;
    boolean check=true;
    boolean b=true;
    while (c>0){
        System.out.printf("You have %d attempts..\n",c);
        gn.takeUserInput();
        b=gn.isCorrectNumber();
        c--;
        if (check==b)
            break;
        }
        if (check==b){
            System.out.println("Keep Playing..");
        }
        else {
            gn.showNumber();
        }
    }
}
