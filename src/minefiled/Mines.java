/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minefiled;
import java.util.Random;

/**
 *
 * @author Abdulkadir
 */
public class Mines 
{
   static public int[] minesX = new int[3];
   static public int[] minesY = new int[3];
   public int x,y;
   private boolean isOK = true;
    public Mines()
   {
       
   }
    public void mineSet()
    {
        while(isOK)
        {
       boolean checkMine = true;
       Random rndmLoc = new Random();
       this.x = rndmLoc.nextInt(1,4);
       this.y = rndmLoc.nextInt(1,4);
       for(int i = 0;i <= 2;i++)
       {
           if(minesX[i] == this.x && minesY[i] == this.y)
           {
             checkMine = false;
           }
       }
       if(checkMine)
       {
           for(int k = 0;k <=2;k++)
           {
               if(minesX[k] == 0 && minesY[k] == 0)
               {
                     minesX[k] = this.x;
                     minesY[k] = this.y;
                     isOK = false;
                     break;
               }
           }
       }
        }
       
    }
   
}

          /*if(minesX[i] != this.x && minesY[i] != this.y && minesY[i] == 0)
            {
              minesX[i] = this.x;
              minesY[i] = this.y;
              isOK = false;
              break;
            }  
*/