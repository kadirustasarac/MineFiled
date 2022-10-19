/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minefiled;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Abdulkadir
 */
public class MineFiled {
       static Mines mine1 = new Mines();
       static Mines mine2 = new Mines();
       static Mines mine3 = new Mines();
       static String A1 = " ",A2 = " ",A3 = " ",B1 = " ",B2 = " ",B3 = " ",C1 = " ",C2 = " ",C3 = " ",choice = "null";
       static int moveCount = 0;
       static boolean game_Cont = true;
       Random prdcRandom = new Random();
       static Scanner input = new Scanner(System.in);
       int[][] mineField = new int[3][3];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        varSet();
        InitializeGame();
    }
    static public void varSet()
    {
        mine1.mineSet();
        mine2.mineSet();
        mine3.mineSet();
        System.out.println(mine1.x +" "+ mine1.y); //debug  
        System.out.println(mine2.x +" "+ mine2.y); //debug
        System.out.println(mine3.x +" "+ mine3.y); //debug
    }
    static public void InitializeGame()
    {
        System.out.println("Welcome To the Mine Field Game !");
        System.out.println("Lets start the game");   
        while(game_Cont)
        { 
            System.out.println("    A     B    C");
            System.out.println("   ---- ---- ----");
            System.out.println("1 |  "+A1+" |  "+B1+" |  "+C1+" |");
            System.out.println("   ---- ---- ----");
            System.out.println("2 |  "+A2+" |  "+B2+" |  "+C2+" |");
            System.out.println("   ---- ---- ----");
            System.out.println("3 |  "+A3+" |  "+B3+" |  "+C3+" |");
            System.out.println("   ---- ---- ----");
            if(moveCount == 6)
            {
                System.out.println("CONGRATS YOU WIN THE GAME !!!!!");
                game_Cont = false;
                break;
            }
            System.out.println("Please Select A Place");
            choice = input.next();
            switch(choice)
            {
                case "A1":
                    if((Mines.minesX[0] == 1 && Mines.minesY[0] == 1) || (Mines.minesX[1] == 1 && Mines.minesY[1] == 1) || (Mines.minesX[2] == 1 && Mines.minesY[2] == 1))
                    {
                        game_Cont = false;
                        System.err.println("Sorry there was a mine you lost the game :( ");
                    }
                    else
                    {
                      moveCount++;
                      A1 = "X";
                    }
                    break;
                    
                    case "B1":
                    if((Mines.minesX[0] == 2 && Mines.minesY[0] == 1) || (Mines.minesX[1] == 2 && Mines.minesY[1] == 1) || (Mines.minesX[2] == 2 && Mines.minesY[2] == 1))
                    {
                        game_Cont = false;
                        System.err.println("Sorry there was a mine you lost the game :( ");
                    }
                    else
                    {
                      moveCount++;
                      B1 = "X";
                    }
                    break;
                    case "C1":
                        
                    if((Mines.minesX[0] == 3 && Mines.minesY[0] == 1) || (Mines.minesX[1] == 3 && Mines.minesY[1] == 1) || (Mines.minesX[2] == 3 && Mines.minesY[2] == 1))
                    {
                        game_Cont = false;
                        System.err.println("Sorry there was a mine you lost the game :( ");
                    }
                    else
                    {
                      moveCount++;
                      C1 = "X";
                    }
                    break;
                    case "A2":
                        
                    if((Mines.minesX[0] == 1 && Mines.minesY[0] == 2) || (Mines.minesX[1] == 1 && Mines.minesY[1] == 2) || (Mines.minesX[2] == 1 && Mines.minesY[2] == 2))
                    {
                        game_Cont = false;
                        System.err.println("Sorry there was a mine you lost the game :( ");
                    }
                    else
                    {
                      moveCount++;
                      A2 = "X";
                    }
                    break;
                    
                    case "B2":    
                    if((Mines.minesX[0] == 2 && Mines.minesY[0] == 2) || (Mines.minesX[1] == 2 && Mines.minesY[1] == 2) || (Mines.minesX[2] == 2 && Mines.minesY[2] == 2))
                    {
                        game_Cont = false;
                        System.err.println("Sorry there was a mine you lost the game :( ");
                    }
                    else
                    {
                      moveCount++;
                      B2 = "X";
                    }
                    break;
                    
                    case "C2":
                        
                    if((Mines.minesX[0] == 3 && Mines.minesY[0] == 2) || (Mines.minesX[1] == 3 && Mines.minesY[1] == 2) || (Mines.minesX[2] == 3 && Mines.minesY[2] == 2))
                    {
                        game_Cont = false;
                        System.err.println("Sorry there was a mine you lost the game :( ");
                    }
                    else
                    {
                      moveCount++;
                      C2 = "X";
                    }
                    break;
                    case "A3":
                        
                    if((Mines.minesX[0] == 1 && Mines.minesY[0] == 3) || (Mines.minesX[1] == 1 && Mines.minesY[1] == 3) || (Mines.minesX[2] == 1 && Mines.minesY[2] == 3))
                    {
                        game_Cont = false;
                        System.err.println("Sorry there was a mine you lost the game :( ");
                    }
                    else
                    {
                      moveCount++;
                      A3 = "X";
                    }
                    break;
                    case "B3":
                        
                    if((Mines.minesX[0] == 2 && Mines.minesY[0] == 3) || (Mines.minesX[1] == 2 && Mines.minesY[1] == 3) || (Mines.minesX[2] == 2 && Mines.minesY[2] == 3))
                    {
                        game_Cont = false;
                        System.err.println("Sorry there was a mine you lost the game :( ");
                    }
                    else
                    {
                      moveCount++;
                      B3 = "X";
                    }
                    break;
                    case "C3":
                        
                    if((Mines.minesX[0] == 3 && Mines.minesY[0] == 3) || (Mines.minesX[1] == 3 && Mines.minesY[1] == 3) || (Mines.minesX[2] == 3 && Mines.minesY[2] == 3))
                    {
                        game_Cont = false;
                        System.err.println("Sorry there was a mine you lost the game :( ");
                    }
                    else
                    {
                      moveCount++;
                      C3 = "X";
                    }
                    break;
            }
            
                   
            
        
        
        }
    }
    }
    
